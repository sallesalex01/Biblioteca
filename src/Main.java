import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Livro[] livros = new Livro[1000];
        Revista[] revistas = new Revista[1000];
        int escolha, NumCadastroLivros = 0, NumCadastroRevistas = 0;
        String nomeLivro, autor, editora, prateleira, ISBN, CDD, edicao, ano, secao, issn;
        do {
            System.out.println("\n=======================================");
            System.out.println("|    Sistema de Cadastro de Livros    |");
            System.out.println("=======================================\n");
            System.out.println("[1] - Cadastrar livro"); // de 0 a 999
            System.out.println("[2] - Cadastrar Revista"); // de 0 a 999
            System.out.println("[3] - Procurar livro"); // por palavra chave
            System.out.println("[4] - Listar todos os livros");
            System.out.println("[5] - Listar todos as Revistas");
            System.out.println("[6] - Quantidade cadastrada/livre"); // x livros cadastrados | y livre
            System.out.println("[7] - Excluir último elemento da lista");
            System.out.println("[8] - Ordenar livros cadastrados");
            System.out.println("[9] - Sair");
            System.out.println("\n=======================================\n");
            System.out.print("Escolha uma das opçoes: ");
            escolha = input.nextInt();

            switch (escolha) {

                /* Cadastro do Livro */
                case 1:

                    System.out.println("Digite o nome do livro: ");
                    nomeLivro = input.next();
                    input.nextLine();

                    System.out.println("Digite o nome do autor: ");
                    autor = input.next();
                    input.nextLine();

                    System.out.println("Digite o nome da editora: ");
                    editora = input.next();
                    input.nextLine();

                    System.out.println("Digite a prateleira: ");
                    prateleira = input.next();
                    input.nextLine();

                    System.out.println("Digite o ISBN: ");
                    ISBN = input.next();
                    input.nextLine();

                    System.out.println("Digite o CDD: ");
                    CDD = input.next();
                    input.nextLine();

                    System.out.println("Digite a edicao: ");
                    edicao = input.next();
                    input.nextLine();

                    System.out.println("Digite o ano de lançamento: ");
                    ano = input.next();
                    input.nextLine();

                    System.out.println("Digite a secao: ");
                    secao = input.next();
                    input.nextLine();

                    livros[NumCadastroLivros] = new Livro(nomeLivro, autor, editora, prateleira, ISBN, CDD, edicao, ano,
                            secao);

                    NumCadastroLivros++;
                    break;

                /* Cadastro da Revista */

                case 2:

                    System.out.println("Digite o nome da Revista: ");
                    nomeLivro = input.next();
                    input.nextLine();

                    System.out.println("Digite o nome do Autor: ");
                    autor = input.next();
                    input.nextLine();

                    System.out.println("Digite o nome da editora: ");
                    editora = input.next();
                    input.nextLine();

                    System.out.println("Digite a prateleira: ");
                    prateleira = input.next();
                    input.nextLine();

                    System.out.println("Digite o ISBN: ");
                    ISBN = input.next();
                    input.nextLine();

                    System.out.println("Digite o CDD: ");
                    CDD = input.next();
                    input.nextLine();

                    System.out.println("Digite a edicao: ");
                    edicao = input.next();
                    input.nextLine();

                    System.out.println("Digite o ano de lançamento: ");
                    ano = input.next();
                    input.nextLine();

                    System.out.println("Digite a secao: ");
                    secao = input.next();
                    input.nextLine();

                    System.out.println("Digite a ISNN: ");
                    issn = input.next();
                    input.nextLine();

                    revistas[NumCadastroRevistas] = new Revista(nomeLivro, autor, editora, prateleira, ISBN, CDD, edicao, ano,
                            secao,issn);

                    NumCadastroRevistas++;
                    break;

                /* Procurar Livros */
                case 3:

                    break;

                /* Listar Livros */
                case 4:
                    if (NumCadastroLivros == 0) {
                        System.out.println("Nenhum livro cadastrado ainda.");
                    } else {
                        for (int i = 0; i < NumCadastroLivros; i++) {
                            System.out.println("Livros: " + (i +1));
                            System.out.println(livros[i].getNomeLivro() + ", " +
                                    livros[i].getAutor()+", " +
                                    livros[i].getISBN() + ", "+
                                    livros[i].getAno()+ ", "+
                                    livros[i].getEditora()+ ", "+
                                    livros[i].getPrateleira()+ ", "+
                                    livros[i].getSecao()+ ", "+
                                    livros[i].getCDD()+ ", "+
                                    livros[i].getEdicao());
                        }
                    }
                    break;
                case 5:
                    if (NumCadastroRevistas == 0) {
                        System.out.println("Nenhum livro cadastrado ainda.");
                    } else {
                        for (int i = 0; i < NumCadastroRevistas; i++) {
                            System.out.println("Revistas: " + (i +1));
                            System.out.println(revistas[i].getNomeLivro() + ", " +
                                    revistas[i].getAutor()+", " +
                                    revistas[i].getISBN() + ", "+
                                    revistas[i].getAno()+ ", "+
                                    revistas[i].getEditora()+ ", "+
                                    revistas[i].getPrateleira()+ ", "+
                                    revistas[i].getSecao()+ ", "+
                                    revistas[i].getCDD()+ ", "+
                                    revistas[i].getEdicao());
                        }
                    }
                    break;

                /* Quantidade Cadastrada/livre */
                case 6:
                    System.out.println("\n=================================");
                    System.out.printf("%-30s %-1s", "| Quantidade cadastrada: " + NumCadastroLivros, " |");
                    System.out.println();
                    System.out.printf("%-30s %-1s", "| Quantidade livre: " + (999 - NumCadastroLivros), " |");
                    System.out.println();
                    System.out.println("=================================\n");
                    break;

                /* Excluir ultimo livro da lista */
                case 7:
                   if (NumCadastroLivros > 0 ) {
                       NumCadastroLivros--;
                       System.out.println("Numero de livros: " + NumCadastroLivros);
                   }else{
                       System.out.println("Nenhum livro cadastrado");
                   }

                    break;

                /* Ordenar livros cadastrados */
                case 8:

                    Arrays.sort(livros);
                    break;
            }

        } while (escolha != 9);

        input.close();
    }
}


