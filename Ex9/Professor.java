public class Professor extends Pessoa {
    private String disciplina;
    private int cargaHoraria;
    
    public Professor() {
    }
    
    public Professor(String nome, String cpf, String disciplina, int cargaHoraria) {
        super(nome, cpf);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public double calcularSalarioMensal(double valorHora) {
        return cargaHoraria * valorHora;
    }
}