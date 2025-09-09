public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Maria Silva");
        aluno.setIdade(20);
        aluno.setMatricula("2024001");

        Professor professor = new Professor();
        professor.setNome("Fernando");
        professor.setIdade(45); // Corrigido: int, não String
        professor.setSalario(5000.0);

        System.out.println("Aluno: " + aluno.getNome() + ", " + aluno.getIdade() + " anos, Matrícula: " + aluno.getMatricula());
        System.out.println("Professor: " + professor.getNome() + ", " + professor.getIdade() + " anos, Salário: R$ " + professor.getSalario());
    }
}