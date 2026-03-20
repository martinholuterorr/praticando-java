import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VerificacaoSistemaSeguranca usuario = new VerificacaoSistemaSeguranca();
        int codigoAcesso = 0;
        int nivelPermissao = 0;

        System.out.println("Digite o código de acesso: ");
        codigoAcesso = scanner.nextInt();
        System.out.println("Digite o nível de permissão: ");
        nivelPermissao = scanner.nextInt();

        usuario.verificaAcesso(codigoAcesso, nivelPermissao);

        scanner.close();
    }
}