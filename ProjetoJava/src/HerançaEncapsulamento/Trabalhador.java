package Heran�aEncapsulamento;

public class Trabalhador {
	public static void main(String args[])
	{
		Empregado p1 = new Empregado();
		p1.setNome("Mauricio Coutinho");
		p1.setEndereco("Rua Mirante do Paranapanema -  N�724");
		p1.setTelefone(940379059);
	
		p1.setCodigoSetor(2);
		p1.setSalarioBase(1.650);
		p1.setImposto(3);
		p1.setSalcal(1.000);
		
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Endere�o: "+p1.getEndereco());
		System.out.println("Telefone: "+p1.getTelefone());
		System.out.printf("C�digo do Setor: %d",p1.getCodigoSetor());
		System.out.printf("\nSal�rio base: R$%.3f",p1.getSalarioBase());
		System.out.printf("\nS�lario total: R$%.3f",p1.getSalcal());

	}
}

