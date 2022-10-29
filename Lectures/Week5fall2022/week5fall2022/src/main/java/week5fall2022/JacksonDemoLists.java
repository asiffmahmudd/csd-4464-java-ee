package week5fall2022;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemoLists {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		/*
		PersonVanilla person1 = new PersonVanilla("joe bob", 23, "big joe");
		PersonVanilla person2 = new PersonVanilla("joe smoe", 24, "small joe");
		PersonVanilla person3 = new PersonVanilla("joe blake", 25, "medium joe");
		List<PersonVanilla> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		System.out.println(mapper.writeValueAsString(personList));
		mapper.writeValue(new File("personList.json"), personList); 
		*/
		List<Person> personList = new ArrayList<>();
		personList = mapper.readValue(new File("personList.json"), new TypeReference<List<Person>>() {});
		personList.forEach(System.out::println);
	}

}
