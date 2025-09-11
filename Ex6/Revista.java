public class Revista extends Publicacoes {
    private int edicao;

    public Revista() {
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void exibirInformacoes() {
        System.out.println("Revista - Título: " + getTitulo() + ", Edição: " + getEdicao() + ", Ano: " + getAno());
    }
}
