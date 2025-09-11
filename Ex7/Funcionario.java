public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularAumento(double percentual) {
        if (percentual > 0) {
            double aumento = this.salarioBase * (percentual / 100);
            this.salarioBase += aumento;
            return aumento;
        } else {
            System.out.println("Erro: Percentual de aumento deve ser positivo.");
            return 0;
        }
    }

    public double atualizarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = this.salarioBase * (percentual / 100);
            this.salarioBase += aumento;
            return this.salarioBase;
        } else {
            System.out.println("Erro: Percentual de atualização deve ser positivo.");
            return this.salarioBase;
        }
    }
}
