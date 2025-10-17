package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.model.Exemplar;
import br.com.fiap.biblioteca.model.Leitor;
import br.com.fiap.biblioteca.model.Livro;

public class BibliotecaApp {
    public static void main(String[] args) {

    //    Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();

    //    System.out.println("Digite o Cod do Livro: ");
        livro.setCodigo(1);
        livro.setTituto("Dom Casmurro");
        livro.setAutor("Machado de assis");
        livro.setIsbn("111111");

        Exemplar exemplar1 = new Exemplar();
        exemplar1.setEstado("novo");
        exemplar1.setTombo(1);
        exemplar1.setEmprestado(false);
        exemplar1.setLivro(livro);

        Exemplar exemplar2 = new Exemplar();
        exemplar2.setEstado("Danificado");
        exemplar2.setTombo(2);
        exemplar2.setEmprestado(false);
        exemplar2.setLivro(livro);

        exemplar1.mostrarDetahesDoExemplar();
        exemplar2.mostrarDetahesDoExemplar();

        Leitor leitor = new Leitor();
        leitor.setNome("Ana Maria");
        leitor.setTelefone("31 9 9554 3311");


        int codigoDoLivro = livro.getCodigo();
        System.out.println(codigoDoLivro);


    }

}
