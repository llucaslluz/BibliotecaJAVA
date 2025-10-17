package br.com.fiap.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    private int id;
    private Leitor leitor;
    private List<Exemplar> exemplares;

    public Emprestimo(Leitor leitor){
        this.leitor = leitor;
        this.exemplares = new ArrayList<Exemplar>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void emprestarExemplar(Exemplar exemplar) {
        if (exemplar.isEmprestado()){
            System.out.println("Livro indisponivel");
        } else {
            exemplar.setEmprestado(true);
            exemplares.add(exemplar);
        }
    }

    public void devolverExemplar (Exemplar exemplar){
        exemplares.remove(exemplar);
        exemplar.setEmprestado(false);
    }

    public List<Livro> getLivros() {
        return livros;
    }


}

