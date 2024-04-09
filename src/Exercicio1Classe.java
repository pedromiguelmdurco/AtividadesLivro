import java.util.Scanner;

public class Exercicio1Classe 
{

	public static void main(String[] args) 
	{
		Carro carroViniciusRodrigues = new Carro(), 
			  carroViniciusFerrer = new Carro(), 
			  victorGoddard = new Carro(),
		      victorDavidson = new Carro(), 
		      victorDavid = new Carro();
		
		Pessoa pessoaViniciusRodrigues = new Pessoa("Vinícius Rodrigues", 19, 1.75);
		Pessoa pessoaViniciusFerrer = new Pessoa ("Vinícius Ferrer", 18, 1.81);
		Pessoa pessoaGisele = new Pessoa ("Gisele",19,1.6);
		Pessoa pessoaPedroMiguel = new Pessoa ("Novato",18,1.77);
		
		Scanner entrada = new Scanner(System.in);
		
		carroViniciusRodrigues.colocarGente(pessoaViniciusRodrigues);
		carroViniciusRodrigues.colocarGente(pessoaGisele);
		carroViniciusFerrer.colocarGente(pessoaViniciusFerrer);
		carroViniciusFerrer.colocarGente(pessoaPedroMiguel);
		
		System.out.print("Placa: ");
		carroViniciusRodrigues.setPlaca(entrada.nextLine());
		System.out.print("Ano: ");
		carroViniciusRodrigues.setAnoFabricacao(entrada.nextInt());
		entrada.nextLine();
		
		System.out.print("Placa: ");
		carroViniciusFerrer.setPlaca(entrada.nextLine());
		System.out.print("Ano: ");
		carroViniciusFerrer.setAnoFabricacao(entrada.nextInt());
		entrada.nextLine();
		
		System.out.print("Placa: ");
		victorGoddard.setPlaca(entrada.nextLine());
		System.out.print("Ano: ");
		victorGoddard.setAnoFabricacao(entrada.nextInt());
		entrada.nextLine();
		
		System.out.print("Placa: ");
		victorDavidson.setPlaca(entrada.nextLine());
		System.out.print("Ano: ");
		victorDavidson.setAnoFabricacao(entrada.nextInt());
		entrada.nextLine();
		
		System.out.print("Placa: ");
		victorDavid.setPlaca(entrada.nextLine());
		System.out.print("Ano: ");
		victorDavid.setAnoFabricacao(entrada.nextInt());
		entrada.nextLine();
		
		System.out.println("Todos os carros");
		exibirTodosCarros(carroViniciusRodrigues, carroViniciusFerrer, victorGoddard, victorDavidson, victorDavid);
		
		System.out.printf("Soma dos impostos é R$%.2f\n", somarImpostos(carroViniciusRodrigues, carroViniciusFerrer, victorGoddard, victorDavidson, victorDavid));
		
		System.out.printf("%d carros não pagam impostos", quantidadeSemImposto(carroViniciusRodrigues, carroViniciusFerrer, victorGoddard, victorDavidson, victorDavid));
	
		entrada.close();
	}

	public static int quantidadeSemImposto (Carro c1, Carro c2, Carro c3, Carro c4, Carro c5)
	{
		int quant = 0;
		
		if (c1.calcularImposto(2021) == 0) 
		{
			quant++;
		}
		if (c2.calcularImposto(2021) == 0) 
		{
			quant++;
		}
		if (c3.calcularImposto(2021) == 0) 
		{
			quant++;
		}
		if (c4.calcularImposto(2021) == 0) 
		{
			quant++;
		}
		if (c5.calcularImposto(2021) == 0) 
		{
			quant++;
		}
		
		return quant;
	}
	
	public static double somarImpostos (Carro c1, Carro c2, Carro c3, Carro c4, Carro c5)
	{
		return (c1.calcularImposto(2021) + c2.calcularImposto(2021) +
				c3.calcularImposto(2021) + c4.calcularImposto(2021) +
				c5.calcularImposto(2021));
	}
	
