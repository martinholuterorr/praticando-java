public class Declaracao {
    String nome;
    int idade;
    double altura;
    boolean estudante;

    public Declaracao(String nome, int idade, double altura, boolean estudante) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estudante = estudante;

        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Altura: " + altura + "\n" + "É estudande? " + estudante);
    }
}
