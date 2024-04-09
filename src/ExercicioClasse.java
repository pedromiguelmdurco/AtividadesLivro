import java.util.Scanner;

public class ExercicioClasse {

	public static void main(String[] args) {
		
		Tipo tipoA = new Tipo(1), tipoB = new Tipo(2), tipoC = new Tipo();
		Tipo [] tipos = new Tipo[5];
		Produto p1 = new Produto("Café",tipoA, 8), p2 = new Produto();
		Produto[] produtos = new Produto[3];
 		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Descrição do produto: ");
		p2.setDescr(entrada.nextLine());
		
		System.out.println("Código do tipo do produto(1- Alimentação, 2 - Limpeza): ");
		tipoC.setCod(entrada.nextInt());
		p2.setTipo(tipoC);
		
		System.out.println("Preço do produto: ");
		p2.setPreco(entrada.nextDouble());
		
		for(int num = 0; num < produtos.length; num++)
		{
			
			System.out.println("Descrição do produto: ");
			produtos[num].setDescr(entrada.nextLine());
			
			System.out.println("Código do tipo do produto(1- Alimentação, 2 - Limpeza): ");
			tipoC.setCod(entrada.nextInt());
			produtos[num].setTipo(tipoC);
			
			System.out.println("Preço do produto: ");
			produtos[num].setPreco(entrada.nextDouble());
			
		}
		
		for(int i = 0; i < tipos.length; i++)
		{
			if(i%2 == 0)
			{
				tipos[i] = new Tipo(1);
			}
			else
			{
				tipos[i] = new Tipo(2);
			}
		}
		
		tipoA.exibir();
		tipoB.exibir();
		
		for(int pos = 0; pos< tipos.length; pos++)
		{
			tipos[pos].exibir();
		}
		
		System.out.println("\nProdutos");
		p1.exibir();
		System.out.println();
		p2.exibir();
		
		
		entrada.close();
	}

}

class Produto

{
	private String descr;
	private Tipo tipo;
	private double preco,imposto;
	
	public Produto()
	{
		inicializar("nenhum", new Tipo(1),0);
		
	}
	
	public Produto(String novaDescr, Tipo novoTipo, double novoPreco)
	{
		inicializar(novaDescr,novoTipo,novoPreco);
		
	}
	
	public void inicializar(String novaDescr, Tipo novoTipo, double novoPreco)
	{
		setDescr(novaDescr);
		setTipo(novoTipo);
		setPreco(novoPreco);
		
	}
	
	public void setDescr(String descr)
	{
		if(descr != null)
		{
			this.descr = descr;
		}
		else
		{
			System.out.println("Descrição nula");
		}
		
	}
	
	public String getDescr()
	{
		return descr;
	
	}
	
	public void setTipo(Tipo tipo)
	{
		if(tipo != null)
		{
			this.tipo = tipo;
			
		}
		else 
		{
			System.out.println("Tipo nulo");
		}
		
	}
	
	public Tipo getTipo()
	{
		return tipo;
		
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
		imposto = preco*tipo.getPerc()/100;
		
	}
	
	public double getPreco()
	{
		return preco;
		
	}
	
	public double getImposto()
	{
		return imposto;
	}
	
	public void exibir()
	{
		System.out.printf("Descrição %s\nPreço %.2f\n"
				+ "Imposto %.2f\nPreço final %.2f\n", getDescr(),
				 getPreco() , getImposto(), calcularPrecoFinal());

		getTipo().exibir();
		
	}
	
	public double calcularPrecoFinal()
	{
		return (preco+imposto);
	}
	
}

class Tipo
{
	private int cod;
	private double perc;
	
	public Tipo()
	{
		inicializar(1);
	}
	
	public Tipo (int novoCod)
	{
		inicializar(novoCod);
	}
	
	private void inicializar(int novoCod)
	{
		
		setCod(novoCod);
		
	}
	
	public void setCod(int novo)
	{
		if(novo == 1 )
		{
			cod = novo;
			perc = 10;
			
		}
		else if(novo == 2)
		{
			cod = novo;
			perc = 20;
			
		}
		else
		{
			System.out.println("Código Invalido");
			
		}
		
	}
	
	public String getCod()
	{
		switch(cod) 
		{
			case 1: return ("Alimentação");
			
			case 2: return ("Limpeza");
			
			default: return("Código Inválido");
			
		}
		
	}
	
	public double getPerc()
	{
		return perc;
		
	}
	
	public void exibir()
	{
		System.out.printf("Tipo %s e Percentual %.2f\n",getCod(),getPerc() );
	}
}