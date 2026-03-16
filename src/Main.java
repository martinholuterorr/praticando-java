import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        ComparaNumeros comparador = new ComparaNumeros();

        System.out.println("Digite o primeiro número que deseja comparar.");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número que deseja comparar.");
        numero2 = scanner.nextInt();

        comparador.compararNumeros(numero1, numero2);

        scanner.close();
    }
}