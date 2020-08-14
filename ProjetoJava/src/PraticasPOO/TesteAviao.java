package PraticasPOO;

public class TesteAviao {
	public static void main (String args[])
	{
		Aviao NovoAviao = new Aviao();
		NovoAviao.cor = "Laranja e Branco";
		NovoAviao.modelo = "GenerationBRASIL";
		NovoAviao.alturaAtual = 0;
		NovoAviao.maximoAltura = 110000;
		
		NovoAviao.liga();
		
		NovoAviao.acelerar(11000);
		System.out.println(NovoAviao.alturaAtual);
		System.out.println("\nModelo: "+NovoAviao.modelo+"\nCor: "+NovoAviao.cor);
		
	}
	

}
