package ClassesAbstract;

public class TelefoneCelular extends Telefone {
	public TelefoneCelular()
	{
		super ("Celular");
	}
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("Hello MOTO, trimmm,. trimmm");
			break;
			
		case 2:
			System.out.println("TUTSSSS, TUTSSS, TUTSSSS...");
			break;
			default:
				System.out.println("SALVE O TRICOLOR PAULISTA!!!!");
				break;
		}
	}
	public void disca(String numero)
	{
		System.out.println("Discando: "+numero);
		
	}

}
