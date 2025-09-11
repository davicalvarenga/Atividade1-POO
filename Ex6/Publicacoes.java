public class Publicacoes {
    private String titulo;
    private int ano;

    public Publicacoes(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Publicacoes() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Ano: " + ano);
    }
}