import java.util.Scanner;

public class atv1Matrix {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizM = new int[2][2], matrizR = new int[2][2];
		int maior;
		for(int i = 0; i < 2; i++)
		{
			for(int j=0; j< 2; j++)
			{
				System.out.println("Digite: ");
				matrizM[i][j] =entrada.nextInt();
			}
			
		}
		
		maior = Integer.MIN_VALUE;
		
		for(int ln = 0 ; ln < 2; ln++)
		{
			for(int col= 0; col < 2; col++)
			{
				
				if(matrizM[ln][col] >  maior)
				{
					maior = matrizM[ln][col];
				}
				
			}
		}
		System.out.printf("O maior valor é %d\n" , maior);
		
		
		for(int x=0; x < 2; x++)
		{
			for(int y=0; y < 2; y++)
			{
				matrizR[x][y]= matrizM[x][y]*maior;
			}
		}
		
		System.out.println("Matriz Resultante");
		for(int ln = 0; ln < 2; ln++)
		{
			
			for(int col = 0; col < 2; col++)
			{
				System.out.println(matrizR[ln][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		entrada.close();

	}

}
