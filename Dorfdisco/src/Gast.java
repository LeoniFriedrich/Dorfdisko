
public class Gast extends Person{
  
  private String Hotel;
  private int budget;
  private boolean passend;

  public Gast(String vn, String nn, int a) {
		super(vn, nn, a);
		this.setBudget(100);
	}
  
  public String getHotel() {
	  return Hotel;
  }
  public void setHotel(String hotel) {
	  Hotel = hotel;
  }
  public int getBudget() {
	  return budget;
  }
  public void setBudget(int budget) {
	  this.budget = budget;
  }
  
  public void inClubGehen(Location l) {
	  if(this.getBudget() >= l.getEintritt()) {
		  l.eintritt();
		  int b = this.getBudget() - l.getEintritt();
		  this.setBudget(b);
		  System.out.println(this.getVorname() +" ist jetzt im der Location: " 
		  +l.getName() +"!" + "Morgen ist Dacia Tag!" );
	  }
	  else {
		  System.err.println(this.getVorname() +" hat nicht genug geld!");
	  }
  }
  
}
