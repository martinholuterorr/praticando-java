public class Produto {
    private String produto;
    private double preco;
    private String categoria;

    public Produto(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
        this.categorizar(preco);
    }

    public void categorizar(double preco) {
        if (preco <= 0.0)
            this.categoria = "Ver preço";
        else if (preco <= 50.0)
            this.categoria = "Econômico";
        else if (preco <= 200.0)
            this.categoria = "Intermediário";
        else if (preco > 200.0)
            this.categoria = "Premium";
    }

    public String getCategoria() {
        return categoria;
    }
}
