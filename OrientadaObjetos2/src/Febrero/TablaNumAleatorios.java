package Febrero;

public class TablaNumAleatorios {

	public static void main(String[] args) {
		
		
		int [][] matriz = new int [2][4];
		
		//int numAleatorio=(int)Math.random()*(20-1+1)+1;
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				matriz[i][j]= (int)Math.floor(Math.random()*(20-1+1)+1);
			}
		}
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println(" ");
		}

	}
	

}
