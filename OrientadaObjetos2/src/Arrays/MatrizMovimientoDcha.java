package Arrays;

public class MatrizMovimientoDcha {

	public static void main(String[] args) {


		int [][] matriz = {{2,3,4,5,6},{1,6,7,8,8},{1,2,3,4,5}};
		int [][] matriz2 = {{2,3,4,5,6},{1,6,7,8,8},{1,2,3,4,5}};
		
		System.out.println("L matriz 1º sera: ");
		for(int i=0;i<matriz.length;i++) {
			System.out.println();
			
			for(int j=0; j<5;j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			
		}
		
		System.out.println();
		System.out.println("La segunda sera: ");
		
		for(int i=0;i<matriz2.length;i++) {
			System.out.println();
			
			for(int j=1; j<5;j++) {
				System.out.print(matriz[i][j]+" ");
				if(j==4) {
					matriz2[i][0]=matriz[i][j];
				}
			}
		}
		
		
		
		
		
		

	}

}
