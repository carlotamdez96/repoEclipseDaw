package Febrero;
import java.util.Arrays;
import java.util.Scanner;
public class FraseCrear {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime una frase: ");
		String cadena = teclado.nextLine();
		
		char[] cad= cadena.toCharArray();
		char aux;
		
		
		for (int i=0; i<cad.length;i++) {
			for (int j=cad.length-1;j>0;j--) {
				aux= cad[j];
				cad[j]= cad[j-1];
				cad[j-1]=aux;
			}
			System.out.println(cad);
		}
		

		
	}
}
