package i_avaliativa_atividade;

public class NavePassageiros extends NaveEspacial {
	protected int numeroPassageiros;
	
	public void embarcar(int passageiros) {
		this.numeroPassageiros += passageiros;
		System.out.println("Passageiros embarcados");
	}

	@Override
	public String toString() {
		return "NavePassageiros [numeroPassageiros=" + numeroPassageiros + ", nome=" + nome + ", velocidadeMaxima="
				+ velocidadeMaxima + ", combustivel=" + combustivel + "]";
	}

}
