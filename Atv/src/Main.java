


public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Engenharia de Software", "ESW01");
        Fase fase1 = new Fase(1);

        Disciplina poo = new Disciplina("Programação Orientada a Objetos", "POO101", true);
        Disciplina banco = new Disciplina("Banco de Dados", "BD102", true);

        Professor prof1 = new Professor("João Silva", "P001");
        Professor prof2 = new Professor("Maria Souza", "P002");

        poo.adicionarProfessor(prof1);
        poo.adicionarProfessor(prof2);
        fase1.adicionarDisciplina(poo);
        fase1.adicionarDisciplina(banco);

        curso.adicionarFase(fase1);

        Aluno a1 = new Aluno("Gabriel Jacobsen", "A001", curso);
        a1.matricular(poo);
        a1.matricular(banco);

        Frequencia f = new Frequencia(a1, poo, prof1, 32, 40);
        Avaliacao av = new Avaliacao(a1, poo, prof2, 8.7);

        System.out.println(curso);
        System.out.println(f);
        System.out.println(av);
    }
}
