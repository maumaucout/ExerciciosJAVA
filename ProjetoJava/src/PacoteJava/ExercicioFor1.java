package PacoteJava;

import java.util.Scanner;

public class ExercicioFor1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x, cont=0;
		System.out.println("Digite um número: ");
		x = ler.nextInt();
		
		for (x=1000; x < 2000;x++)
		
		if (x%11==5)
		{
			System.out.println(x + "");	
		}
			
		
		
		
		
	}
	

}
