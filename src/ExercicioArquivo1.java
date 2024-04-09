import java.io.File;
import java.util.Scanner;

public class ExercicioArquivo1 {

	public static void main(String[] args) {
		
		Disciplina[] curso = new Disciplina[2];
		int num = 0;
		
		try
		{
			File arqAlunos = new File("C:\\Users\\envio\\Desktop\\Aulas puc\\AEd\\alunos.txt");
			Scanner entradaAlunos = new Scanner (arqAlunos);
			File arqDisc = new File("C:\\Users\\envio\\Desktop\\Aulas puc\\AEd\\disciplinas.txt");//criar arquivos
			Scanner entradaDisc = new Scanner(arqDisc);
			String linha;
			String[] infos;
			boolean existeDisc;
			int posDisc, contaAluno;
			Aluno[] alunos = new Aluno[60];
			
			while (entradaDisc.hasNextLine())
			{
				linha = entradaDisc.nextLine();
				infos = linha.split(",");
				
				curso[num] = new Disciplina();
				curso[num].setNome(infos[0]);
				curso[num].setMaximo(Integer.parseInt(infos[1]));
				curso[num].setSala(Integer.parseInt(infos[2]));
				
			
				curso[num].exibir();
				
				num++;
			}
	
		
			existeDisc = false;
			posDisc = -1;
			contaAluno = 0;
			while (entradaAlunos.hasNextLine())
			{
				linha = entradaAlunos.nextLine();
				if (linha.indexOf(",") > 0 && posDisc >= 0 && contaAluno < alunos.length)  // dados do aluno
				{					
					infos = linha.split(",");
					alunos[contaAluno] = new Aluno();
					alunos[contaAluno].setNome(infos[0]);
					alunos[contaAluno].setIdade(Integer.parseInt(infos[1]));
					contaAluno++;					
				}
				else // nome da disciplina
				{
					// atualizar lista de alunos na disciplina anterior
					if (alunos != null && existeDisc) 
					{
						curso[posDisc].setAlunos(alunos);
						existeDisc = false;
					}
					for (int i=0; i < curso.length; i++)
					{
						if (curso[i].getNome().equals(linha))
						{
							existeDisc = true;
							posDisc = i;
							alunos = new Aluno[curso[i].getMaximo()];
							contaAluno = 0;
						}
					}
				}
					
			}
			// atualizar lista de alunos da última disciplina
			if (alunos != null && existeDisc) 
			{
				curso[posDisc].setAlunos(alunos);
			}
			
			for (int i=0; i < curso.length; i++)
			{
				System.out.println("****** DISCIPLINA *******");
				curso[i].exibir();				
			}

			entradaDisc.close();
			entradaAlunos.close();
		}
		catch (Exception ex)
		{
			System.out.println("ERRO - " + ex.getMessage());
		}
	}

}

class Aluno
{
	private String nomeAluno;
	private int idade;
	
	public Aluno()
	{
		inicializar("nenhum",1);
	}
	public Aluno (String nome, int idade)
	{
		inicializar(nome, idade);
	}
	
	private void inicializar (String novoNome, int novaIdade)
	{
		setNome(novoNome);
		setIdade(novaIdade);
	}
	
	public void setNome (String texto)
	{
		if (texto != null)
		{
			nomeAluno = texto;
		}
		else
		{
			System.out.println("Erro - nome do aluno inválido");
		}
	}
	public String getNome ()
	{
		return nomeAluno;
	}
	
	public void setIdade(int valor)
	{
		if (valor > 0)
		{
			idade = valor;
		}
		else
		{
			System.out.println("Erro - idade inválida");
		}
	}
	public int getIdade()
	{
		return idade;
	}
	
	public void exibir()
	{
		System.out.println(nomeAluno + " " + idade);
	}
}

class Disciplina
{
	private String nomeDisciplina;
	private Aluno[] alunosMatriculados;
	private int maxAlunos, ocupacao, numSala;
	
	public Disciplina()
	{	    
		inicializar("nenhum", new Aluno[60], 0, 1);
	}
	
	public Disciplina (String nome, Aluno[] alunos, 
			           int maxTurma, int ocup, int sala)
	{
		inicializar(nome,alunos,maxTurma,sala);
	}
	
	private void inicializar (String nome, Aluno[] alunos, 
								int maxTurma, int sala)
	{
		setNome(nome);
		setAlunos(alunos);
		setMaximo(maxTurma);
		setSala (sala);
	}
	
	
	public void setNome (String nome)
	{
		if (nome != null)
		{
			nomeDisciplina = nome;
		}
		else
		{
			System.out.println("Erro - nome da disciplina inválido");
		}
	}
	public String getNome ()
	{
		return nomeDisciplina;
	}
	
	public void setMaximo (int valor)
	{
		if (valor >= 0)
		{
			maxAlunos = valor;
			alunosMatriculados = new Aluno[maxAlunos];
		}
		else 
		{
			System.out.println("Erro - máximo de alunos inválido");
		}
	}
	public int getMaximo ()
	{
		return maxAlunos;
	}
	
	public int getOcupacao()
	{
		return ocupacao;
	}
	
	public void setSala (int valor)
	{
		if (valor > 0)
		{
			numSala = valor;
		}
		else
		{
			System.out.println("Erro - número da sala inválido");
		}
	}
	public int getSala()
	{
		return numSala;
	}
	
	public void setAlunos (Aluno[] vetor)
	{
		if (vetor != null)
		{
			alunosMatriculados = vetor;
			for (int i=0; i < vetor.length; i++)
			{
				if (vetor[i] != null)
				{
					ocupacao++;
				}
			}
		}
		else
		{
			System.out.println("Erro - lista de alunos inválida");
		}
	}
	
	public Aluno[] getAlunos ()
	{
		return alunosMatriculados;
	}
	
	public void exibir()
	{
		System.out.println(nomeDisciplina + " - " + maxAlunos
				+ " - " + ocupacao + " - " + numSala);
		for (int i=0; i < ocupacao; i++)
		{
			alunosMatriculados[i].exibir();
		}
	}
}