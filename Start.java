package principal;

import java.util.Locale;
import java.util.Scanner;
import modelos.Cliente;
import modelos.Categoria;
import modelos.Menu;
import modelos.Produto;

public class Start {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Instanciando o Scanner
		scan.useLocale(Locale.US); // Muda maualmente o sistema pt-BR para US em usar (ponto) 
		Menu men = new Menu(); // Instanciando os Menus
		Produto prod = new Produto(); // Instanciando Produto
		Cliente clt = new Cliente(); // Instanciando Cliente
		
		int opt;
		
		do { // loop de repetição do Menu Principal usando do-While
			men.exibirMenu();
			System.out.print(" DIGITE UMA OPÇÃO: ");
			opt = scan.nextInt();
			
			switch(opt) { // Opções de casos utilizando os cases do switch!
			
			case 1: // Opção de cadastro 
				
				int optcad;
				
				do {
					men.exibirManutencao();
					System.out.print(" DIGITE UMA OPÇÃO: ");
					optcad = scan.nextInt();
						
						if (optcad == 4) {
							break; // encerra o loop do-While dentro do case 1
							
						} if (optcad == 1){ // Primeira opção para cadastrar produtos
							
							prod.exibirNom(); // exibe uma interface de nome
							System.out.print(" DIGITE O NOME DO PRODUTO: ");
							String nomprod = scan.nextLine();
							scan.nextLine(); // limpa o buff \n
							prod.nomes.add(nomprod); // adiciona o nome capturado e armazena na lista (nomes) da classe Produto
							
							prod.exibirPreco();
							System.out.print(" QUAL O PREÇO DO PRODUTO: ");
							double precoprod = scan.nextDouble();
							scan.nextLine();
							prod.preco.add(precoprod); // adiciona o preço capturado e armazena na lista (preco) da classe Produto
							
							prod.exibirIsbn();
							System.out.print(" DIGITE O ISBN DO PRODUTO: ");
							String isbnprod = scan.nextLine();
							prod.isbn.add(isbnprod); // adiciona o isbn capturado e armazena na lista (isbn) da classe Produto
							
							int catprod; // declaração da variavel fora do loop do-While para atualização de vezes escolhida pelo usuario
							do {
								prod.exibirCateg();
								System.out.print(" QUAL A CATEGORIA DO PRODUTO (1-16): ");
								catprod = scan.nextInt();
								scan.nextLine();
								prod.incrementarCategoria(catprod); // incrementa a categoria apos a validação entre as opções
							
							} while (catprod <= 0 || catprod >= 17); // loop para condição caso minha categoria seja invalida. 
							
							continue; // continua para o loop do-While dentro do case 1
							
						} if (optcad == 2) { // Segunda opção para cadastrar Clientes
							
							clt.exibirNomeClient();
							System.out.print(" DIGITE O NOME DO CLIENTE: ");
							String name = scan.nextLine();
							scan.nextLine();
							clt.nomesClient.add(name);
							
							clt.exibirCpfClient();
							System.out.print(" DIGITE O CPF DO CLIENTE: ");
							String cpf = scan.nextLine();
							scan.nextLine();
							clt.cpfClient.add(cpf);
							
							clt.exibirEndClient();
							System.out.print(" DIGITE O ENDEREÇO DO CLIENTE: ");
							String end = scan.nextLine();
							scan.nextLine();
							clt.endClient.add(end);
							
							clt.exibirNumClient();
							System.out.print(" DIGITE O NÚMERO DO CLIENTE: ");
							double numc = scan.nextDouble();
							scan.nextLine();
							clt.numClient.add(numc);
							
							clt.exibirSucessClient(); // exibir uma mensagem de "cadastro sucess"
							continue; // continua para o loop do-While dentro do case 1
							
						} if (optcad == 3) {
							System.out.println("Cadastrar vendedor!");
							return;
						} else {
							men.exibirError();
						}
					
				} while (optcad != 1 || optcad != 2 || optcad != 3 || optcad != 4); // Comparação do loop de acordo com minha entrada dentro do case 1 
				
				break; // encerra o switch case
				
			case 2: // Opção de Consultas
				men.exibirConsultas();
				return;
				
			case 3: // Opção de Iniciação de Vendas
				men.exibirVenda();
				return;
				
			case 4: // Finaliza o loop do-While e encerra o programa. 
				men.exibirSaida();
				return;
				
			default: // Quando não ha uma opção numerica valida! 
				men.exibirError();
			}
			
		} while (opt != 4); // Condição de encerrar o programa.
		
		
		
	}

}
