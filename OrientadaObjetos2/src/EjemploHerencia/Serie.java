package EjemploHerencia;

import java.util.Objects;

public class Serie implements Entregable{

	
	private String titulo;
	private int numTemp=3;
	private boolean entregado=false;
	private String genero;
	private String creador;
	
	
	public Serie(){
		
	}
	
	
	public Serie(String titulo,String creador) {
		
		this.titulo=titulo;
		this.creador=creador;
		
	}
	
	public Serie(String titulo, int numTemp,String genero,String creador) {
		this.titulo=titulo;
		this.numTemp=numTemp;
		this.genero=genero;
		this.creador=creador;
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
		if (entregado) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Object a) {
		
		
		
		Serie ref=(Serie)a; // hacemos un casting de ibjetos para usar el metodo get
		if(numTemp>ref.getNumTemp()) {
			int estado = numTemp - ref.numTemp;
			return 1;
		}else if(numTemp==ref.getNumTemp()) {
			int estado = numTemp-ref.numTemp;
			return 0;
		}
		
		return 0;
	}



	@Override
	public boolean equals(Object obj) {
		
	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(creador, other.creador) && Objects.equals(titulo, other.titulo);
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumTemp() {
		return numTemp;
	}


	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemp=" + numTemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
	
	
}
