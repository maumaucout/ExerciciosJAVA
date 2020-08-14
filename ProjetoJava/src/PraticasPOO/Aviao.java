package PraticasPOO;

public class Aviao {
	String cor;
	String modelo;
	double maximoAltura;
	double alturaAtual;
	
	void liga()
	{
		System.out.println("O Avi�o est� ligado! ");
	}
	void acelerar(double quantidade)
	{
		double alturaNova = this.alturaAtual+quantidade;
		this.alturaAtual = alturaNova;
	}
	public String motorAviao()
	{
		if(this.alturaAtual<0)
		{
			return ("parado");
		}
		if(this.alturaAtual>=0 && this.alturaAtual<800)
		{
			return ("Est� subindo");
		}
		if(this.alturaAtual>=200 && this.alturaAtual<=600)
		{
			return ("Continua subindo para atingir altura adequada");
		}
		return ("Est� pr�ximo a altura adequada para viagem segura");
	}
	

}
