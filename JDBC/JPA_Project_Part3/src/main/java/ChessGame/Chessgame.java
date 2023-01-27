package ChessGame;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chessgame {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int chessgame_id;
	@Column
	private int moves;
	@Column
	private Result result;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="chessplayer_white_id")
	private Chessplayer whiteplayer;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="chessplayer_black_id")
	private Chessplayer blackplayer;
	
	public Chessgame(){
		
	}
	public Chessgame(int moves, Result result, Chessplayer whiteplayer, Chessplayer blackplayer) {
		super();
		this.moves = moves;
		this.result = result;
		this.whiteplayer = whiteplayer;
		this.blackplayer = blackplayer;
	}
//	public Chessgame(int chessgame_id, int moves, Result result, Chessplayer whiteplayer, Chessplayer blackplayer) {
//		super();
//		this.chessgame_id = chessgame_id;
//		this.moves = moves;
//		this.result = result;
//		this.whiteplayer = whiteplayer;
//		this.blackplayer = blackplayer;
//	}

	public int getChessgame_id() {
		return chessgame_id;
	}

	public void setChessgame_id(int chessgame_id) {
		this.chessgame_id = chessgame_id;
	}

	public int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Chessplayer getWhiteplayer() {
		return whiteplayer;
	}

	public void setWhiteplayer(Chessplayer whiteplayer) {
		this.whiteplayer = whiteplayer;
	}

	public Chessplayer getBlackplayer() {
		return blackplayer;
	}

	public void setBlackplayer(Chessplayer blackplayer) {
		this.blackplayer = blackplayer;
	}
	
	
}
