package ChessGame;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Chessplayer {
	@Id
	@SequenceGenerator(name= "Chessplayer_ID_SEQ", sequenceName="chess_____layer_sql_sequence")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Chessgame_ID_SEQ")
	private int chessplayerid;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int rating;
	
	
	public Chessplayer() {
		
	}
//	public Chessplayer(int chessplayerid, String firstname, String lastname, int rating) {
//		super();
//		this.chessplayerid = chessplayerid;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.rating = rating;
//	}
	
	public Chessplayer(String firstname, String lastname, int rating) {
		super();
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
