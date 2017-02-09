package central_games;

public class Luta extends Jogo {

	public Luta(String nome, double preco) {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int maiorScore, boolean zerou) {
		
		super.quantidadeJogou ++;
		if(zerou){
			super.quantidadeZeramento++;
		}
		int pontos = 0;
		if(super.maiorScore <  maiorScore){
			super.maiorScore = maiorScore;
			pontos += maiorScore /1000;
		}
		return pontos;
	}

	
}
