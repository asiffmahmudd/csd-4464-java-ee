package assignment3;

import java.util.Objects;

public class Person {
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o)
	        return true;
	    if (o == null)
	        return false;
	    if (getClass() != o.getClass())
	        return false;
	    Person person = (Person) o;
	    return Objects.equals(id, person.id)
	    	&& Objects.equals(firstName, person.firstName) 
	    	&& Objects.equals(lastName, person.lastName)
	    	&& Objects.equals(age, person.age)
	    	&& Objects.equals(gender, person.gender);
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
	
}
