package ca.lambton.week10fall2022;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {


	public User findByName(String name);
}
