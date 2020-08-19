package HerançaPolimorfismo;

public class Preguiça extends Animal {

	public Preguiça() {
		super();
	}

	public String emiteSom() {
		return " Late";
	}

	public String fazAcao() {
		return " Correr";
	}

	public String getDados() {
		return "Animal: Cachorro - Nome: "+super.getNome()+
				" - Idade: "+super.getIdade()+"\nSom: "+this.emiteSom()+" - Caracteristica: "+this.fazAcao();
	}
}