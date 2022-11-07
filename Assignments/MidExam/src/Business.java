import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Business {
	private String name;
	private String address;
	private Person owner;
	private String postalCode;
	private List<Person> customers;
}
