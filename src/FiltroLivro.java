public class FiltroLivro {
    private char categoria;

    public void categoriaFiltro(char categoria){
        this.categoria = categoria;
    }

    public String filtra(Livro livro) {
        if (livro.getCategoria() == this.categoria)
            return livro.toString();
        else
            return "Sem livros nessa categoria";
    }
}
