public class Main {
    public static void main(String[] args) {      
        Gerente gerente = new Gerente();
        gerente.setNome("João Silva");
        gerente.setMatricula("G001");
        gerente.setSalarioBase(5000.0);
        gerente.setBonusMensal(1500.0);
        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maria Santos");
        vendedor.setMatricula("V001");
        vendedor.setSalarioBase(3000.0);
        vendedor.setComissao(800.0);
        
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário Final: R$ " + gerente.calcularSalarioFinal());
        System.out.println();
        
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Salário Final: R$ " + vendedor.calcularSalarioFinal());
    }
}