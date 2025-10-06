
import java.util.*;

public class Curso {
    private String nome;
    private String codigo;
    private List<Fase> fases = new ArrayList<>();

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void adicionarFase(Fase f) {
        fases.add(f);
    }

    public Fase getFase(int numero) {
        for (Fase f : fases) {
            if (f.getNumero() == numero) return f;
        }
        return null;
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Curso: " + nome + " (" + codigo + ")";
    }
}
