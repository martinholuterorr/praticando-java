public class DescontoCompra {
    double desconto = 0.10;

    public void verificaDesconto(double valorCompra) {
        if (valorCompra >= 100.0)
            System.out.println("Desconto de " + this.desconto * 100 + "% aplicado. \nNovo valor: R$ " + this.calculaDesconto(valorCompra));
        else
            System.out.println("Nenhum desconto aplicado. \nValor total: R$ " + valorCompra);
    }

    private double calculaDesconto(double valor) {
        return valor -= valor * desconto;
    }
}
