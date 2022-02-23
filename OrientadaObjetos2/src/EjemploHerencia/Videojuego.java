package EjemploHerencia;

public class Videojuego implements Entregable{

	
	
	private String titulo;
	private int horas=10;
	private boolean entregado=false;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		
	}
	
	public Videojuego(String titulo, int horas) {
		this.titulo=titulo;
		this.horas=horas;
	}
	
	public Videojuego(String titulo, int horas, String genero,String compañia) {
		this.titulo=titulo;
		this.horas=horas;
		this.genero=genero;
		this.compañia=compañia;
	}

	@Override
	public void entregar() {
		entregado=true;
	}
	@Override
	public void devolver() {
		entregado=false;
	}
	@Override
	public boolean isEntregado() {
		return entregado;
	}
	@Override
	public int compareTo(Object a) {
		
		
		Videojuego ref=(Videojuego)a; // hacemos un casting de ibjetos para usar el metodo get
		if(horas>ref.getHoras()) {
			int estado = horas - ref.horas;
			return 1;
		}else if(horas==ref.getHoras()) {
			int estado = horas-ref.horas;
			return 0;
		}
		
		return 0;
		}
		
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}
	
	
	
}
