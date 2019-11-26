package co.grandcircus.Capstone6.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid;
	private String username;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "user", orphanRemoval = true)
	private List<Task> tasks;


	
	public User() {
		super();
	}

	public User(Integer userid, String username, String email, String password, List<Task> tasks) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.tasks = tasks;
	}

	public User(String username, String email, String password, List<Task> tasks) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.tasks = tasks;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
}
