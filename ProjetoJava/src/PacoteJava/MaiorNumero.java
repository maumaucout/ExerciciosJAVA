package PacoteJava;

import java.util.Scanner;

public class MaiorNumero {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a > b && a > c)
		{
			System.out.println("O maior valor eh: "+a);
		}
		else if (b > a && b > c)
			{
				System.out.println("O maior valor eh: "+b);
			}
		else 
			{
				System.out.println("O maior valor eh: "+c);
			}
			
		
		
}
	
}
