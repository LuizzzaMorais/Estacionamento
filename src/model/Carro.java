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
public class Carro {

    private int idCarro;
    private String Marca;
    private String Modelo;
    private int Ano;
    private Pessoa Proprietario;
    private int renavam;
    private String placa;

    public Carro() {
    }

    public Carro(int idCarro, String Marca, String Modelo, int Ano, Pessoa Proprietario, int renavam, String placa) {
        this.idCarro = idCarro;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Proprietario = Proprietario;
        this.renavam = renavam;
        this.placa = placa;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public Pessoa getProprietario() {
        return Proprietario;
    }

    public void setProprietario(Pessoa Proprietario) {
        this.Proprietario = Proprietario;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" + "idCarro=" + idCarro + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Ano=" + Ano + ", Proprietario=" + Proprietario + ", renavam=" + renavam + ", placa=" + placa + '}';
    }

   

}
