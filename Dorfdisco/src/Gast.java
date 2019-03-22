
public class Gast extends Person{
  
  private String Hotel;
  private int budget;

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
  
  
  
}
