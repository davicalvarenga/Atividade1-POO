public class Aluno extends Pessoa {
    private String matricula;
    private double notaFinal;
    
    public Aluno() {
    }
    
    public Aluno(String nome, String cpf, String matricula, double notaFinal) {
        super(nome, cpf);
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getNotaFinal() {
        return notaFinal;
    }
    
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public boolean verificarAprovacao() {
        return notaFinal >= 6.0;
    }
}