
import java.util.*;

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;
    private List<MatriculaDisciplina> matriculas = new ArrayList<>();

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void matricular(Disciplina d) {
        matriculas.add(new MatriculaDisciplina(this, d));
        d.matricularAluno(this);
    }

    public String getSituacao(Disciplina d) {
        for (MatriculaDisciplina m : matriculas) {
            if (m.getDisciplina().equals(d)) return m.getSituacao();
        }
        return "Não matriculado";
    }

    @Override
    public String toString() {
        return nome + " - " + matricula;
    }
}
