package PacoteJava;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String args[])
	{
		int a, b, c;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = ler.nextInt();
		
		if (a <= b && b <= a)
		{
			System.out.println("Ordem crescente: "+a+", "+b+", "+c);
			
		}
		else if (a <= c && c <= b)
			{
				System.out.println("Ordem crescente: "+a+", "+c+", "+b);
			}
		else if (b <= a && a <= c)
			{
				System.out.println("Ordem crescente: "+b+", "+a+", "+c);
			}
		else if (b <= c && c <= a)
			{
				System.out.println("Ordem crescente: "+b+", "+c+", "+a);
			}
		else if (c <= a && a <= b)
			{
				System.out.println("Ordem crescente: "+c+", "+a+", "+b);
			}
		else 
			{
				System.out.println("Ordem crescente: "+c+", "+b+", "+a);
			}
		
		
	}

}
