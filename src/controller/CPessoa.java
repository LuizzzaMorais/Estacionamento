/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author 182120039
 */
public class CPessoa {
    

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int idPessoa = 1;

    public int geraID() {
        return this.idPessoa++;
    }

    public void addPessoa(Pessoa p) {
        this.pessoas.add(p);
    }

    public ArrayList<Pessoa> geteditoras() {
        return this.pessoas;
    }

    public void removepessoa(Pessoa p) {
        this.pessoas.remove(p);
    }
    
    public void mockpessoas() {
        Pessoa p1 = new Pessoa();
        p1.setIdLivro(this.geraID());
        p1.setTitulo("Os Sete Maridos de Evelyn Hugo");
        p1.setAutor("Taylor Jenkins Reid");
        p1.setAssunto("Romance");
        p1.setIsbn("123");
        this.addPessoa(p1);
        Livro l2 = new Livro();
        l2.setIdLivro(this.geraID());
        l2.setTitulo("Harry Potter e a Pedra Filosofal");
        l2.setAutor("J.K. Rowling");
        l2.setAssunto("Ficção Aventura");
        l2.setIsbn("321");
        l2.setEstoque(20);
        l2.setPreco((float) 40.50);
        l2.setIdEditora(Livraria.cadEditora.getEditoraCnpj("22150710000130"));
        this.addLivro(l2);
        Livro l3 = new Livro();
        l3.setIdLivro(this.geraID());
        l3.setTitulo("Pequeno Principe");
        l3.setAutor("Antoine de Saint");
        l3.setAssunto("Ludico");
        l3.setIsbn("312");
        l3.setEstoque(15);
        l3.setPreco((float) 19.90);
        l3.setIdEditora(Livraria.cadEditora.getEditoraCnpj("77860014000100"));
        this.addLivro(l3);
}

