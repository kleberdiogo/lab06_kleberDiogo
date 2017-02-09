package central_games;

public class Noob extends Usuario {

	public final int PONTOS_NOOB = 0;
	public final double DESCONTO_NOOB = 0.1;
	public final int PONTOS_CADA_UM_REAL = 10;
	public Noob(String nome, String login, double qntDinheiro) {
		super(nome, login, qntDinheiro);
		super.x2p = this.PONTOS_NOOB;
	}

	

	@Override
	public double addDesconto(double precoJogo) {
		return precoJogo * this.DESCONTO_NOOB;
	}



	@Override
	public int addX2p(double precoJogo) {
		precoJogo = (int)precoJogo;
		super.x2p += (this.PONTOS_CADA_UM_REAL * precoJogo);
		return x2p;
	}

}
