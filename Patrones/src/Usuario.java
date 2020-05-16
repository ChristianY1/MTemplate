import java.util.List;

public class Usuario {
	private double credito;
	
	private List<Libro> lista;
	
	

	public Usuario(double credito, List<Libro> lista) {
		super();
		this.credito = credito;
		this.lista = lista;
	}

	public List<Libro> getLista() {
		return lista;
	}

	public void setLista(List<Libro> lista) {
		this.lista = lista;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	

}
