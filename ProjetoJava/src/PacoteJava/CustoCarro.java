package PacoteJava;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CustoCarro {
	/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.*/
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		double custonovo, cfabrica, dist, imp;// Declara custo novo, custo de f�brica, % do dist, e % de impostos
		System.out.print("Digite o custo de f�brica\n");
		cfabrica = s.nextDouble();
		dist = 0.28;
		imp = 0.45;
		custonovo = cfabrica + cfabrica*dist + cfabrica*imp;
		System.out.println("O custo do carro novo � de R$ "+rnd(custonovo));
	}

	public static String rnd(double n) { //pode se usar pra arredondar o resultado
	   DecimalFormat df = new DecimalFormat("0.00");
	   df.setRoundingMode(RoundingMode.HALF_UP);
	   return df.format(n);
	}
}