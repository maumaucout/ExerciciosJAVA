package HerançaEncapsulamento;

public class Trabalhador {
	public static void main(String args[])
	{
		Empregado p1 = new Empregado();
		p1.setNome("Mauricio Coutinho");
		p1.setEndereco("Rua Mirante do Paranapanema -  Nº724");
		p1.setTelefone(940379059);
	
		p1.setCodigoSetor(2);
		p1.setSalarioBase(1.650);
		p1.setImposto(3);
		p1.setSalcal(1.000);
		
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Endereço: "+p1.getEndereco());
		System.out.println("Telefone: "+p1.getTelefone());
		System.out.printf("Código do Setor: %d",p1.getCodigoSetor());
		System.out.printf("\nSalário base: R$%.3f",p1.getSalarioBase());
		System.out.printf("\nSálario total: R$%.3f",p1.getSalcal());

	}
}

