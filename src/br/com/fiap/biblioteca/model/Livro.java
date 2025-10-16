package br.com.fiap.biblioteca.model;

public class Livro {
    private int codigo;
    String tituto;
    String autor;
    String isbn;

    public void setCodigo(int valor){
        if (valor > 0){
            codigo = valor;
        } else {
            System.out.println("VALOR INVALIDO !!!");
        }
    }

    public int getCodigo() {
        return codigo;
    }
}
