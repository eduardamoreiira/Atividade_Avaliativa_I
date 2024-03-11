package i_avaliativa_atividade;

public class NaveCombate extends NaveEspacial {
	protected String armamento;
	
	public void atacar() {
		System.out.println("A nave está sendo atacada, preparar para utilizar o armamento.");
	}

	@Override
	public String toString() {
		return "NaveCombate [armamento=" + armamento + ", nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima
				+ ", combustivel=" + combustivel + "]";
	}

}
