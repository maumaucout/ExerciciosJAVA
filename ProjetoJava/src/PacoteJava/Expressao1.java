package PacoteJava;

import java.util.Scanner;

public class Expressao1 {
	//Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:
	//D=(R+S)/2 onde R=(A+B)^2 e S=(B+C)^2

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A,B,C,D,R,S;
		System.out.print("Digite A, B e C\n");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		R = (int) Math.pow((A+B),2);
		S = (int) Math.pow((B+C),2);
		D = (R+S)/2;
		System.out.println("O resultado dessa express�o �: "+D);

	}

}