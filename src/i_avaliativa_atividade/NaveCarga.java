package i_avaliativa_atividade;

public class NaveCarga extends NaveEspacial{
	protected double capacidadeCarga;
	
	public boolean carregar(double carga) {
		if(carga <= capacidadeCarga) {
			System.out.println("Carga carregada.");
			return true;
		} else {
			System.out.println("Não carrega, pois a carga é maior que a capacidade da nave.");
			return false;
		}
	}

	@Override
	public String toString() {
		return "NaveCarga [capacidadeCarga=" + capacidadeCarga + ", nome=" + nome + ", velocidadeMaxima="
				+ velocidadeMaxima + ", combustivel=" + combustivel + "]";
	}

}
