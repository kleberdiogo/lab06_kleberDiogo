package central_games;

public class RPG extends Jogo{

	public RPG(String nome, double preco) {
		super(nome, preco);
		
	}

	@Override
	public int registraJogada(int maiorScore, boolean zerou) {
		super.maiorScore = maiorScore;
		super.quantidadeJogou+=1;
		if(zerou){
			super.quantidadeZeramento++;
		}
		return 10;
	}

	

}
