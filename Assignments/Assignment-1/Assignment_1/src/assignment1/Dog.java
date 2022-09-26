package assignment1;
import java.util.Objects;

public class Dog {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Dog dog = (Dog) obj;
	    return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}
