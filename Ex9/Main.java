public class Main {
    public static void main(String[] args) {
        
        // Criando um aluno
        Aluno aluno = new Aluno();
        aluno.setNome("João Silva");
        aluno.setCpf("123.456.789-00");
        aluno.setMatricula("2024001");
        aluno.setNotaFinal(7.5);
        
        // Criando um professor
        Professor professor = new Professor();
        professor.setNome("Maria Santos");
        professor.setCpf("987.654.321-00");
        professor.setDisciplina("Programação Orientada a Objetos");
        professor.setCargaHoraria(40);
        
        // Exibindo resultados
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota Final: " + aluno.getNotaFinal());
        System.out.println("Aprovado: " + (aluno.verificarAprovacao() ? "Sim" : "Não"));
        System.out.println();
        
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Carga Horária: " + professor.getCargaHoraria() + " horas");
        System.out.println("Salário Mensal (R$ 50/hora): R$ " + professor.calcularSalarioMensal(50.0));
    }
}