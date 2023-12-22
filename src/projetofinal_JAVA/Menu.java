package projetofinal_JAVA;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
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

			opcao = leia.nextInt();

			if (opcao == 4) {
				System.out.println("\n Obrigada por apoiar nosso Brechó online, curadoria de peças feitas com afeto pra você!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Listar Peças");

					break;
				case 2:
					System.out.println("Adicionar Produtos");

					break;
				case 3:
					System.out.println("Remover Produtos");

					break;
				case 4:
					System.out.println("Finalizar Compra");
					
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

