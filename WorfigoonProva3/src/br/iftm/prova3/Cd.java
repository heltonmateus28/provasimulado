package br.iftm.prova3;

public class Cd extends Produto {

	public String nome;
	public double preco;
	
	public Cd(){
		
	}
	public Cd(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	@Override
	public void cadastra(Produto Cd) {
		DBConnection.getInstance().getEm().getTransaction().begin();
		DBConnection.getInstance().getEm().persist(Cd);
		DBConnection.getInstance().getEm().getTransaction().commit();
	}

	@Override
	public void atualiza(int id,String l1, String l2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exclui(int id) {
		// TODO Auto-generated method stub
		
	}

}
