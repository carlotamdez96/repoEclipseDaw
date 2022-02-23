package Arrays;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		
			int [] a = new int [15]; // tambien podemos poner {1,2,3,1,5,6,8,1,5,8,4,7,8,7}--> serian fijos
			Scanner teclado = new Scanner(System.in);
			int contador=0;
			int primerapos=0;
			int mayor=0;
			
			
			for(int i=0; i<a.length;i++) {
				System.out.println("Dime un numero:");
				a[i]=teclado.nextInt();
				
				
				if(a[i]>mayor) {
					mayor=a[i];
					primerapos=i+1;
				}else if (a[i]==mayor) {
					contador++;
				}

				
			}
			
			
			
			System.out.println("El mayor es: "+mayor);
			System.out.println("Se repite: "+contador);
			System.out.println("La primera posicion en la que se encuentra: "+primerapos);
			

	}

}
