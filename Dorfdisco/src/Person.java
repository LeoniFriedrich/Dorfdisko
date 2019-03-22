
public class Person {

	private String vorname;
	private String nachname;
	private int alter;
	
	public Person(String vn, String nn, int a) {
		this.setVorname(vn);
		this.setNachname(nn);
		this.setAlter(a);
	}
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
}
