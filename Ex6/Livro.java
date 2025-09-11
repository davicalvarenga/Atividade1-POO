public class Livro extends Publicacoes {
    private String autor;

    public Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Livro - Título: " + getTitulo() + ", Autor: " + getAutor() + ", Ano: " + getAno());
    }
}
