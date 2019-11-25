package co.grandcircus.Capstone6.repo;

import java.util.TreeSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.Capstone6.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	@Query("select distinct username from User")
	TreeSet<String> findDistinctUserName();

}
