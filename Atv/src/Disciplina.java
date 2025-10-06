
import java.util.*;

public class Disciplina {
    private String nome;
    private String codigo;
    private boolean ofertada;
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Disciplina(String nome, String codigo, boolean ofertada) {
        this.nome = nome;
        this.codigo = codigo;
        this.ofertada = ofertada;
    }

    public void adicionarProfessor(Professor p) {
        if (professores.size() < 4) {
            professores.add(p);
        } else {
            System.out.println("Limite máximo de 4 professores atingido!");
        }
    }

    public void matricularAluno(Aluno a) {
        alunosMatriculados.add(a);
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return nome + " (" + codigo + ")";
    }
}
