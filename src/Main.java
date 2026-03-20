import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VerificacaoDoarSangue doador = new VerificacaoDoarSangue();
        int idade = 0;
        double peso = 0;

        System.out.println("Digite a idade do doador: ");
        idade = scanner.nextInt();
        System.out.println("Digite o peso do doador(em kg): ");
        peso = scanner.nextDouble();

        doador.verificaDoador(idade, peso);

        scanner.close();
    }
}