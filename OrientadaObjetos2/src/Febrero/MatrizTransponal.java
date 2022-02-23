package Febrero;
import java.util.Scanner;
public class MatrizTransponal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String a;
		char [][] matriz = new char [3][3];
		char [][] aux = new char [3][3];
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				System.out.println("introduce una letra: ");
				matriz[i][j]= teclado.nextLine().charAt(0);
			}
		}
		System.out.println("La matriz creada es: ");
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
			
				aux[j][i]= matriz[i][j];
			}
		}
		System.out.println("La matriz creada es: ");
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				System.out.print(aux[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
