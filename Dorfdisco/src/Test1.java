
public class Test1 {

	public static void main(String[]args) {
		Gast g1 = new Gast("Felix", "Rapp", 19);
		Gast g2 = new Gast("Tim", "Currywurst", 77);
		Location l1 = new Location("Abfahrtsclub", 15, 100);
		Location l2 = new Location("Abfahrtsclub", 15, 100);
		g1.inClubGehen(l1);
		g2.inClubGehen(l1);
		
	}
	
}
