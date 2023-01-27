package Pilot_2_JPA_Exercise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserJPA2")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private int status;
	
	public User() {
		super();
	}
	
	public User(String username, String password, int status) {
		super();
		//this.userid = userid;
		this.username = username;
		this.password = password;
		this.status = status;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
