
public class Location {

	private String name;
	private int restkapazitaet;
	private int eintritt;
	private int kasse;

	public Location(String n, int e, int max) {
		this.setEintritt(e);
		this.setRestkapazitaet(max);
		this.setName(n);
	}
	
	public int getKasse() {
		return kasse;
	}
	public void setKasse(int kasse) {
		this.kasse = kasse;
	}
	public int getEintritt() {
		return eintritt;
	}
	public void setEintritt(int eintritt) {
		this.eintritt = eintritt;
	}
	public int getRestkapazitaet() {
		return restkapazitaet;
	}
	public void setRestkapazitaet(int restkapazitaet) {
		this.restkapazitaet = restkapazitaet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eintritt() {
		if (this.getRestkapazitaet() >= 0) {
			int k = this.getKasse() + this.getEintritt();
			this.setKasse(k);
			int r = this.getRestkapazitaet() -1;
			this.setRestkapazitaet(r);
		}
		else {
			System.err.println("Location ist voll!");
		}
	}
}
