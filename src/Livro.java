public class Livro {
    private int idLivro;
    private String titulo;
    private String ISBN;
    private int numeroPaginas;
    private Genero genero;
    private Editora editora;

    public Livro (int idLivro, String titulo, String ISBN, int numeroPaginas, Genero genero, Editora editora){
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.editora = editora;
    }
    public int getIdLivro(){
        return idLivro;
    }
    public Editora getEditora(){
        return editora; 
    }
    public String getTitulo(){
        return titulo;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public Genero getGenero(){
        return genero;
    }
}
