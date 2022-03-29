package ma.cigma.FrontEndv1.models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CLIENT {
private long id;
private String name;
public CLIENT() {
}
public CLIENT(long id, String name) {
this.id = id;
this.name = name;
}
}