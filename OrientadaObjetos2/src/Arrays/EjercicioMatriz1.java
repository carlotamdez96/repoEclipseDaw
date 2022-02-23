package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioMatriz1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[][] matriz1 = new int[2][4];
		int[][] matriz2 = { { 3, 2, 1, 3 }, { 1, 4, 5, 9 } };
		int[][] matriz3 = new int[2][4];

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.println("Dime numero: ");
				matriz1[i][j] = teclado.nextInt();

			}
		}
		/*
		 * 
		 * for(int e=0; e<2;e++) { System.out.println(""); for(int f=0;f<4;f++) {
		 * System.out.print(matriz1[e][f]+" "); } }
		 */

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

			}
		}

		for (int e = 0; e < 2; e++) {
			System.out.println("");
			for (int f = 0; f < 4; f++) {
				System.out.print(matriz1[e][f] + " ");
			}
		}

		System.out.println();
		System.out.println("MATRIZ 1");
		System.out.println();

		for (int e = 0; e < 2; e++) {
			System.out.println("");
			for (int f = 0; f < 4; f++) {
				System.out.print(matriz2[e][f] + " ");
			}
		}

		System.out.println();
		System.out.println("MATRIZ 2");

		for (int e = 0; e < 2; e++) {
			System.out.println("");
			for (int f = 0; f < 4; f++) {
				System.out.print(matriz3[e][f] + " ");
			}
		}
		System.out.println();
		System.out.println("MATRIZ 3, la suma de la 1 y 2");

	}

}
