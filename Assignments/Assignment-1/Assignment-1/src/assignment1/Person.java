package assignment1;

import java.util.Objects;
import java.util.Optional;

public class Person {
	private String name;
	private int age;
	private Optional<Dog> dog;
	
	public Person(String name, int age) {
		this(name, age, null);
	}
	
	public Person(String name, int age, Dog dog) {
		super();
		this.name = name;
		this.age = age;
		this.dog = Optional.ofNullable(dog);
	}
	
	public boolean hasOldDog() {
		return this.dog.map(d -> d.getAge() >= 10).orElse(false);
	}
	
	public void changeDogsName(String newName){
		this.dog.ifPresent(d -> d.setName(newName));
		this.dog.orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Optional<Dog> getDog() {
		return dog;
	}

	public void setDog(Optional<Dog> dog) {
		this.dog = dog;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Person person = (Person) obj;
	    return Objects.equals(name, person.name) && Objects.equals(age, person.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dog=" + dog + "]";
	}
}
