
public abstract class Libro {
		private int id;
		private String titulo;
		private String autor;
		private String edicion;
		protected double precio;
		
		
		public Libro(int id, String titulo, String autor, String edicion) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.edicion = edicion;
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public String getEdicon() {
			return edicion;
		}
		public void setEdicon(String edicon) {
			this.edicion = edicon;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public double calcularPrecio(double costo, double comision) {
			return precio;
			
		}
		public abstract double calcularComision(double comision);
		
		public abstract double calcularEnvio(double envio);
		@Override
		public String toString() {
			return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", precio="
					+ precio + "]";
		}
		
		

}
