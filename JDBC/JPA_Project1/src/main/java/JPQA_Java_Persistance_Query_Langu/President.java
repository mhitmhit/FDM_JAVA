package JPQA_Java_Persistance_Query_Langu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(
	name="findPresidentByID",
	query="SELECT p FROM President p WHERE p.presidentid = ?1"
)

@Entity
public class President {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 		// auto id generation, we added a constructor in president without the id parameter 
	private int presidentid;
	@Column
	private String name;
	@Column
	private String status;
	
	
	
	public President(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	public President(int presidentid, String name, String status) {
		super();
		this.presidentid = presidentid;
		this.name = name;
		this.status = status;
	}
	public President() {
		super();
	}
	public int getPresidentid() {
		return presidentid;
	}
	public void setPresidentid(int presidentid) {
		this.presidentid = presidentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
