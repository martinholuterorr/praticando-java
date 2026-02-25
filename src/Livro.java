public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double valor;
    private char categoria;
    private String categoriaCompleta;

    public Livro(String titulo, String autor, int numeroPaginas, double valor, char categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.valor = valor;
        this.categoria = categoria;
        this.categoria();
    }

    public char getCategoria() {
        return this.categoria;
    }

    private void categoria() {
        if (this.categoria == 'F')
            this.categoriaCompleta = "Ficção";
        else if (this.categoria == 'N')
            this.categoriaCompleta = "Não-ficção";
        else if (this.categoria == 'T')
            this.categoriaCompleta = "Tecnologia";
        else if (this.categoria == 'H')
            this.categoriaCompleta = "História";
        else
            this.categoriaCompleta = "Cadastrar categoria";
    }

    @Override
    public String toString() {
        return titulo + ", de " + autor + " . Ele possui " + numeroPaginas + ", custa R$ " + valor + " e pertence à categoria " + categoriaCompleta;
    }
}
