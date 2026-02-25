public class ConversorMoeda {
    double resultado;

    public void converteParaDolar(double real) {
        resultado = real / 5.25;
        System.out.println("O valor em dólares é: US$ " + resultado);
    }
}
