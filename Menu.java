package modelos;

public class Menu {
	
	/*
	 * Ao iniciar a aplicação, o sistema deve apresentar o seguinte menu principal:
	 * 
	 * - 1. Manutenção de Cadastro
	 * 
	 * O menu de **Manutenção de Cadastro** deve permitir:
	 * 
	 * 1. **Cadastro de Produto** - Permite gerenciar produtos no sistema. 
	 * 2. **Cadastro de Cliente** - Permite gerenciar clientes.
	 * 3. **Cadastro de Vendedor** - Permite gerenciar vendedores.
	 * 4. **Voltar** - Retorna ao menu principal.
	 * 
	 * - 2. Consultas
	 * 
	 * O menu de **Consultas** deve permitir:
	 * 
	 * 1. **Consultar Produtos por Categoria** - Exibe os produtos disponíveis em uma determinada categoria. 
	 * 2. **Consultar Cliente por CPF** - Exibe informações de um cliente específico, com base no CPF. 
	 * 3. **Consultar Vendedor por CPF** - Exibe informações de um vendedor específico, com base no CPF. 
	 * 4. **Listar Vendas** - Exibe todas as vendas realizadas. 
	 * 5. **Voltar** - Retorna ao menu principal. 
	 * 
	 * - 3. Iniciar Venda
	 * 
	 * Quando o usuário escolher a opção **Iniciar Venda**, o sistema deve apresentar as seguintes opções:
	 * 
	 * 1. **Adicionar Produto** - Permite adicionar produtos à venda. 
	 * 2. **Remover Produto** - Permite remover produtos adicionados à venda. 
	 * 3. **Calcular Total** - Exibe o valor total da venda. 
	 * 4. **Associar Cliente** - Permite associar um cliente à venda, utilizando o CPF. 
	 * 5. **Associar Vendedor** - Permite associar um vendedor à venda, utilizando o CPF. 
	 * 6. **Concluir Venda** - Finaliza a venda e registra no sistema. 
	 * 7. **Cancelar Venda** - Cancela a venda em andamento e retorna ao menu principal. 
	 * 
	 * - 4. Sair
	 */
	
	public String MenuPrincipal = """
			╔═══════════════════════════════════════════════╗ 
			             📚 SISTEMA DE LIVRARIA 📚
			╠═══════════════════════════════════════════════╣
			║ 1. Manutenção de Cadastro 💻  2. Consultas 🔍	║
			║ 3. Iniciar Venda 📈           4. Sair ➡️	║  
			╚═══════════════════════════════════════════════╝
			""";
	
	public String MenuManutencao = """
			╔═════════════════════════════════════════════╗ 
			          💻 Manutenção de Cadastro 💻
			╠═════════════════════════════════════════════╣
			║ 1. Cadastrar Produto   2. Cadastrar Cliente ║
			║ 3. Cadastrar Vendedor  4. Voltar            ║
			╚═════════════════════════════════════════════╝
			""";
	
	public String MenuConsultas = """
			╔══════════════════════════════════════════════╗ 
			                  🔍 Consultas 🔍
			╠══════════════════════════════════════════════╣
			║ 1. Consultar Categoria  2. Consultar Cliente ║
			║ 3. Consultar Vendedor   4. Listar Vendas     ║
			║ 5. Voltar                                    ║
			╚══════════════════════════════════════════════╝
			""";
	
	public String MenuVendas = """
			╔═══════════════════════════════════════════╗ 
			              📉 Iniciar Venda 📈
			╠═══════════════════════════════════════════╣
			║ 1. Adicionar Produto  2. Remover Produto  ║
			║ 3. Associar Vendedor  4. Associar Cliente ║ 
			║ 5. Concluir Venda     6. Cancelar Venda   ║
			╚═══════════════════════════════════════════╝
			""";
	
	public String MenuSair = """
			╔═══════════════════════════════════════════════════════╗ 
			║                ➡️ SISTEMA DE LIVRARIA ➡️		║
			╠═══════════════════════════════════════════════════════╣
			║ AGRADEÇEMOS A USABILIDADE DE NOSSO SISTEMA, ATÉ LOGO. ║
			╚═══════════════════════════════════════════════════════╝
			""";
	
	public String MenuError = """
			╔═════════════════════════════════════════════╗ 
			      Opção Inválida, Escolha Novamente! ⚠️
			╚═════════════════════════════════════════════╝
			""";
	
	public void exibirMenu() { // Exibi a interface de Menu Principal.
		System.out.print("\n"+MenuPrincipal);
	}
	
	public void exibirManutencao() { // Exibi a interface de Cadastro e Manutenção.
		System.out.println("\n"+MenuManutencao);
	}
	
	public void exibirConsultas() { // Exibi a interface de Consultas.
		System.out.println("\n"+MenuConsultas);
	}
	
	public void exibirVenda() { // Exibi a interface de Vendas.
		System.out.println("\n"+MenuVendas);
	}
	
	public void exibirSaida() { // Exibi a interface de saida.
		System.out.println("\n"+MenuSair);
	}
	
	public void exibirError() { // Exibi a mensagem de 'Opção invalida'
		System.out.println("\n"+MenuError);
	}
			

}
