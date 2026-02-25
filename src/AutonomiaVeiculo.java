public class AutonomiaVeiculo {
    private double consumoMedio = 0.0;
    private double capacidadeTanque = 0.0;
    private double conbustivelAtual = 0.0;
    private double distanciaViagem = 0.0;
    private double autonomiaMaxima = 0.0;
    private double autonomiaAtual = 0.0;

    public AutonomiaVeiculo(double consumo, double capacidade, double combustivel, double distancia) {
        this.consumoMedio = consumo;
        this.capacidadeTanque = capacidade;
        this.conbustivelAtual = combustivel;
        this.distanciaViagem = distancia;
    }

    public void verAutonomiaMaxima() {
        autonomiaMaxima = consumoMedio * capacidadeTanque;
        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
    }

    public void verAutonomiaAtual() {
        autonomiaAtual = consumoMedio * conbustivelAtual;
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");

        if (autonomiaAtual >= distanciaViagem)
            System.out.println("VOcê conseguirá completar a viagem sem precisar abastecer");
        else
            System.out.println("Você terá que abastecer para completar a viagem");
    }
}
