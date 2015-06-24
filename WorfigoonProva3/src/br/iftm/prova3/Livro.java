package br.iftm.prova3;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Entity
@NamedQuery(name="Livro.findByString", 
query="SELECT c FROM Livro c WHERE c.nome = :param")
public class Livro extends Produto{
	
	@Id
	@GeneratedValue
	private int id;
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	static EntityManager em = factory.createEntityManager();
	
	public String nome;
	public int preco;
	
	public int getId() {
		return id;
	}
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
	public Livro(){
		
	}
	public Livro(String nome, int preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	@Override
	public void cadastra(Produto livro) {
		DBConnection.getInstance().getEm().getTransaction().begin();
		DBConnection.getInstance().getEm().persist(livro);
		DBConnection.getInstance().getEm().getTransaction().commit();
		
		
	}

	@Override
	public void atualiza(int id3, String l1, String l2) {
		Livro p2 = em.find(Livro.class,id3);
		
		DBConnection.getInstance().getEm().getTransaction().begin();
		p2.setNome(l1);
		p2.setPreco(Integer.parseInt(l2));
		DBConnection.getInstance().getEm().getTransaction().commit();
	}

	@Override
	public void exclui(int id) {
		
		Livro p1 = em.find(Livro.class,id);
		
		DBConnection.getInstance().getEm().getTransaction().begin();
		DBConnection.getInstance().getEm().remove(p1);
		DBConnection.getInstance().getEm().getTransaction().commit();
		
	}

	


}
