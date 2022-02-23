package Febrero;
import java.util.*;
public class ArrayOrdenadosoDes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int [] array = new int [10];
		for (int i=0; i<array.length;i++) {
			System.out.println("Introduce numeros: ");
			array[i]=teclado.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		ordenar(array);
		
	}
	public static void ordenar (int [] a) {
		int mayor;
		if(a[0]<=a[1] && a[2]<=a[3] && a[4]<=a[5] && a[6]<=a[a.length]) {
			System.out.println("Esta ordenado");
			if (a[0]<a[a.length]) {
				System.out.println("Ordenado de forma creciente");
			}else {
				System.out.println("Ordenador de forma decreciente");
			}
		
		
	}
		else {
			System.out.println("Esta desordenado");
			System.out.println("Te lo voy a ordenar y quedaria asi: ");
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
		}
	}

}
