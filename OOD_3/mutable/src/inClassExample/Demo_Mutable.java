package inClassExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_Mutable {

	public static void main(String[] args) {
		
		Player player1 = new Player("mike moustakas", 27);
		Player player2 = new Player("ben zobrist", 31);
		Player player3 = new Player("eric homser", 21);
		Player player4 = new Player("alex jones", 18);
		
		List<Player> players = new ArrayList<>(Arrays.asList(player1, player2, player3, player4));
		
		HistoricTeam historicTeam = new HistoricTeam("KC royals", 2015, players);
		
		System.out.println(historicTeam);
		
		player1.setAge(99);
		player2.setAge(99);
		player3.setAge(99);
		player4.setAge(99);
		
		for (Player p:historicTeam.getPlayers()) {
			System.out.println(p);
		}
	}

}
