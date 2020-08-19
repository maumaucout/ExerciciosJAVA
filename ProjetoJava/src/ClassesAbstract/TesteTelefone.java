package ClassesAbstract;

public class TesteTelefone {
	public static void main(String args[])
	{
		TelefoneCelular celular = new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();
		
		Telefone telefone=null;
		
		int n = (int) (Math.random()*3.0);
		System.out.println(n);
		switch(n)
		{
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default: System.out.println("Op��o inv�lida amigo, tente novamente....");
		
		}
		if(telefone!=null)
		{
			telefone.disca("94037 9059");
			telefone.toca(2);
			
		}
		
	}

}
