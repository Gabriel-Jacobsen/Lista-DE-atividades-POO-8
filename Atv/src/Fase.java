
import java.util.*;

public class Fase {
    private int numero;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Fase(int numero) {
        this.numero = numero;
    }

    public int getNumero() { return numero; }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public List<Disciplina> getDisciplinas() { return disciplinas; }

    @Override
    public String toString() {
        return "Fase " + numero + " com " + disciplinas.size() + " disciplinas.";
    }
}
