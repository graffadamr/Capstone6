package co.grandcircus.Capstone6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer taskid;
	private String description;
	private String duedate;
	private Boolean complete = false;
	
	@ManyToOne
	private User user;

	public Task() {
		super();
	}

	public Task(String description, String duedate) {
		super();
		this.description = description;
		this.duedate = duedate;
	}




	public Task(Integer taskid, String description, String duedate, boolean complete, User user) {
		super();
		this.taskid = taskid;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.user = user;
	}

	public Task(String description, String duedate, boolean complete, User user) {
		super();
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.user = user;
	}

	public Task(String description, String duedate, boolean complete) {
		super();
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
