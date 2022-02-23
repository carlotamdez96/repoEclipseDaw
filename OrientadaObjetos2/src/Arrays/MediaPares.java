package Arrays;
import java.util.Scanner;
public class MediaPares {

	public static void main(String[] args) {
		int contadorp=0;
		int contadorimp=0;
		int i;
		int [] Cadena = new int [10];
		Scanner teclado= new Scanner(System.in);
		
		for ( i=0; i<Cadena.length;i++) {
			
			System.out.println("Introduce los numeros: ");
			Cadena[i]=teclado.nextInt();
			if (i%2==0) { // la i representa la POSICION
				contadorp=contadorp+Cadena[i];// para poner el numero es Cadena[i]
			}else {
				contadorimp=contadorimp+Cadena[i];
			}
			
		}
		float media=0;
		media=contadorp/Cadena.length;
		System.out.println("La media de los numeros pares es: "+media);
		
		media=contadorimp/Cadena.length;
		System.out.println("La media de los numeros impares es: "+media);
		
		
		
		
		 /*float media=0;
		 int contador=0;
		 for (int i=0; i%2==0; i++) {
			 media=media+i;
			 contador++;
		 }
		 media=media/(contador);
		 System.out.println(media);
		*/
	}

}
