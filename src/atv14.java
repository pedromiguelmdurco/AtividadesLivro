import java.util.Scanner;

public class atv14 {

	public static void main(String[] args)
	{
		
		Scanner entrada = new Scanner (System.in);
		
		int ano, anoA, mes, mesA, idaA, idaM, idaD, idaS;
		
		System.out.print("Digite o ano que você nasceu: ");
		ano = entrada.nextInt();
		
		System.out.print("Digite o ano atual: ");
		anoA = entrada.nextInt();
		
		System.out.print("Digite o mês que você nasceu(ps:coloque em numero) :");
		mes = entrada.nextInt();
		
		System.out.print("Digite o mês que você esta(ps:coloque em numero) :");
		mesA = entrada.nextInt();
		
		
		if(mes > mesA) 
		{
			idaA = anoA - ano - 1;
			idaM = idaA* 12 + (12 - mes) + mesA;
		}else 
		{
			idaA = anoA - ano;	
			idaM = idaA*12 + (mesA-mes);
		}
		
		
		idaD = idaM* 30;
		idaS = idaM*4;
		
		System.out.println("a) "+ idaA);
		System.out.println("b) "+ idaM);
		System.out.println("c) "+ idaD);
		System.out.println("d) "+ idaS);
		
		entrada.close();
	}

}
