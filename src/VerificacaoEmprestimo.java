public class VerificacaoEmprestimo {

    public void verificaEmprestimo(double valor) {
        if (valor >= 1000 && valor <= 5000)
            System.out.println("O valor R$" + valor + ", está dentro do intervalor permitido para o empréstimo");
        else
            System.out.println("O valor R$" + valor + ", não está dentro do intervalor permitido para o empréstimo");
    }
}