	public static void exibirTodosCarros (Carro c1, Carro c2, Carro c3, Carro c4, Carro c5)
	{
		Pessoa[] ocupantes;
		
		System.out.printf("\nVinícius Rodrigues - Ano %d e Placa %s", c1.getAnoFabricacao(), c1.getPlaca());
		System.out.printf(" %.2f\n", c1.calcularImposto(2021));
		System.out.println();
		ocupantes = c1.getPessoas();
		for (int i=0; i < c1.getOcupacao(); i++)
		{
			ocupantes[i].exibir();
		}
		
		System.out.printf("\nVinícius Ferrer - Ano %d e Placa %s", c2.getAnoFabricacao(), c2.getPlaca());
		System.out.printf(" %.2f\n", c2.calcularImposto(2021));
		System.out.println();
		ocupantes = c2.getPessoas();
		for (int i=0; i < c2.getOcupacao(); i++)
		{
			ocupantes[i].exibir();
		}
		
		System.out.printf("\nVictor Goddard - Ano %d e Placa %s", c3.getAnoFabricacao(), c3.getPlaca());
		System.out.printf(" %.2f\n", c3.calcularImposto(2021));
		System.out.println();
		ocupantes = c3.getPessoas();
		for (int i=0; i < c3.getOcupacao(); i++)
		{
			ocupantes[i].exibir();
		}
		
		System.out.printf("\nVictor Davidson - Ano %d e Placa %s", c4.getAnoFabricacao(), c4.getPlaca());
		System.out.printf(" %.2f\n", c4.calcularImposto(2021));
		System.out.println();
		ocupantes = c4.getPessoas();
		for (int i=0; i < c4.getOcupacao(); i++)
		{
			ocupantes[i].exibir();
		}
		
		System.out.printf("\nVictor David - Ano %d e Placa %s", c5.getAnoFabricacao(), c5.getPlaca());
		System.out.printf(" %.2f\n", c5.calcularImposto(2021));
		System.out.println();
		ocupantes = c5.getPessoas();
		for (int i=0; i < c5.getOcupacao(); i++)
		{
			ocupantes[i].exibir();
		}
	}
}
class Pessoa
{
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa()
	{
		inicializar("nenhum",0,0);
	}
	public Pessoa (String novoNome, int novaIdade, double novaAltura)
	{
		inicializar(novoNome,novaIdade,novaAltura);
	}
	
	private void inicializar (String novoNome, int novaIdade, double novaAltura)
	{
		nome = new String();
		setNome(novoNome);
		setIdade(novaIdade);
		setAltura(novaAltura);
	}
	
	public void setNome (String novoNome)
	{
		nome = nome.replaceAll(nome, novoNome);
	}
	
	public String getNome ()
	{
		return nome;
	}
	
	public void setIdade (int novaIdade)
	{
		if (novaIdade >= 0)
		{
			idade = novaIdade;
		}
		else
		{
			System.out.println("Idade negativa não é permitida");
		}
	}
	
	public int getIdade ()
	{
		return idade;
	}
	
	public void setAltura (double novaAltura)
	{
		if (novaAltura >= 0) 
		{
			altura = novaAltura;
		}
		else
		{
			System.out.println("Altura inválida");
		}
	}	
	
	public double getAltura ()
	{
		return (altura);
	}
	
	public void exibir()
	{
		System.out.printf("Nome %s Idade %d Altura %.2f\n",getNome(),getIdade(),getAltura());
	}
}
class Carro
{
	private String placa;
	private int anoFabricacao;
	private Pessoa[] pessoas;
	private int ocupacao;
	
	public Carro ()
	{
		placa = "XXX0000";
		anoFabricacao = 2000;
		pessoas = new Pessoa[5];
		ocupacao = 0;
	}
	
	public void setPessoas (Pessoa[] vetor)
	{
		pessoas = vetor;
	}
	
	public Pessoa[] getPessoas()
	{
		return pessoas;
	}	
	
	public void setPlaca (String nova)
	{
		placa = placa.replaceAll(placa, nova);
	}
	public String getPlaca()
	{
		return placa;
	}
	public void setAnoFabricacao(int novo)
	{
		if (novo > 1999 && novo <= 2021)
		{
			anoFabricacao = novo;
		}
		else
		{
			System.out.println("Ano inválido - 1999 < ano <= 2021");
		}
	}
	public int getAnoFabricacao()
	{
		return anoFabricacao;
	}
	
	public int getOcupacao()
	{
		return ocupacao;
	}
	
	public void colocarGente (Pessoa proxima)
	{
		if (ocupacao < 5 && proxima != null)
		{
			pessoas[ocupacao] = proxima;
			ocupacao++;
		}
		else if (proxima == null)
		{
			System.out.println("A pessoa não foi \"criada\" na memória");
		}
	}
	
	public double calcularImposto (int anoAtual)
	{
		int anos = anoAtual - anoFabricacao;
		double imposto = 500;
		
		if (anos < 9)
		{
			for (int ano = 1; ano <= anos; ano++)
			{
				if (imposto > 100)
				{
					imposto = imposto - 100;
				}
			}
			return imposto;
		}
		else
		{
			return 0;
		}
	}
}