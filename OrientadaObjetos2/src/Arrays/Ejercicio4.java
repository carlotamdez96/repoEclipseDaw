package Arrays;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int suma=0;
		int aprobados=0;
		int suspensos=0;
		int [] vector = new int [30];
	
		int [] f = new int [11];
		
		
	for(int i=0; i<vector.length; i++) {
		
			System.out.println("Dime un nota hasta 10: ");
			vector[i]=teclado.nextInt();
			
			if (vector[i]<=10 && vector[i]>=0) {
				
				if(vector[i]>=5) {
					aprobados++;
				
				}else {
					suspensos++;
				}
			}else {
				System.out.println("Nota no valida");
			}
			suma=suma+vector[i];
			f[i]=vector[i]+1;
		}
	
	double media= (double)(suma/vector.length);
	System.out.println("La media es: "+media);
	
	System.out.println("Hay "+aprobados+" aprobados ");
	System.out.println("Hay "+suspensos+" suspensos");
	
	
	
	
	
	
	}

}
