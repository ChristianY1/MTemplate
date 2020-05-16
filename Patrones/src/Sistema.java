import java.text.DecimalFormat;

public class Sistema {

	private Usuario usuario;

	
	

	public double descontarCredito(Usuario usuario) {
		double compras = usuario.getLista().get(0).getPrecio() + usuario.getLista().get(1).getPrecio();
		double credito = usuario.getCredito() - compras ;
		usuario.setCredito(credito);
		return credito;
	}
	
	public double recargarCredito(Usuario usuario, double recarga) {
		double credito = usuario.getCredito() +  recarga;
		return credito;
	}
	
	
	

}
