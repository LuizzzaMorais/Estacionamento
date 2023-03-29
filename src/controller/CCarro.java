/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import estacionamento.Estacionamento;
import java.util.ArrayList;
import model.Carro;

/**
 *
 * @author 182120039
 */
public class CCarro {
    ArrayList<Carro> carros = new ArrayList<>();
    int idCarro = 1;

    public int geraID() {
        return this.idCarro++;
    }

    public void addCarro(Carro ca) {
        this.carros.add(ca);
    }

    public ArrayList<Carro> getcarros() {
        return this.carros;
    }

    public void removecarro(Carro ca) {
        this.carros.remove(ca);
    }

    public void mockclientes() {
        Carro ca1 = new Carro();
        ca1.setIdCarro(this.geraID());
        ca1.setMarca("Chevrolet");
        ca1.setModelo("Celta");
        ca1.setAno(1999);
        ca1.setRenavam(783126375);
        ca1.setProprietario(Estacionamento.cadPessoa.getPessoaNomePessoa("Luiza"));
        this.addCarro(ca1);
        Carro ca2 = new Carro();
        ca2.setIdCarro(this.geraID());
        ca2.setMarca("Toyota");
        ca2.setModelo("Supra MK4");
        ca2.setAno(1993);
        ca2.setRenavam(312321841);
        ca2.setProprietario(Estacionamento.cadPessoa.getPessoaNomePessoa("João Carlos"));
        this.addCarro(ca2);
    }

    
}
