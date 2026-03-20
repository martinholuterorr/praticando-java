public class VerificacaoTriangulo {

    public void verificaTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 )
            System.out.println("Os lados podem formar um triângulo");
        else
            System.out.println("Os lados não podem formar um triângulo");
    }
}
