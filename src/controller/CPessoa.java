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

    public ArrayList<Pessoa> getpessoas() {
        return this.pessoas;
    }

    public void removepessoa(Pessoa p) {
        this.pessoas.remove(p);
    }

    public void mockpessoas() {
        Pessoa p1 = new Pessoa();
        p1.setIdPessoa(this.geraID());
        p1.setNomePessoa("Luiza");
        p1.setSobrenomePessoa("Morais");
        p1.setEndereco("Souza Costa, 50");
        p1.setIdadePessoa(19);
        p1.setCpf("60076121046");
        this.addPessoa(p1);
        Pessoa p2 = new Pessoa();
        p2.setIdPessoa(this.geraID());
        p2.setNomePessoa("João Carlos");
        p2.setSobrenomePessoa("Schultz");
        p2.setEndereco("Centro, 100");
        p2.setIdadePessoa(20);
        p2.setCpf("52605299015");
        this.addPessoa(p2);
    }

    public Pessoa getPessoaCPF(String cpf) {
        Pessoa p = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                p = pessoa;
                break;
            }

        }
        return p;

    }
    }

