import java.util.Scanner;

public class atv10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Declaraçao das variaveis
		
		double custo, distribuidor, impostos;
		
		//Leitura do custo de fabrica
		
		System.out.print("Digite o custo de fábrica do carro: ");
		custo = entrada.nextDouble();
		
		//Calcular o valor do distribuidor e os impostos
		if(custo <= 12000)
		{
			distribuidor = 0.05*custo;
			impostos = 0;
		}
		else if(custo > 12000 && custo <= 25000) // a como tirar o custo>12000 pois em cima ja esta conferindo, mas se fosse if separado teria quee colocar
		{
			distribuidor = (10.0/100)*custo;
			impostos = ((double)15/100)*custo;//mostrando as duas formas para o resultado n dar zero
		}
		else 
		{
			 distribuidor = 0.15*custo;
			 impostos = 0.20*custo;
		}
		
		
		//Calcular e Mostrar o preço do consumidor
		
		System.out.printf("O preço do consumidor é R$%.2f\n",(custo + distribuidor + impostos));
		
		entrada.close();

	}

}
