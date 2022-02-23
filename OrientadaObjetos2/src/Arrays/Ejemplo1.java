package Arrays;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) { // ESTA MAAAAAAAAAAAAL!
		
		int[] edadTrabajador = new int [10];
		
		Scanner teclado= new Scanner(System.in);
		
		for(int i=0; i<10;i++) {
			System.out.println("Introduce la edad del trabajador: ");
			edadTrabajador[i]=teclado.nextInt();
		}
		
		//System.out.println(edadTrabajador.length);
		
		
		int[]alturaTrabajador = new int [10];
		int i=0;
		while (i<10) {
			System.out.println("Introduce la altura del trabajdor "+i+": ");
			alturaTrabajador[i]=teclado.nextInt();
			i++;
		}
		
		System.out.println(alturaTrabajador[10]);

	}

}
