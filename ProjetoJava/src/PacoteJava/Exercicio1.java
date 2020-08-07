package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[])
	{
		int ano, mes, dia, td;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de anos:  ");
		ano = ler.nextInt();
		System.out.println("Digite a quantidade de meses:  ");
		mes = ler.nextInt();
		System.out.println("Digite a quantidade de dias:  ");
		dia = ler.nextInt();
		
		td = ano*365+mes*30+dia;
		
		System.out.println("Você vivei:  "+td+"dias de vida.......");
		
		
	}

}
