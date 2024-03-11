package i_avaliativa_atividade;

public abstract class NaveEspacial {
	
	//atributos 
	protected String nome;
	protected int velocidadeMaxima;
	protected double combustivel;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public double getCombustivel() {
		return combustivel;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	//método para acelerar
	public double acelerar(double velocidade) {
		return velocidade + velocidade;
	}
	
	//método para desacelerar
	public boolean desacelerar(double velocidade) {
		if(velocidade <= velocidade) {
			velocidade -= velocidade;
			return true;
		} else {
			System.out.println("A velocidade atual é menor que a desaceleração!");
			return false;
		}
	}
	
	//método para abastecer
	public double abastecer(double litros) {
		return this.combustivel += litros;
	}
	
    public void viajar() {
    	double distancia1 = Digite.lerDouble("Digite a distância que deseja percorrer: ");
        double consumo = distancia1 * 0.1; // Exemplo de consumo: 0.1 litro por km
        if (combustivel >= consumo) {
            combustivel -= consumo;
            System.out.println("Viagem concluída. Consumo de combustível: " + consumo + " litros.");
        } else {
            System.out.println("Não há combustível suficiente para viajar essa distância.");
        }
    }
	
}
