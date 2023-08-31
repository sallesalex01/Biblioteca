public class Revista extends Livro{
    private String issn;

    public String getISSN() {
        return issn;
    }

    public void setISSN(String issn) {
        this.issn = issn;
    }

    Revista(String nomeLivro, String autor, String editora, String prateleira, String ISBN, String CDD, String edicao, String ano, String secao, String issn) {
        super(nomeLivro, autor, editora, prateleira, ISBN, CDD, edicao, ano, secao);
        this.issn = issn;
    }
}
