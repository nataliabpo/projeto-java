package projetofinal_JAVA.model;

public class Produto {

	private String nome;
	private double preco1;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco1 = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco1;
	}

	public void setPreco(double preco) {
		this.preco1 = preco;
	}

	// Novo atributo privado
	private double preco;

	@Override
	public String toString() {
		return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco1 + '}';
	}

}
