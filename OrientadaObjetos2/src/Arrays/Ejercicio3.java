package Arrays;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {  // MAAAAAAAAAAAAAL! MIRAR CORRECCION AULAS
		
		Scanner teclado = new Scanner (System.in);
		int e=1;
		int [] original = new int [10];
		
		int [] traspuesto = new int [10];
		
		int [] rotado = new int [10];
		
		for(int i=0; i<original.length; i++) {
			
			System.out.println("Dime un numero: ");
			original[i]=teclado.nextInt();
			
			System.out.println("la posicion: "+i+" sera: "+original[i]);
			
		}
		
		
		for(int i=0; i<traspuesto.length;i++) {
			
			traspuesto[i]= original[traspuesto.length-e];
			e++;
			System.out.print(traspuesto[i]);
		}
		
		/*
		for(int i=0; i<rotado.length;i++) {
					
			rotado[i]=original[rotado.length+1];
			System.out.println(rotado[i]);
			
		}*/
		
		for(int i=0;i<rotado.length;i++) {
			
			
			if(i==rotado.length-1) {
				rotado[0]=original[i];
			}else {
				rotado[i+1]=original[i];
			}
			
			System.out.println(rotado[i]);
						
		}
		
		
		
		}
		
		
	}


