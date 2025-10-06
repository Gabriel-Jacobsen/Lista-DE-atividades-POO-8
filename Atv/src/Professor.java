
public class Professor {
    private String nome;
    private String matricula;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return nome + " [" + matricula + "]";
    }
}
