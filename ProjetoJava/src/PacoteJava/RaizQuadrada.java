package PacoteJava;

import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		
		if(num%2==0)
		{
			num = Math.sqrt(num);
			System.out.println("Este n�mero � PAR!");
		}
		else 
		{
			num = Math.pow(num, 2);
			System.out.println("Este n�mero � �MPAR!");
		}
		System.out.println("Valor do n�mero digitado: "+num);
	}

}
