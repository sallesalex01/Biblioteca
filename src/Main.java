import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Livro[] livros = new Livro[1000];
        Revista[] revistas = new Revista[1000];
        int escolha, NumCadastroLivros = 0, NumCadastroRevistas = 0;
        do {
            System.out.println("\n=======================================");
            System.out.println("|    Sistema de Cadastro de Livros    |");
            System.out.println("=======================================\n");
            System.out.println("[1] - Cadastrar livro/revista");
            System.out.println("[2] - Procurar livro/revista");
            System.out.println("[3] - Listar todos os livros/revistas");
            System.out.println("[4] - Quantidade cadastrada/livre"); // x livros cadastrados | y livre
            System.out.println("[5] - Excluir último elemento da lista");
            System.out.println("[6] - Ordenar livros cadastrados");
            System.out.println("[7] - Sair");
            System.out.println("\n=======================================\n");
            System.out.print("Escolha uma das opçoes: ");
            escolha = input.nextInt();

            switch (escolha) {

                /* Cadastro de Livros ou Revistas */
                case 1:

                    escolha = 0;
                    System.out.println("Deseja cadastrar livro ou revista?");
                    System.out.println("1 - Cadastrar livro");
                    System.out.println("2 - Cadastrar revista");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        NumCadastroLivros = cadastrarLivro(input, livros, NumCadastroLivros);
                    } else if (escolha == 2) {
                        NumCadastroRevistas = cadastrarRevista(input, revistas, NumCadastroRevistas);
                    } else {
                        System.out.println("Digite um valor valido!");
                    }
                    escolha = 0;
                    break;

                /* Procurar Livros ou Revistas */
                case 2:
                    escolha = 0;
                    System.out.println("Deseja procurar livros ou revistas?");
                    System.out.println("1 - livros");
                    System.out.println("2 - revistas");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        procurarLivro(input, livros, NumCadastroLivros);
                    } else if (escolha == 2) {
                        procurarRevista(input, revistas, NumCadastroRevistas);
                    } else {
                        System.out.println("Digite um valor valido!");
                    }
                    escolha = 0;


                    break;

                /* Listar Livros ou Revistas */
                case 3:

                    escolha = 0;
                    System.out.println("Desejar listar livros ou revistas?");
                    System.out.println("1 - livros");
                    System.out.println("2 - revistas");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        listarLivros(livros, NumCadastroLivros);
                    } else if (escolha == 2) {
                        listarRevista(revistas, NumCadastroRevistas);
                    } else {
                        System.out.println("Digite um valor valido!");
                    }
                    escolha = 0;

                    break;

                /* Quantidade Cadastrada/livre */
                case 4:
                    System.out.println("\n=================================");
                    System.out.printf("%-30s %-1s", "| Quantidade cadastrada: " + NumCadastroLivros, " |");
                    System.out.println();
                    System.out.printf("%-30s %-1s", "| Quantidade livre: " + (999 - NumCadastroLivros), " |");
                    System.out.println();
                    System.out.println("=================================\n");
                    break;

                /* Excluir ultimo livro da lista */
                case 5:
                    if (NumCadastroLivros > 0) {
                        NumCadastroLivros--;
                        System.out.println("Numero de livros: " + NumCadastroLivros);
                    } else {
                        System.out.println("Nenhum livro cadastrado");
                    }

                    break;

                /* Ordenar livros cadastrados */
                case 6:

                    Arrays.sort(livros);
                    break;
            }

        } while (escolha != 8);

        input.close();
    }

    private static int cadastrarRevista(Scanner input, Revista[] revistas, int NumCadastroRevistas) {
        String autor;
        String secao;
        String prateleira;
        String issn;
        String CDD;
        String edicao;
        String ISBN;
        String editora;
        String ano;
        String nomeLivro;
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

        ISBN = "-";

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
                secao, issn);

        NumCadastroRevistas++;
        return NumCadastroRevistas;
    }

    private static int cadastrarLivro(Scanner input, Livro[] livros, int NumCadastroLivros) {
        String CDD;
        String edicao;
        String nomeLivro;
        String autor;
        String ano;
        String secao;
        String editora;
        String ISBN;
        String prateleira;
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
        return NumCadastroLivros;
    }

    private static void procurarLivro(Scanner input, Livro[] livros, int NumCadastroLivros) {
        String procura;
        System.out.println("Digite o nome do livro");
        procura = input.next().toLowerCase();

        for (int i = 0; i < NumCadastroLivros; i++) {
            if (livros[i].getNomeLivro().toLowerCase().indexOf(procura) >= 0) {
                System.out.println(livros[i].getNomeLivro());
            }
        }
    }

    private static void procurarRevista(Scanner input, Revista[] revistas, int NumCadastroRevistas) {
        String procura;
        System.out.println("Digite o nome do livro");
        procura = input.next().toLowerCase();

        for (int i = 0; i < NumCadastroRevistas; i++) {
            if (revistas[i].getNomeLivro().toLowerCase().indexOf(procura) >= 0) {
                System.out.println(revistas[i].getNomeLivro());
            }
        }
    }

    private static void listarLivros(Livro[] livros, int NumCadastroLivros) {
        if (NumCadastroLivros == 0) {
            System.out.println("Nenhum livro cadastrado ainda.");
        } else {
            for (int i = 0; i < NumCadastroLivros; i++) {
                System.out.println("Livros: " + (i + 1));
                System.out.println(livros[i].getNomeLivro() + ", " +
                        livros[i].getAutor() + ", " +
                        livros[i].getISBN() + ", " +
                        livros[i].getAno() + ", " +
                        livros[i].getEditora() + ", " +
                        livros[i].getPrateleira() + ", " +
                        livros[i].getSecao() + ", " +
                        livros[i].getCDD() + ", " +
                        livros[i].getEdicao());
            }
        }
    }

    private static void listarRevista(Revista[] revistas, int NumCadastroRevistas) {
        if (NumCadastroRevistas == 0) {
            System.out.println("Nenhuma revista cadastrado ainda.");
        } else {
            for (int i = 0; i < NumCadastroRevistas; i++) {
                System.out.println("Revistas: " + (i + 1));
                System.out.println(revistas[i].getNomeLivro() + ", " +
                        revistas[i].getAutor() + ", " +
                        revistas[i].getISSN() + ", " +
                        revistas[i].getAno() + ", " +
                        revistas[i].getEditora() + ", " +
                        revistas[i].getPrateleira() + ", " +
                        revistas[i].getSecao() + ", " +
                        revistas[i].getCDD() + ", " +
                        revistas[i].getEdicao());
            }
        }
    }
}


