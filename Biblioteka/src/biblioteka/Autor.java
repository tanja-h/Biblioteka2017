package biblioteka;

public class Autor {
	private String autor;

	@Override
	public String toString() {
		return "Autor [autor=" + autor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Autor)) {
			return false;
		}
		Autor other = (Autor) obj;
		if (autor == null) {
			if (other.autor != null) {
				return false;
			}
		} else if (!autor.equals(other.autor)) {
			return false;
		}
		return true;
	}
	
	
}
