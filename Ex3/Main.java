public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumero("12345-6");
        conta.setTitular("João Silva");
        
        conta.exibirInfo();
        conta.depositar(0.00);
        conta.depositar(500.00);
        conta.sacar(300.00);
        conta.sacar(2000.00);

        System.out.println("Saldo: " + conta.getSaldo());
    }
}
