import java.util.Scanner;

public class AtividadePropostaModuloMatiz22 {

	public static void preenche(double[][] valores) {
		
		Scanner entrada = new Scanner (System.in);
		
		for(int linha = 0; linha < valores.length; linha++)
		{
			
			for(int coluna = 0; coluna < valores[linha].length; coluna++)
			{
				System.out.printf("Digite um valor [%d][%d]: ", linha, coluna);
				valores[linha][coluna] = entrada.nextDouble();
			}
			
		}
	
		entrada.close();
		
	}
	
	public static void exibe(double [][] mat) {
		System.out.println("Matriz preencida");
		
		for(int i = 0; i < mat.length; i++) 
		{
			
			for(int j = 0; j < mat[i].length;j++)
			{
				
				System.out.print(mat[i][j]+ "");
				
			}
			System.out.println();
			
		}
		
	}
	
	public static double calcula (double[][] dados, int lnInicial)
	{
		double soma = 0;
		for(int ln = lnInicial; ln < dados.length; ln++)
		{
			
			for(int col=0; col<dados[ln].length; col++)
			{
				soma+=dados[ln][col];
			}
			
		}
		
		return(soma);
	}

	public static void main(String[] args) {
		
		double[][] matriz = new double[10][5];
		
		
		preenche(matriz);
		
		exibe(matriz);
		
		System.out.println("A soma da sexta linha até a ultima é de "+ calcula(matriz,1));

	}

}
