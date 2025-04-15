package modelos;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import principal.Start;
import modelos.Menu;

public class Produto {
	
	/*	- nome (String): Nome do produto.
		- preco (double): Preço do produto.
		- isbn (String): numero geral do produto
		- categoria (Categoria): Categoria à qual o produto pertence.*/
	
	Menu men = new Menu();
	
	// contagem de armazenamento por produto de cada categoria
	public int terror = 0;
	public int fantasia = 0;
	public int ficcao = 0;
	public int romance = 0;
	public int manga = 0;
	public int biografia = 0;
	public int infantil = 0;
	public int hq = 0;
	public int religiao = 0;
	public int tecnologia = 0;
	public int esportes = 0;
	public int artes = 0;
	public int gastronomia = 0;
	public int ciencia = 0;
	public int aventura = 0;
	public int psicologia = 0;
	
	// listas para armazenamento de isbn, nomes e preços
	public List<String> nomes = new ArrayList<>();
	public List<String> isbn = new ArrayList<>();
	public List<Double> preco = new ArrayList<>();
	
	// Blocos de String's para criar mini interface a ser usado para mostrar ao usuario na main principal
	public String MenuNom = """
			╔═════════════════════════════╗ 
			       NOME DO PRODUTO 💻
			╚═════════════════════════════╝
			""";
	
	public String MenuIsbn = """
			╔═════════════════════════════╗ 
			    NUMERO ISBN DO PRODUTO 💻
			╚═════════════════════════════╝
			""";
	
	public String MenuPreco = """
			╔═════════════════════════════╗ 
			      PREÇO DO PRODUTO $💻
			╚═════════════════════════════╝
			""";
	
	public String MenuCateg = """
					 ╔═════════════════════════════╗ 
					      CATEGORIA DO PRODUTO 💻
					 ╚═════════════════════════════╝
			╔════════════════════════════════════════════════════════════════╗ 
			  1. Terror         2. Fantasia     3. Ficção     4. Romance
			  5. Mangá          6. Biografia    7. Infantil   8. HQ
			  9. Religião      10. Tecnologia   11. Esportes  12. Artes
			  13. Gastronomia  14. Ciência      15. Aventura  16. Psicologia
			╚════════════════════════════════════════════════════════════════╝
			""";
	
	public String MenuSucess = """
			╔════════════════════════════════════════╗
			║   PRODUTO CADASTRADO COM SUCESSO ✅ 	 ║
			╚════════════════════════════════════════╝
			""";
	
	public String MenuCatError = """
			╔═══════════════════════════════════════════════════╗
			║    CATEGORIA INEXISTENTE! ESCOLHA NOVAMENTE ❌	    ║
			╚═══════════════════════════════════════════════════╝
			""";
	
	
	// Metodos ou funções para exibir mini interfaces para melhor visualização de opções
	public void exibirNom() {
		System.out.println("\n"+MenuNom);
	}
	
	public void exibirIsbn() {
		System.out.println("\n"+MenuIsbn);
	}
	
	public void exibirPreco() {
		System.out.println("\n"+MenuPreco);
	}
	
	public void exibirCateg() {
		System.out.println("\n"+MenuCateg);
	}
	
	public void exibirSucess() {
		System.out.println("\n"+MenuSucess);
	}
	
	public void exibirErrorCateg() {
		System.out.println("\n"+MenuCatError);
	}
	
	public void incrementarCategoria(int catprod) { // metodo para contabilizar a categoria após ser validado e cadastrado o produto.
	    switch (catprod) {
	        case 1 -> {terror++; exibirSucess();} 
	        case 2 -> {fantasia++; exibirSucess();} 
	        case 3 -> {ficcao++; exibirSucess();}  
	        case 4 -> {romance++; exibirSucess();} 
	        case 5 -> {manga++; exibirSucess();} 
	        case 6 -> {biografia++; exibirSucess();} 
	        case 7 -> {infantil++; exibirSucess();} 
	        case 8 -> {hq++; exibirSucess();} 
	        case 9 -> {religiao++; exibirSucess();} 
	        case 10 -> {tecnologia++; exibirSucess();} 
	        case 11 -> {esportes++; exibirSucess();} 
	        case 12 -> {artes++; exibirSucess();} 
	        case 13 -> {gastronomia++; exibirSucess();} 
	        case 14 -> {ciencia++; exibirSucess();} 
	        case 15 -> {aventura++; exibirSucess();} 
	        case 16 -> {psicologia++; exibirSucess();} 
	        default -> exibirErrorCateg(); // exibe mensagem de categoria inexistente, caso a opção do usuario seja invalida.
	    }
		
	}

}
