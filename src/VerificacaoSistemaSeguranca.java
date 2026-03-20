public class VerificacaoSistemaSeguranca {

    public void verificaAcesso(int codigoAcesso, int nivelPermissao) {
        if (codigoAcesso == 2023 && nivelPermissao > 0 && nivelPermissao < 4)
            System.out.println("Acesso permitido. Bem-vindo ao sistema.");
        else if (codigoAcesso != 2023)
            System.out.println("Código de acesso inválido.");
        else if (nivelPermissao < 1 || nivelPermissao > 3)
            System.out.println("Nível de permissão inválido.");
    }
}
