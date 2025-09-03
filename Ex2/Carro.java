public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor) {
        this.velocidadeAtual += valor;
    }

    public void frear(int valor) {
        this.velocidadeAtual -= valor;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public static void main(String[] args) {
        // Criando primeiro carro usando construtor padrão
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2022);
        carro1.setVelocidadeAtual(0);

        // Criando segundo carro usando construtor com parâmetros
        Carro carro2 = new Carro("Honda", "Civic", 2023, 30);

        // Testando métodos do primeiro carro
        System.out.println("=== CARRO 1 ===");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Velocidade inicial: " + carro1.getVelocidadeAtual() + " km/h");
        
        carro1.acelerar(20);
        System.out.println("Após acelerar 20 km/h: " + carro1.getVelocidadeAtual() + " km/h");
        
        carro1.acelerar(15);
        System.out.println("Após acelerar mais 15 km/h: " + carro1.getVelocidadeAtual() + " km/h");
        
        carro1.frear(10);
        System.out.println("Após frear 10 km/h: " + carro1.getVelocidadeAtual() + " km/h");
        
        carro1.frear(50); // Tentando frear mais do que a velocidade atual
        System.out.println("Após frear 50 km/h: " + carro1.getVelocidadeAtual() + " km/h");

        // Testando métodos do segundo carro
        System.out.println("\n=== CARRO 2 ===");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Velocidade inicial: " + carro2.getVelocidadeAtual() + " km/h");
        
        carro2.acelerar(25);
        System.out.println("Após acelerar 25 km/h: " + carro2.getVelocidadeAtual() + " km/h");
        
        carro2.frear(20);
        System.out.println("Após frear 20 km/h: " + carro2.getVelocidadeAtual() + " km/h");
        
        carro2.frear(100); // Tentando frear mais do que a velocidade atual
        System.out.println("Após frear 100 km/h: " + carro2.getVelocidadeAtual() + " km/h");
    }
}
