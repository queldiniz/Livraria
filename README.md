# Livraria
* Atividade Java do segundo semestre da faculdade na matéria de Linguagem de Programação.

* A atividade consiste em um sistema básico de cadastro de livros sem e com interface gráfica Java + o tratamento de exceptions.

* Um sistema de cadastro de Livros em que o bibliotecário ou responsável poderá inserir informações sobre os livros como nome do livro, nome do autor, quantidade de páginas, ano de publicação e editora, sendo que será inválido inserir letras em quantidade de páginas e ano de publicação.  

## Trabalhando o cadastro de Livros sem a interface gráfica e com duas exceptions, a InputMismatchException e a NoSuchElementException.

<img src ="sem-interface.jpeg"  width ="720px" heigh="300px"> </img>
* Para saber a execução das exceptions citadas acima basta olhar o arquivo CadastroLivraria.java 
 <hr>
 
## Cadastro de Livros na Interface gráfica e com exception.
### Tela Inicial
   <img src ="tela-inicial.jpeg"  width ="620px" heigh="300px"> </img> 
   
   * Entrando com dados válidos para cada campo:
   
   <img src ="tela-cadastro-livro.jpeg"  width ="620px" heigh="300px"> </img>
   
   
   * O usuário poderá digitar letras em quantidade de páginas e ano de publicação: 
   
   <img src ="tela-dados-invalidos.jpeg" width ="620px" heigh="300px"> </img>
    
   ###  Mas ao entrar com esses dados que NÃO SÃO INTEIROS VÁLIDOS, aparecerá pop(s) informando o(s) erro(s) e a exception gerada:
   <img src ="exception-qtd-paginas.jpeg" width ="480px" heigh="400px"> </img> <img src ="exception-ano-publicacao.jpeg"  width ="520px" heigh="428px"> </img>
   
   * Pop-up finally aparecerá tanto ao entrar com dados válidos quanto inválidos.


   <img src ="tela-finally.jpeg" width ="620px" heigh="300px"> </img>
   


