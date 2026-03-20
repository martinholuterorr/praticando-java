public class VerificacaoDoarSangue {

    public void verificaDoador(int idade, double peso) {
        if (idade < 18 || idade > 65)
            System.out.println("O doador não é compatível.\nMotivo: Deve ter idade entre 18 e 65 anos.");
        else if (peso < 50)
            System.out.println("O doador não é compatível.\nMotivo: Deve estar acima dos 50 kg.");
        else
            System.out.println("Doador atende os critérios de idade e peso.");
    }
}
