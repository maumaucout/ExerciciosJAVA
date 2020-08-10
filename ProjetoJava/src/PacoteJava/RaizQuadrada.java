package PacoteJava;

import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if(num%2==0)
		{
			num = Math.sqrt(num);
			System.out.println("Este número é PAR!");
		}
		else 
		{
			num = Math.pow(num, 2);
			System.out.println("Este número é ÍMPAR!");
		}
		System.out.println("Valor do número digitado: "+num);
	}

}
