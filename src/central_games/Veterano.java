package central_games;

public class Veterano extends Usuario{

	public final int PONTOS_VETERANO = 1000;
	public final double DESCONTO_VETERANO = 0.2;
	public final int PONTOS_CADA_UM_REAL = 15;
	public Veterano(String nome, String login, double qntDinheiro) {
		super(nome, login, qntDinheiro);
		super.x2p = PONTOS_VETERANO;
	}



	@Override
	public double addDesconto(double precoJogo) {
		return precoJogo * this.DESCONTO_VETERANO;
	}



	@Override
	public int addX2p(double precoJogo) {
		precoJogo = (int)precoJogo;
		super.x2p += (this.PONTOS_CADA_UM_REAL * precoJogo);
		return x2p;
	}
	
	

}
