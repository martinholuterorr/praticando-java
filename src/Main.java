import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DescontoCompra compra = new DescontoCompra();
        double valor = 0;

        System.out.println("Digite o valor da compra:");
        valor = scanner.nextDouble();

        compra.verificaDesconto(valor);

        scanner.close();
    }
}