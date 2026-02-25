public class ConversorTemperatura {
    public void celsiusParaFahrenheit(int celsius) {
        double fahrenheit = ((double) (celsius * 9) /5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
