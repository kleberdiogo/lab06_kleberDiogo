package central_games;

import java.util.ArrayList;

public abstract class Usuario {
	private String nome;
	private String login;
	private double qntDinheiro;
	protected ArrayList<Jogo> jogosComprados;
	protected int x2p;

	public Usuario(String nome, String login, double qntDinheiro){
		this.setNome(nome);
		this.setLogin(login);
		this.setQntDinheiro(qntDinheiro);
		this.setJogosComprados(new ArrayList<>());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public double getQntDinheiro() {
		return qntDinheiro;
	}

	public void setQntDinheiro(double qntDinheiro) {
		this.qntDinheiro = qntDinheiro;
	}

	public ArrayList<Jogo> getJogosComprados() {
		return jogosComprados;
	}

	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}

	public void addJogo(Jogo jogo){
		this.jogosComprados.add(jogo);
	
	}
	public Jogo pesquisaJogo(String nomeJogo){
		for (Jogo jogo : jogosComprados) {
			if(jogo.getNome().equalsIgnoreCase(nomeJogo)){
				return jogo;
			}
		
		}
		return null;
	}
	
	public abstract double addDesconto(double precoJogo);

	public abstract int addX2p(double precoJogo);

	public void registraJogada(String nomeDoJogo, int maiorScore, boolean zerou){
		Jogo jogo = this.pesquisaJogo(nomeDoJogo);
		this.x2p += jogo.registraJogada(maiorScore, zerou);
	
	}

}
