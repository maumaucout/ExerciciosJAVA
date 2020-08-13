package PacoteJava;

import java.util.Scanner;

public class ExercicioMatriz4 {
	public static void main(String args[])
	{
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		float valor;
		int op;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Matriz1: ");
				matriz1[i][j] = ler.nextFloat();
				System.out.println("Matriz2: ");
				matriz2[i][j] = ler.nextFloat();
			}
		}
		System.out.printf("1 -- Soma as Matrizes\n2 -- Subtrai as matrizes\n3 -- Adicionar uma constante as duas matrizes\n4 -- Imprimir as matrizes ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz3[i][j] = matriz1[i][j]+matriz2[i][j];
					System.out.println("Soma das matrizes: "+matriz3[i][j]);
				}
			}
			break;
		case 2:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz3[i][j] = matriz2[i][j]-matriz1[i][j];
					System.out.println("Subtração das matrizes: "+matriz3[i][j]);
				}
			}
			break;
		case 3:
			System.out.println("Entre com um valor: ");
			valor = ler.nextFloat();
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz1[i][j] = matriz1[i][j]+valor;
					System.out.println("Matriz1: "+matriz1[i][j]);
					matriz2[i][j] = matriz2[i][j]+valor;
					System.out.println("Matriz2: "+matriz2[i][j]);
				}
			}
			break;
		case 4:
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println("Matriz1: "+matriz1[i][j]);
				}
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println("Matriz2: "+matriz2[i][j]);
				}
			}
			break;
			default:
				System.out.println("Opção inválida!!!");
			
		}
		
	}
}
