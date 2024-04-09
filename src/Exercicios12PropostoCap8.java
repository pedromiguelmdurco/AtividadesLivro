import java.util.Scanner;

public class Exercicios12PropostoCap8 {

	public static int potencia (int base, int expoente)
	{
		int subtotal = 1;
		
		for(int conta=1; conta<= expoente; conta++)
		{
			subtotal = subtotal*base;
		}
		
		return(subtotal);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x,z,resultado;
		
		System.out.print("Digite os valores de X e Z: ");
		x = entrada.nextInt();		
		z = entrada.nextInt();	
		
		resultado = potencia(x,z);
		System.out.printf("A potência de X elevadoa Z é %d\n",resultado);
		
		entrada.close();

	}

}
