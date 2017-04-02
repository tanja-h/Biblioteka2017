package biblioteka;

public class Knjiga {
	private String naslov;
	private String isbn;
	private String autor;
	private String izdavac;
	private String izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getAutor() {
		return autor;
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
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
