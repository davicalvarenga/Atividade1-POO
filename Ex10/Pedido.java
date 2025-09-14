public class Pedido {
    private int numero;
    private String data;
    private double valorTotal;
    
    public Pedido() {
        this.valorTotal = 0.0;
    }
    
    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = 0.0;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adicionarProduto(Produto produto, int quantidade) {
        double valorItem = produto.getPrecoUnitario() * quantidade;
        this.valorTotal += valorItem;
        System.out.println("Produto adicionado: " + produto.getNome() + " | Qtd: " + quantidade +" | Valor: R$ " + String.format("%.2f", valorItem));
    }
}