package ma.education.tp5.collections;
import java.util.Comparator;
public class CodeComparator implements Comparator<Client> {
@Override
public int compare(Client o1, Client o2) {
return o1.code-o2.code;
}
}