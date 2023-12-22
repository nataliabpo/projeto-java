package projetofinal_JAVA.model;

import java.util.List;

public class Cliente_cadastro extends Cliente {
	private double desconto;

	public Cliente_cadastro(String nome, String cpf, double desconto) {
		super(nome, cpf);
		this.desconto = desconto;
	}

	public double calcularTotal(List<Produto> produtos) {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total * (1 - desconto);
	}
}
