package modelos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	/*	- nome (String): Nome do cliente.
		- cpf (String): CPF do cliente (único e validado).
		- endereco (String): Endereço do cliente.*/

	// listas para armazenamento de cpf, nomes e endereços.
		public List<String> nomesClient = new ArrayList<>();
		public List<String> cpfClient = new ArrayList<>();
		public List<String> endClient = new ArrayList<>();
		public List<Double> numClient = new ArrayList<>();
		
	// Blocos de String's para criar mini interface a ser usado para mostrar ao usuario em cadastro de clientes!
		public String MenuNomClient = """
				╔═══════════════════════════╗ 
				      NOME DO CLIENTE 💻
				╚═══════════════════════════╝
				""";
		
		public String MenuCpfClient = """
				╔════════════════════════════╗ 
				        NUMERO DE CPF 💻
				╚════════════════════════════╝
				""";
		
		public String MenuEndClient = """
				╔══════════════════════╗ 
				       ENDEREÇO 💻
				╚══════════════════════╝
				""";
		
		public String MenuNumClient = """
				╔══════════════════════╗ 
				    NÚMERO CELULAR 💻
				╚══════════════════════╝
				""";
		
		public String MenuSucClient = """
				╔════════════════════════════════════════╗
				║   CLIENTE CADASTRADO COM SUCESSO ✅ 	 ║
				╚════════════════════════════════════════╝
				""";
		
		public void exibirNomeClient () {
			System.out.println("\n"+MenuNomClient);
		}
		
		public void exibirCpfClient () {
			System.out.println("\n"+MenuCpfClient);
		}
		
		public void exibirEndClient () {
			System.out.println("\n"+MenuEndClient);
		}
		
		public void exibirNumClient () {
			System.out.println("\n"+MenuNumClient);
		}
		
		public void exibirSucessClient () {
			System.out.println("\n"+MenuSucClient);
		}
}
