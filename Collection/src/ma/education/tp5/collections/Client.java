package ma.education.tp5.collections;
import java.util.Comparator;
	
public class Client implements Comparable{
//		Integer code;
//		String name;
//		public Client(Integer code, String name) {
//		this.code = code;
//		this.name = name;
//		}
//		@Override
//		public String toString() {
//		return "Client{" +
//		"code=" + code +
//		", name='" + name + '\'' +
//		'}';
//		}
//		
//		@Override
//		public boolean equals(Object o) {
//		Client client = (Client) o;
//		return this.code==client.code && this.name.equals(client.name);
//		}
//		@Override
//		public int hashCode() {
//		return code;
//		}
		//--------------
	
//		Integer code;
//		String name;
//		
//		public Client(Integer code, String name) {
//		this.code = code;
//		this.name = name;
//		}
//		@Override
//		public String toString() {
//		return "Client{" +
//		"code=" + code +
//		", name='" + name + '\'' +
//		'}';
//		}
//		public int compareTo(Object o) {
//		Client client = (Client) o;
//		return -client.code+this.code;
//		}
//  ----------------------------------------------------------
	Integer code;
	String name;
	public Client(Integer code, String name) {
	this.code = code;
	this.name = name;
	}
	@Override
	public String toString() {
	return "Client{" +
	"code=" + code +
	", name='" + name + '\'' +
	'}';
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
