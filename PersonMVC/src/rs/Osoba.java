package rs;

public class Osoba {
	private String ime, prezime;
	private int godine;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public Osoba() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Osoba(String ime, String prezime, int godine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ime+" "+prezime+" "+godine;
	}
}
