package inClassExample;

import java.util.ArrayList;
import java.util.List;

public final class HistoricTeam {
	
	private final String name;
	private final int year;
	private final List<Player> players = new ArrayList<Player>();
	
	public HistoricTeam(String name, int year, List<Player> players) {
		super();
		this.name = name;
		this.year = year;
		for (Player p : players) {
			Player clonePlayer = new Player(p.getName(), p.getAge());
			this.players.add(clonePlayer);
		}
	}
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getYear() {
		return year;
	}
//	public void setYear(int year) {
//		this.year = year;
//	}
	public List<Player> getPlayers() {
		List<Player> clonedPlayers = new ArrayList<Player>();
		for (Player p : players) {
			Player clonePlayer = new Player(p.getName(), p.getAge());
			clonedPlayers.add(clonePlayer);
		}
		return clonedPlayers;
	}
//	public void setPlayers(List<Player> players) {
//		this.players = players;
//	}
	@Override
	public String toString() {
		return "HistoriTeam [name=" + name + ", year=" + year + ", players=" + players + "]";
	}
	
	
	
}
