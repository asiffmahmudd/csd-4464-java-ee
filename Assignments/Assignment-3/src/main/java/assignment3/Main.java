package assignment3;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Person> personList = new ArrayList<Person>();
		personList = mapper.readValue(new File("persons.json"),
				new TypeReference<List<Person>>(){});

		System.out.println(personList);
		
		List<BlogPost> blogList = new ArrayList<>();
		blogList = mapper.readValue(new File("blogPosts.json"),
				new TypeReference<List<BlogPost>>(){});

		System.out.println(blogList);

	}
}
