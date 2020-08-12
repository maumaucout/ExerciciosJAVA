package PacoteJava;

import java.util.Scanner;

public class Exercicio3While {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, idade_21=0, idade_50=0;
		
		while (idade <=98)
		{
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if (idade < 21)
			{
				idade_21=idade_21+1;
			}
			if (idade > 50)
			{
				idade_50=idade_50+1;
			}
				
		}
		
		System.out.println("Idade menor que 21:"+idade_21);
		System.out.println("Idade maior que 50:"+idade_50);	
		
	}
	

}
