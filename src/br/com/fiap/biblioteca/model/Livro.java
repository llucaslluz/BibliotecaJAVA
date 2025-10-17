package br.com.fiap.biblioteca.model;

public class Livro {
    private int codigo;
    String tituto;
    String autor;
    String isbn;

    public void setCodigo(int codigo){
        if (codigo > 0){
            this.codigo = codigo;
        } else {
            System.out.println("VALOR INVALIDO !!!");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTituto() {
        return tituto;
    }

    public void setTituto(String tituto) {
        this.tituto = tituto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
