public class ComparaNumeros {

    public void compararNumeros(int numero1, int numero2) {
        if (numero1 == numero2)
            System.out.println("Os dois números são iguais");
        else if (numero1 < numero2)
            System.out.println("O número " + numero2 + "é maior!");
        else
            System.out.println("O número " + numero1 + " é maior");
    }
}
