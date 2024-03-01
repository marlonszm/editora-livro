import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Genero g1 = new Genero(1, "Terror");
        Genero g2 = new Genero(2, "Ação");
        Genero g3 = new Genero(3, "Romance");
        Editora e1 = new Editora(1, "Saraiva ltda", "Saraiva@gmail.com", "Recife", "PE");
        Editora e2 = new Editora(2, "Cultura s.a", "Cultura@gmail.com", "Recife", "PE");
        Livro l1 = new Livro(1, "Noite das bruxas", "000-000-000-01", 210, g1, e1);
        Livro l2 = new Livro(2, "A volta dos derrotados", "000-000-000-02", 430, g2, e2);
        Livro l3 = new Livro(3, "Meu primeiro amor", "000-000-000-03", 500, g3, e1);
        Livro l4 = new Livro(4, "Guerra civil em detalhes", "000-000-000-04", 310, g2, e2);
        Livro l5 = new Livro(5, "Maldição de west coast", "000-000-000-05", 180, g1, e1);
        
        //impressão
        System.out.println("Título do 1º livro: "+l1.getTitulo());
        System.out.println("Nome do gênero: " +g1.getNomeGenero());
        System.out.println("Razão social: " +e1.getRazaoSocial());
        System.out.println("=======================================");
        System.out.println("Título do 2º livro: "+l2.getTitulo());
        System.out.println("Nome do gênero: " +g2.getNomeGenero());
        System.out.println("Razão social: " +e2.getRazaoSocial());
        System.out.println("=======================================");
        System.out.println("Título do 3º livro: "+l3.getTitulo());
        System.out.println("Nome do gênero: " +g3.getNomeGenero());
        System.out.println("Razão social: " +e1.getRazaoSocial());
        System.out.println("=======================================");
        System.out.println("Título do 4º livro: "+l4.getTitulo());
        System.out.println("Nome do gênero: " +g2.getNomeGenero());
        System.out.println("Razão social: " +e2.getRazaoSocial());
        System.out.println("=======================================");
        System.out.println("Título do 5º livro: "+l5.getTitulo());
        System.out.println("Nome do gênero: " +g1.getNomeGenero());
        System.out.println("Razão social: " +e1.getRazaoSocial());
        input.close();
    }
}
