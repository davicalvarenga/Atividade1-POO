public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro() {
    }

    public Carro(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public double calcularValorRevenda() {
        int anosUso = 2025 - getAno();
        double desconto = anosUso * 0.10;
        return getValorBase() - (getValorBase() * desconto);
    }
}