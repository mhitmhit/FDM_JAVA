package JPQA_Java_Persistance_Query_Langu;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDao<President, Integer> PresidentDAO = new President_JPA_DAO();
		
		President pres1 = new President("george washington", "dead");
		President pres2 = new President("ronald reagan", "dead");
		President pres3 = new President("barack obama", "alive");
		
		PresidentDAO.insert(pres1);
		PresidentDAO.insert(pres2);
		PresidentDAO.insert(pres3);
		System.out.println(
				PresidentDAO.getNameOfPresidentByPresidentID(1)
		);
	}

}
