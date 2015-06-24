package br.iftm.prova3;

public class Dvd extends Produto {

	public String nome;
	public double preco;
	
	public Dvd(){
		
	}
	@Override
	public void cadastra(Produto Dvd) {
		DBConnection.getInstance().getEm().getTransaction().begin();
		DBConnection.getInstance().getEm().persist(Dvd);
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
