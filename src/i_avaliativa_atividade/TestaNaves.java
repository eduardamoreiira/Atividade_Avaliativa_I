package i_avaliativa_atividade;

public class TestaNaves {

	public static void main(String[] args) {
		System.out.println("Olá, seja bem-vindo(a)!");
		System.out.println("Por favor escolha a Nave que deseja operar:");
		
		while(true) {
			int opcao = Digite.lerInteiro("1.Nave de Carga\n2.Nave de Passageiros\n3.Nave de Combate\n4.Sair");
			switch (opcao) {
			case 1:
				String nome = Digite.lerString("Digite o nome da nave: ");
				int velocMaxima = Digite.lerInteiro("Digite a velocidade máxima da nave: ");
				double litros = Digite.lerDouble("Digite a quantidade de combustível que deseja abastecer: ");
				double capacCarga = Digite.lerDouble("Digite a capacidade da carga");
				double carga = Digite.lerDouble("Agora digite a quantidade de carga que deseja carregar na nave:");
				NaveCarga navecarga1 = new NaveCarga();
				navecarga1.setNome(nome);
				navecarga1.setVelocidadeMaxima(velocMaxima);
				navecarga1.abastecer(litros);
				navecarga1.capacidadeCarga = capacCarga;
				navecarga1.carregar(carga);
				System.out.println(navecarga1.toString());
				 while(true) {
					System.out.println("Deseja viajar?");
					int opcao2 = Digite.lerInteiro("1.Sim\n2.Não");
					if(opcao2 == 1) {
						navecarga1.viajar();
						break;
					} else {
						System.out.println("Ok, até a próxima!");
						System.exit(0);
						break;
					}
				}
				break;
				
			case 2:
				String nomeP = Digite.lerString("Digite o nome da nave: ");
				int velocMaximaP = Digite.lerInteiro("Digite a velocidade máxima da nave: ");
				double litrosP = Digite.lerDouble("Digite a quantidade de combustível que deseja abastecer: ");
				int numPassageiros = Digite.lerInteiro("Digite a quantidade de passageiros: ");
				NavePassageiros navepassageiros1 = new NavePassageiros();
				navepassageiros1.setNome(nomeP);
				navepassageiros1.setVelocidadeMaxima(velocMaximaP);
				navepassageiros1.abastecer(litrosP);
				navepassageiros1.numeroPassageiros = numPassageiros;
				System.out.println(navepassageiros1.toString());
				 while(true) {
					System.out.println("Deseja viajar?");
					int opcao2 = Digite.lerInteiro("1.Sim\n2.Não");
					if(opcao2 == 1) {
						navepassageiros1.viajar();
						break;
					} else {
						System.out.println("Ok, até a próxima!");
						break;
					}
				}
				 break;
				 
			case 3:
				String nomeC = Digite.lerString("Digite o nome da nave: ");
				int velocMaximaC = Digite.lerInteiro("Digite a velocidade máxima da nave: ");
				double litrosC = Digite.lerDouble("Digite a quantidade de combustível que deseja abastecer: ");
				String armamento = Digite.lerString("Digite o armamento que deseja incluir: ");
				NaveCombate navecombate1 = new NaveCombate();
				navecombate1.setNome(nomeC);
				navecombate1.setVelocidadeMaxima(velocMaximaC);
				navecombate1.abastecer(litrosC);
				navecombate1.armamento = armamento;
				System.out.println(navecombate1.toString());
				 while(true) {
					System.out.println("Deseja viajar?");
					int opcao2 = Digite.lerInteiro("1.Sim\n2.Não");
					if(opcao2 == 1) {
						navecombate1.viajar();
						break;
					} else {
						System.out.println("Ok, até a próxima!");
						break;
					}
				}	
				 break;
				 
			case 4:
				System.out.println("Saindo do Sistema.");
				break;
			}
			break;
		}
	}
}
