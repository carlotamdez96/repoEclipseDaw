package Febrero;
import java.util.*;
public class Lista {

	int numElementos ;
	int [] lista;
	
	public Lista() {
		numElementos=0;
		lista= new int[10];
	}
	
	public Lista(int capacidad) {
		numElementos=0;
		lista= new int [capacidad];
	}
	
	public int numeroElementos() {
		return numElementos;
	}
	
	private boolean lleno() {
		return numElementos == lista.length;
	}
	
	public void insertarPrincipio(int nuevo) {
		
		if(lleno()) {
			lista=Arrays.copyOf(lista, lista.length+10);
		}
		for(int i=numElementos;i>1;i--) {
			lista[i]=lista[i-1];
		}
		lista[0]=nuevo;
		numElementos++;
	}
	
	public void insertarFinal(int nuevo) {
		if(lleno()) {
			lista= Arrays.copyOf(lista, lista.length+10);
		}
		lista[numElementos]=nuevo;
		numElementos++;
	}
	
	
	public boolean insertar(int posicion,int nuevo) {
		boolean insertado = true;
		if(posicion<0 || posicion>numElementos) {
			insertado = false;
		}else {
			if(lleno()) {
				lista= Arrays.copyOf(lista, lista.length+10);
			}
			for (int i= numElementos; i>posicion;i--) {
				lista[i]=lista[i-1];
			}
			lista[posicion]=nuevo;
			numElementos++;
		}
		return insertado;
	}
	
	public int eliminar (int indice) {
		Integer eliminado = null;
		if(indice<numElementos && indice >= 0) {
			eliminado = lista[indice];
		
		for (int i= indice; i<numElementos-1;i++) {
			lista[i]=lista[i+1];
		}
		numElementos--;
		}
		return eliminado;
	}
	
	public int get (int indice) {
		Integer resultado = null;
		
		if(indice>=0  && indice<numElementos) {
			resultado = lista[indice];
		}
		return resultado;
	}
	


}
