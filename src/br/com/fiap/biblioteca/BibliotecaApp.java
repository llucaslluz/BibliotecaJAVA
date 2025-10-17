package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.model.Emprestimo;
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

        Livro livro2 = new Livro();
        livro2.setCodigo(2);
        livro2.setTituto("O Alquimista");
        livro2.setAutor("Paulo Cuelho");
        livro2.setIsbn("2222222");

        Exemplar exemplar1 = new Exemplar();
        exemplar1.setEstado("novo");
        exemplar1.setTombo(1);
        exemplar1.setEmprestado(false);
        exemplar1.setLivro(livro2);

        Exemplar exemplar2 = new Exemplar();
        exemplar2.setEstado("Danificado");
        exemplar2.setTombo(2);
        exemplar2.setEmprestado(false);
        exemplar2.setLivro(livro2);

        Exemplar exemplar3 = new Exemplar();
        exemplar3.setEstado("NOVO");
        exemplar3.setTombo(3);
        exemplar3.setEmprestado(false);
        exemplar3.setLivro(livro2);

        exemplar1.mostrarDetahesDoExemplar();
        exemplar2.mostrarDetahesDoExemplar();
        exemplar3.mostrarDetahesDoExemplar();

        Leitor leitor = new Leitor();
        leitor.setNome("Ana Maria");
        leitor.setTelefone("31 9 9554 3311");

        System.out.println("************************************");


        Emprestimo emprestimo = new Emprestimo(leitor);
        emprestimo.setId(100);
        emprestimo.emprestarExemplar(exemplar1);
        emprestimo.emprestarExemplar(exemplar2);
        emprestimo.emprestarExemplar(exemplar3);
        emprestimo.mostrarEmprestimo();


//        int codigoDoLivro = livro2.getCodigo();
//        System.out.println(codigoDoLivro);


    }

}
