package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private String isbn;
	private LinkedList<Autor> autori;
	private String izdavac;
	private String izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	public String getIzdanje() {
		return izdanje;
	}
	
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
