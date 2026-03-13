import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ValidaSenha usuario = new ValidaSenha(56789);
        System.out.println("Digite a sua senha");
        int numero = scanner.nextInt();
        usuario.login(numero);

        scanner.close();
    }
}