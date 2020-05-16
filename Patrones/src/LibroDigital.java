
public class LibroDigital extends Libro {

	public LibroDigital(int id, String titulo, String autor, String edicion) {
		super(id, titulo, autor, edicion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularComision(double comision) {
		comision = 10;
		return comision;
	}

	@Override
	public double calcularEnvio(double envio) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public  double calcularPrecio(double costo) {
		double envio = 0;
		double comision = 0;
		precio = calcularComision(comision) + costo + calcularEnvio(envio);
		return precio;
		
	}
}
