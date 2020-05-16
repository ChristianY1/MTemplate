import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cr�dito inicial:");
		System.out.println("Compras:");
		
		LibroFisico libroF = new LibroFisico(1, "El principito", "Antoine de Saint-Exup�ry", "Edici�n de Lujo");
		System.out.println("Libro Fisico: "+libroF.calcularPrecio(145.65));
		libroF.setPrecio(145.65);
		
		LibroDigital libroD = new LibroDigital(2, "DONDE SURGEN LAS SOMBRAS", "David Lozano Garbala", "Tercera edici�n");
		System.out.println("Libro Digital: " +libroD.calcularPrecio(35.65));
		libroD.setPrecio(35.65);
		
		
		List <Libro> lista = new ArrayList<Libro>();
		lista.add(libroF);
		lista.add(libroD);
		
		Usuario usuario = new Usuario(2000,lista);
		usuario.setCredito(1000.43);
		Sistema sis = new Sistema();
		
		System.out.println("Cr�dito disponible:"  + sis.descontarCredito(usuario));
		System.out.println("Se ha recargado 1000  ha su cr�dito");
		System.out.println("su nuevo cr�dito es:" +  sis.recargarCredito(usuario, 1000));
		
		System.out.println("Usted ha comprado los isguietnes libros:");
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
		
	
		
		
		
		
		
		
	}

}
