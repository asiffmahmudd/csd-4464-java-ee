package week3;

import java.util.List;

public class Club {

	private String name;
	
	private List<Person> members;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getMembers() {
		return members;
	}

	public void setMembers(List<Person> members) {
		this.members = members;
	}

	
	@Override
	public String toString() {
		return "Club [name=" + name + ", members=" + members + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Club(String name, List<Person> members) {
		super();
		this.name = name;
		this.members = members;
	}

	
}
