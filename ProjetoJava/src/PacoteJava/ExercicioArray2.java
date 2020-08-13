package PacoteJava;

import java.util.Scanner;

public class ExercicioArray2 {
	public static void main (String args[])
	{		
		int vetor[] = new int[6], somapar=0, quantimpar=0;
		Scanner ler = new Scanner(System.in);
		
		for (int x=0;x<6;x++)
		{
			System.out.println("Digite um valor: ");
			vetor[x] = ler.nextInt();
			if (vetor[x]%2==0)
			{
				System.out.println("\nEste valor é par: "+vetor[x]);
				somapar = somapar+vetor[x];
			}
			else
			{
				System.out.println("\nEste valor é impar: "+vetor[x]);
				quantimpar++;
			}
		}
		System.out.println("\nSoma dos números pares: "+somapar);
		System.out.println("\n15Quantidade de números impares: "+quantimpar);
	}
	
	

}
