package Febrero;
import java.util.Scanner;
public class MatrizMasUno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int [][] matriz = new int [3][5];
		int [][] aux = new int [matriz.length][matriz[0].length];
		
		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.println("Introduce un numero");
				matriz[i][j]= teclado.nextInt();
			}
		}
		System.out.println("La matriz principal es: ");

		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("Ahora vamos  a mover una posicion a la derecha las columnas");
		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				if(j==matriz.length) {
					aux[i][0]=matriz[i][j];
				}else {
					aux[i][j+1]= matriz[i][j];
				}
			}
		}
		
		
		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(aux[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
