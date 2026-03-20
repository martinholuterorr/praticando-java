import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VerificacaoTriangulo usuario = new VerificacaoTriangulo();
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo lado: ");
        lado2 = scanner.nextInt();

        System.out.println("Digite o valor do terceiro lado: ");
        lado3 = scanner.nextInt();

        usuario.verificaTriangulo(lado1, lado2, lado3);

        scanner.close();
    }
}