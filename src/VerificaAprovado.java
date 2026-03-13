public class VerificaAprovado {
    private double media = 0;

    public VerificaAprovado(double media) {
        this.media = media;
    }

    public void verificaAprovado() {
        if (this.media < 5.0) {
            System.out.println("O estudante teve média " + this.media + " e foi reprovado.");
        } else if (this.media < 7.0) {
            System.out.println("O estudante teve média " + this.media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + this.media + " e foi aprovado.");
        }
    }

}
