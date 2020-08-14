package PraticasPOO;

public class TestePatinete {
	public static void main (String args[])
	{
		Patinete meuPatinete = new Patinete();
		meuPatinete.cor = ("BLUEZINN");
		meuPatinete.modelo = ("Traxart");
		meuPatinete.VelocidadeAtual = 0;
		meuPatinete.VelocidadeMaxima = 30;
		
		meuPatinete.andar();
		meuPatinete.aumentarvelocidade(20);
		System.out.println(meuPatinete.VelocidadeAtual);
		System.out.println("\nModelo do PATINETE: "+ meuPatinete.modelo+"\nCor do PATINETE: "+meuPatinete.cor);
		
		
	}

}
