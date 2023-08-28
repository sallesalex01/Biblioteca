public class Revista extends Livro{
    private String issn;

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    Revista(String nomeLivro, String autor, String editora, String prateleira, String ISBN, String CDD, String edicao, String ano, String secao, String isnn) {
        super(nomeLivro, autor, editora, prateleira, ISBN, CDD, edicao, ano, secao);
        this.issn = isnn;
    }
}
