package Matrices;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][5];
		
		for (int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=j;
			}
			
			
		}
		
	for (int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]=j);
				matriz[i][j]=j;
			}
			System.out.println();
			
		}
		
		
		

	}

}
