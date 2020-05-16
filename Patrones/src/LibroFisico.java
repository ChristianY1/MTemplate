
public class LibroFisico extends Libro{
	
	

	public LibroFisico(int id, String titulo, String autor, String edicion) {
		super(id, titulo, autor, edicion);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double calcularEnvio(double envio) {
		return 20;
		// TODO Auto-generated method stub
		
	}



	@Override
	public double calcularComision(double costo) {
		double comision = (2/100)*(costo);
		return comision;
		// TODO Auto-generated method stub
		
	}
	
	public double calcularPrecio(double costo) {
		double envio = 0;
		precio = calcularComision(costo) + calcularEnvio(envio) + costo ;
		
		return precio;
		
	}

}
