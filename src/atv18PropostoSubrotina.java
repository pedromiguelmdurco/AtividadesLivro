
public class atv18PropostoSubrotina {

	public static void main(String[] args) {
		boolean ePrimo=true;
		int valor = 100, num=2, conta = 0;
		
		while(conta< 3)
		{
			num = 2;
			ePrimo = true;
			while(ePrimo && num<= valor/2)
			{
			
				if(valor%num == 0)
				{
				
					ePrimo = false;
				
				}
				num++;
			
			}
		
			if(ePrimo)
			{
				conta++;
				System.out.println("É primo "+valor);
			}
			
			
			valor ++;
				
		}
		
		

	}

}
