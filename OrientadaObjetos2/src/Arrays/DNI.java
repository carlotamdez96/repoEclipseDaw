package Arrays;
import java.util.Scanner;
public class DNI {

	public static void main(String[] args) {
		
		int num;
		Scanner teclado= new Scanner(System.in);
		String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","N","L","C","K","E"};
		
		System.out.println("Dime un numero del dni: ");
		num=teclado.nextInt();
		
		System.out.println("La letra del dni sera: "+letras[num%23]+" ,el DNI sera: "+num+letras[num%23]);
		
		

	}

}
