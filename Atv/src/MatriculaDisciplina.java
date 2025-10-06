

public class MatriculaDisciplina {
    private Aluno aluno;
    private Disciplina disciplina;
    private String situacao; // "Aprovado", "Reprovado", "Reprovado por Falta"

    public MatriculaDisciplina(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.situacao = "Cursando";
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Disciplina getDisciplina() { return disciplina; }
    public String getSituacao() { return situacao; }
}
