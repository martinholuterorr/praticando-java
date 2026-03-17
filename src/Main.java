import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VerificacaoEmprestimo usuario = new VerificacaoEmprestimo();
        double valor = 0;

        System.out.println("Digite o valor do empréstimo:");
        valor = scanner.nextDouble();

        usuario.verificaEmprestimo(valor);

        scanner.close();
    }
}