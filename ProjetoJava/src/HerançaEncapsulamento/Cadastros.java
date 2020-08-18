package HerançaEncapsulamento;

public class Cadastros {
	public static void main (String args[])
	{
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Luis Generation");
		pessoa01.setEndereco("Direto do Litoral para o MUNDO!!!");
		pessoa01.setTelefone(930958040);
		
		System.out.println("Nome: "+pessoa01.getNome());
		System.out.println("Endereço: "+pessoa01.getEndereco());
		System.out.println("Telefone: "+pessoa01.getTelefone());
		
		Pessoa pessoa02 = new Pessoa();
		pessoa02.setNome("Camila Generation");
		pessoa02.setEndereco("Da Generation para o MUNDO!!!");
		pessoa02.setTelefone(945903027);
		
		System.out.println("\nNome: "+pessoa02.getNome());
		System.out.println("Endereço: "+pessoa02.getEndereco());
		System.out.println("Telefone: "+pessoa02.getTelefone());
	}
}
