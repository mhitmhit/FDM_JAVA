package Chessplayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chessplayer {
	@Id
	private int chessplayerid;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int rating;
	
	
	public Chessplayer() {
		
	}
	
	public Chessplayer(int chessplayerid, String firstname, String lastname, int rating) {
		super();
		this.chessplayerid = chessplayerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.rating = rating;
	}
	
	public int getChessplayerid() {
		return chessplayerid;
	}
	public void setChessplayerid(int chessplayerid) {
		this.chessplayerid = chessplayerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
