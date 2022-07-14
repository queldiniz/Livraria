package view;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
/* Um sistema de cadastro de Livros em que o bibliotecário ou responsável poderá inserir informações
 * sobre os livros como nome do livro, nome do autor, quantidade de páginas, ano de publicação
 * e editora, sendo que será inválido inserir letras em quantidade de páginas e ano de publicação. */
 public class CadastroLivraria{
	 public static Scanner sc;
	 public static void main (String[] args)  {
		 int qtdPaginas=0, anoPublicacao = 0;
		 String nomeLivro, nomeAutor, editora;
		 finalizarPrograma();
		 
		 sc = new Scanner(System.in);
		 System.out.println("Seja bem-vindo ao nosso sistema de cadastro de Livros!!");	
		 System.out.println(" ");
		 System.out.println("Para cadastrar, insira o nome do livro, o nome do autor, o nome da editora, a quantidade páginas que o livro possui e o seu ano de publicação.");
		 System.out.println(" ");
		 
		 System.out.print("Nome do Livro: ");
		 nomeLivro = sc.nextLine();
		 
		 System.out.print("Nome do Autor: ");
		 nomeAutor = sc.nextLine();
		 
		 System.out.print("Editora: ");
		 editora = sc.nextLine();

		 qtdPaginas = lerInt("Quantidade de Páginas: ");	
		 anoPublicacao = lerInt("Ano de Publicação: ");
				 
		 System.out.println(" ");
		 System.out.println("O livro " +nomeLivro + " do(a) autor(a) " + nomeAutor + " tem "+ qtdPaginas + " páginas e foi lançado no ano de " + anoPublicacao + " pela editora " + editora + ". ");		 
	 }

public static int lerInt(String menu){
    int retorno = 0;
    boolean continueLoop = true;
    
    do{
      try {
           		System.out.print(menu);
  				 retorno = sc.nextInt();
  				 continueLoop = false;  
  			 } catch(InputMismatchException erroNumbers){ 
  				 System.out.println(" ");
  				 System.err.printf("Ops!! Ocorreu um erro.%nSomente valores INTEIROS são aceitos. Tente novamente!");
  				 System.err.printf("%nA Exception gerada foi:  %s%n", erroNumbers);
  				 System.err.printf("A exception %s ocorre quando o método Scanner nextInt recebe uma string que não representa um inteiro valido.", erroNumbers);
  				 sc.nextLine();	 
  			 } catch(NoSuchElementException erroEntrada) {
  				 System.err.println("Você tentou algo inválido e gerou uma exception");
  				System.err.println("A Exception: " + erroEntrada);	 
  			 } finally {
  				 System.err.println(" ");
  				 System.err.printf("O Finally foi executado com sucesso!");
  				 System.err.println(" ");	 
  			 } 
    } while(continueLoop);
    return retorno;
  }
public static void finalizarPrograma() {
	if(sc != null) {
		sc.close();
	}
}
 }