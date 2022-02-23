package Arrays;
import java.util.*;
public class OrdenacionArrays {

	
	
	private final int LONG = 10;
	
	int [] a1 = new int [LONG];
	int [] a2 = new int [LONG];
	int [] a3 = new int [LONG];
	
	Scanner teclado = new Scanner(System.in);
	
	
	
	

	
	public   void Inicializa () {
		
		for (int i=0; i<LONG; i++) {
			System.out.println("Dime un numero: ");
			//a1[i]= teclado.nextInt();
			a2[i]= a1[i]= a3[i]= teclado.nextInt();;
			
		}
	//	System.out.println(Arrays.toString(a1));
		
	}
	
	public  void metodoBaraja() {
		
		
		int p,j;
		int aux;
		for (p = 1; p < a3.length; p++ ) {
			
			aux = a3[p];
			j = p-1;
			
			while ((j >= 0) && (aux < a3[j])) {
				
					a3[j + 1 ]= a3[j];
					j--;
			}
			a3[j+1]=aux;
			
			
		}
		
	}
	
	public  void seleccionDirecta() {
		
		for (int i = a2.length - 1; i>0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (a2[j + 1] > a2[maxValue]) {
					maxValue = j + 1;
				}
			}
			swap(a2,i,maxValue);
			
		}
	}
	
	private  void swap (int [] array, int a, int b) {
		int value = array[b];
		array[b]= array[a];
		array[a]= value;
	}
	
	
	public void metodoBurbuja() {
		
		for (int i = a1.length - 1 ; i> 0; i--) {
			for(int j=0;j< i ; j++) {
				if (a1[j] > a1[j+1]) {
					swap(a1,j,j+1);
					
				}
			}
		}
		
	}
	
	public void orden() {
		Arrays.sort(a1,0,a1.length);
	}
	
	public void Mostrar() {
		System.out.print("Array 1 ");
		System.out.println(Arrays.toString(a1));
		System.out.print("Array 2 ");
		System.out.println (Arrays.toString(a2));
		System.out.print("Array 3");
		System.out.println(Arrays.toString(a3));
	}
	
	
	
	

}