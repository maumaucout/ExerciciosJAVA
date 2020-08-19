package TestandoInterfaces;

public interface TesteInterface {
	public static void main (String args[])
	{
		ParticipanteForum participante = new ParticipanteForum();
		Lendo lendo = participante;
		System.out.println("O Participante está lendo: "+lendo.lendo());
		Programador programador = participante;
		String java = "JAVA-Interface";
		programador.pensando(java.toCharArray());
		System.out.println("\nE programando: " + programador.digitando());
		
		
		
		
	}

}
