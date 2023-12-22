package projetofinal_JAVA;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import projetofinal_JAVA.model.Cliente;
import projetofinal_JAVA.model.Produto;


public class Menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		String nome;
		
		ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Camiseta", 50.00));
        produtos.add(new Produto("Calça", 70.00));
        produtos.add(new Produto("Sapato", 100.00));

       
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("      ❤️  Bem-vinde ao e-Brechó da Filomena  ❤️      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar Peças Disponíveis             ");
			System.out.println("            2 - Adicionar Produtos                   ");
			System.out.println("            3 - Remover Produto                      ");
			System.out.println("            4 - Finalizar compra                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			

		
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite um número das opções acima!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 4) {
				System.out.println("\n Obrigada por apoiar nosso Brechó online, curadoria de peças feitas com afeto pra você!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			
			switch (opcao) {
				case 1:
					System.out.println("Listar Peças");
		
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }

					break;
				case 2:
					System.out.println("Adicionar Produtos");
					System.out.println("Digite o nome do produto:");
					leia.skip("\\R?");
					nome = leia.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double preco = leia.nextDouble();
                    produtos.add(new Produto(nome, preco));
					
					break;
				case 3:
					System.out.println("Remover Produtos");
					System.out.println("Digite o nome do produto a ser removido:");
					leia.skip("\\R?");
					nome = leia.nextLine();
					for (int indice = 0; indice < produtos.size(); indice++) {
						if (produtos.get(indice).getNome().equals(nome)) {
							produtos.remove(indice);
							break;
						}
					}
                        
                    
				case 4:
					System.out.println("Finalizar Compra");
					 System.out.println("Obrigado pela compra!");
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Natália Oliveira ");
		System.out.println("github.com/nataliabpo");
		System.out.println("*********************************************************");
	}

		
	}

