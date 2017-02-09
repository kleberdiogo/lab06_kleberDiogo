package central_games;

public abstract class Jogo {
	
	private String nome;
	private double preco;
	protected int maiorScore; 
	protected int quantidadeZeramento;
	protected int quantidadeJogou;
	
	public Jogo(String nome, double preco){
		this.setNome(nome);
		this.setPreco(preco);
		this.maiorScore = 0;
		this.quantidadeZeramento = 0;
		this.quantidadeJogou = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getMAIOR_ESCORE() {
		return maiorScore;
	}

	public int getQUANTIDADE_ZERAMENTO() {
		return quantidadeZeramento;
	}

	public int getQUANTIDADE_JOGOU() {
		return quantidadeJogou;
	}
	
	public abstract int registraJogada(int maiorScore, boolean zerou);
		
	
}







	





