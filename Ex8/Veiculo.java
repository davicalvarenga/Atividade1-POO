public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double valorBase;
    
    public Veiculo() {
    }
    
    public Veiculo(String marca, String modelo, int ano, double valorBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorBase = valorBase;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getValorBase() {
        return valorBase;
    }
    
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}