package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private long isbn;
	private LinkedList<Autor> autori;
	private String izdavac;
	private String izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public long getIsbn() {
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
	public void setIsbn(long isbn) {
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
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Knjiga)) {
			return false;
		}
		Knjiga other = (Knjiga) obj;
		if (autori == null) {
			if (other.autori != null) {
				return false;
			}
		} else if (!autori.equals(other.autori)) {
			return false;
		}
		if (isbn == null) {
			if (other.isbn != null) {
				return false;
			}
		} else if (!isbn.equals(other.isbn)) {
			return false;
		}
		if (izdanje == null) {
			if (other.izdanje != null) {
				return false;
			}
		} else if (!izdanje.equals(other.izdanje)) {
			return false;
		}
		if (izdavac == null) {
			if (other.izdavac != null) {
				return false;
			}
		} else if (!izdavac.equals(other.izdavac)) {
			return false;
		}
		if (naslov == null) {
			if (other.naslov != null) {
				return false;
			}
		} else if (!naslov.equals(other.naslov)) {
			return false;
		}
		return true;
	}
	
	
}
