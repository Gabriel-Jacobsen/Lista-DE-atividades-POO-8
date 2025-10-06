

public class Avaliacao {
    private Aluno aluno;
    private Disciplina disciplina;
    private Professor professorResponsavel;
    private double nota;

    public Avaliacao(Aluno aluno, Disciplina disciplina, Professor professorResponsavel, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.professorResponsavel = professorResponsavel;
        this.nota = nota;
    }

    public double getNota() { return nota; }

    @Override
    public String toString() {
        return "Avaliacao - " + aluno + " | " + disciplina.getNome() + ": " + nota + " (registrado por " + professorResponsavel.getNome() + ")";
    }
}
