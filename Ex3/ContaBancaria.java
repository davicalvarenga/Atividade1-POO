public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
            System.out.printf("Novo saldo: R$ %.2f\n", this.saldo);
            System.out.println(); // Linha em branco para melhor formatação
        } else {
            System.out.println("Erro: Valor de depósito deve ser acima de  R$ 0,00!");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque não pode ser maior que o saldo atual!");
            return false;
        }
        
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
            System.out.printf("Novo saldo: R$ %.2f\n", this.saldo);
            System.out.println(); // Linha em branco para melhor formatação
            return true;
        } else {
            System.out.printf("Erro: Saldo insuficiente! Saldo atual: R$ %.2f, Valor solicitado: R$ %.2f\n", 
                            this.saldo, valor);
            return false;
        }
    }
    public void exibirInfo() {
        System.out.println("=== INFORMAÇÕES DA CONTA ===");
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
        System.out.println();
    }

    public String consultarSaldo() {
        return String.format("R$ %.2f", saldo);
    }
}
