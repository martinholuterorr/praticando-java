import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VerificacaoDiaUtil usuario = new VerificacaoDiaUtil();
        String dia = null;

        System.out.println("Digite o dia da semana(em letras minúscilas):");
        dia = scanner.nextLine();

        usuario.verificaDia(dia.toLowerCase());

        scanner.close();
    }
}