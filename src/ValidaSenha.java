public class ValidaSenha {
    int senha = 12345;

    public ValidaSenha(int senha) {
        this.senha = senha;
    }

    public void login(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
