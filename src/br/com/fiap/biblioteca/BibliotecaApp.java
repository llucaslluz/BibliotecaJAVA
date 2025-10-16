package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.model.Livro;

public class BibliotecaApp {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setCodigo(-9);

        int codigoDoLivro = livro.getCodigo();
        System.out.println(codigoDoLivro);


    }

}
