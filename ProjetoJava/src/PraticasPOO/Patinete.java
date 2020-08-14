package PraticasPOO;

public class Patinete {
	String cor;
	String modelo;
	double VelocidadeAtual;
	double VelocidadeMaxima;
	
	void andar()
	{
		System.out.println("O dono do patinete está em movimento!! ");
	}
	void aumentarvelocidade (double quantidade)
	{
		double VelocidadeAtual = this.VelocidadeAtual+quantidade;
		this.VelocidadeAtual = VelocidadeAtual;
	}
	int aumentarEdiminuirVelocidade()
	{
		if(this.VelocidadeAtual<0)
		{
			return (-1);
		}
		if(this.VelocidadeAtual>=0 && this.VelocidadeAtual<15)
		{
			return (10);
		}
		if(this.VelocidadeAtual>=200 && this.VelocidadeAtual<=25)
		{
			return (20);
		}
		return (30);
	}

}
