package EjemploHerencia;

public class Vivienda {

	
	
	/*
	 * 
	  public enum TipoVivienda {

	piso, duplex, atico, casa, adosado, chalet
}
 esto podria ponerlo aqui o en una clase a parte
	 */
	
	protected  Tipo TipoVivienda ; // aqui añado la clase enumerada creada anteriormente que se llama Tipo
	protected int numHabitaciones;
	protected double metroscuadrados;
	protected double precio;
	protected String ciudad;
	protected String zona;
	
	public Vivienda() {
		
	}
	public Vivienda(Tipo TipoVivienda,int numHabitaciones,double metroscuadrados,double precio, String ciudad, String zona) {// aqui poner TipoVIvienda de tipo Tipo que es la clase enumerada
		this.TipoVivienda=TipoVivienda; 
		this.numHabitaciones=numHabitaciones;
		this.metroscuadrados=metroscuadrados;
		this.precio=precio;
		this.ciudad=ciudad;
		this.zona=zona;
	}
	public Tipo getTipoVivienda() {
		return TipoVivienda;
	}
	public void setTipoVivienda(Tipo tipoVivienda) { // aqui recordar que este atributo es del tipo Tipo(clas eenumerada)
		TipoVivienda = tipoVivienda;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public double getMetroscuadrados() {
		return metroscuadrados;
	}
	public void setMetroscuadrados(double metroscuadrados) {
		this.metroscuadrados = metroscuadrados;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	@Override
	public String toString() {
		return "Vivienda [TipoVivienda=" + TipoVivienda + ", numHabitaciones=" + numHabitaciones + ", metroscuadrados="
				+ metroscuadrados + ", precio=" + precio + ", ciudad=" + ciudad + ", zona=" + zona + "]";
	}
	
	
	public double comision (double precio) {
		return precio*3/100;
	}
	
	public boolean equals(Vivienda v) {
		if((this.TipoVivienda==v.TipoVivienda) && (this.numHabitaciones==v.numHabitaciones) && (this.metroscuadrados==v.metroscuadrados) && (this.ciudad.equals(v.ciudad))){
			return true;
		}else {
			return false;
		}
	}
	
}
