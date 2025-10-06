

public class Frequencia {
    private Aluno aluno;
    private Disciplina disciplina;
    private Professor professorResponsavel;
    private int presencas;
    private int totalAulas;

    public Frequencia(Aluno aluno, Disciplina disciplina, Professor professor, int presencas, int totalAulas) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.professorResponsavel = professor;
        this.presencas = presencas;
        this.totalAulas = totalAulas;
    }

    public double calcularPercentual() {
        return (presencas * 100.0) / totalAulas;
    }

    @Override
    public String toString() {
        return "Frequência - " + aluno + " em " + disciplina.getNome() + ": " + calcularPercentual() + "% (registrado por " + professorResponsavel.getNome() + ")";
    }
}
