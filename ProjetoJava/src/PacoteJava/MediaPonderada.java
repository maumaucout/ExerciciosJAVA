package PacoteJava;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;



public class MediaPonderada {
	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
	//Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.

	public static String arredondar(double media) {
		   DecimalFormat df = new DecimalFormat("0.00");
		   df.setRoundingMode(RoundingMode.HALF_UP);
		   return df.format(media);
		}
	//Quis testar um m�todo para arredondar nativo do Java, e ele � �timo.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double n1,n2,n3,mp; //Nota 1, 2 e 3 e a m�dia ponderada
		System.out.print("Digite a nota 1, 2 e 3: \n");
		n1 = s.nextDouble();

		n2 = s.nextDouble();

		n3 = s.nextDouble();

		mp = ((2*n1+3*n2+5*n3)/10.0);
		System.out.println("A m�dia final foi:  "+arredondar(mp));



	}
} 