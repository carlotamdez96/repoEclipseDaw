package Enero;

public class Coche {

	private String marca;
	private String modelo;
	private String color;
	private boolean metalizada=true;
	private String matricula;
	private int añoFabricacion;
	
	
	public Coche() {
		
	}
	public Coche(String matricula) {
		this.matricula=matricula;
	}
	
	public Coche(String marca,String modelo, String color, String matricula) {
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.matricula=matricula;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMetalizada() {
		return metalizada;
	}

	public void setMetalizada(boolean metalizada) {
		this.metalizada = metalizada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	
	public void imprimeCoche () {
		
		System.out.println("Tiene un coche marca: "+marca+" ,modelo: "+modelo+" de color: "+color);
		
	
	}
	
}
