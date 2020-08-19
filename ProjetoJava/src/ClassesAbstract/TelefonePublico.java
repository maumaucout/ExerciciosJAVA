package ClassesAbstract;

public class TelefonePublico extends Telefone {
	public TelefonePublico()
	{
		super("Público");
	}
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("TUU... TUU... TUU...");
		}
	}
	public void disca(String numero)
	{
		if(numero.charAt(0) == '9')
		{
			System.out.println("Este telefone não faz ligação para celular...");
		}
		else
		{
			System.out.println("Discando: "+numero);
		}
	}

}
