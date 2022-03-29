package ma.cigma.FrontEndv1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import ma.cigma.FrontEndv1.models.CLIENT;

import java.util.List;

@Controller
public class CLIENTCONTROLLER {

	@Value("${api.url}")
	private String apiUrl;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = { "/", "/clients" })
	public String home(Model model) {
		model.addAttribute("client", new CLIENT());
		@SuppressWarnings({"unchecked"})
		List<CLIENT> clients = restTemplate.getForObject(apiUrl + "/clients/all", List.class);
		model.addAttribute("clients", clients);
		return "index-client";
	}

	@PostMapping(value = "/add-client")
	public String addClient(Model model, @ModelAttribute("client") CLIENT client) {
		restTemplate.postForObject(apiUrl + "/clients/add", client, CLIENT.class);
		return "redirect:/clients";
	}

	@GetMapping(value = { "/delete-client/{id}" })
	public String deleteClientById(Model model, @PathVariable long id) {
		restTemplate.delete(apiUrl + "/clients/" + id);
		return "redirect:/clients";
	}

	@GetMapping(value = { "/update/{id}" })
	public String updateClient(Model model, @PathVariable long id, @ModelAttribute("client") CLIENT client) {
		try {
			restTemplate.postForObject(apiUrl + "/update/" + id, client, CLIENT.class);
			return "redirect:clients";
		} catch (Exception e) {
			String errString = e.getMessage();
			model.addAttribute(errString);
			return "index-client";
		}
	}

}
