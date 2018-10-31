package com.example.demo.repository;






import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	@Query("from User u  where u.email = ?1")
	public User findByEmail(String email);
	
	
	
	 

}
