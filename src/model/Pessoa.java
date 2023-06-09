/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 182120023
 */
public class Pessoa {

    private int idPessoa;
    private String nomePessoa;
    private String sobrenomePessoa;
    private int idadePessoa;
    private String endereco;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nomePessoa, String sobrenomePessoa, int idadePessoa, String endereco, String cpf) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.sobrenomePessoa = sobrenomePessoa;
        this.idadePessoa = idadePessoa;
        this.endereco = endereco;
        this.cpf = cpf;
    }

  

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getSobrenomePessoa() {
        return sobrenomePessoa;
    }

    public void setSobrenomePessoa(String sobrenomePessoa) {
        this.sobrenomePessoa = sobrenomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa" + "\nNome: " + nomePessoa + "\nSobrenome: " + sobrenomePessoa + "\nIdade: " + idadePessoa + "\nEndereco: " + endereco + "\nCPF: " + cpf;
    }

    
}
