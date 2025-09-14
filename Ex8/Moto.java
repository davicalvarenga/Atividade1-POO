public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto() {
    }
    
    public Moto(String marca, String modelo, int ano, double valorBase, int cilindradas) {
        super(marca, modelo, ano, valorBase);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public double calcularValorRevenda() {
        int anosUso = 2024 - getAno();
        double desconto = anosUso * 0.05; // 5% por ano
        return getValorBase() - (getValorBase() * desconto);
    }
}