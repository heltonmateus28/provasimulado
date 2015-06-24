package br.iftm.prova3;

public abstract class Produto {

	
	public String nome;
	public int preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Produto(){
		
	}
	public Produto(String nome, int preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public abstract void cadastra(Produto base);
	public abstract void atualiza(int id2,String l1, String l2);
	public abstract void exclui(int id);
	
	
	
}
