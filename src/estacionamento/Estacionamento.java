/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import controller.CCarro;
import controller.CPessoa;
import java.util.Scanner;
import util.Validadores;

/**
 *
 * @author 182120039
 */
public class Estacionamento {

    public static CPessoa cadPessoa = new CPessoa();
    public static CCarro cadCarro = new CCarro();
    public static Scanner leia = new Scanner(System.in);

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        int num = 99;
        try {
            num = leiaNum.nextInt();
        } catch (Exception e) {
            System.out.println("Tente novamente!");
            leiaNum.nextLine();
        }
        return num;
    }

    public static void menuP() {
        System.out.println(".: Estacionamento :.");
        System.out.println("1 - Ger. Pessoas");
        System.out.println("2 - Ger. Carros");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void deletarPessoa() {
        System.out.println("Deletar Pessoa");
        System.out.print("Informe o CNPJ: ");
        String cnpj = leia.next();
        if (Validadores.isCNPJ(cnpj)) {
            Pessoa edi = cadPessoa.getPessoaCnpj(cnpj);
            if (edi != null) {
                cadPessoa.removePessoa(edi);
                System.out.println("Pessoa deletada com sucesso!");
            } else {
                System.out.println("Pessoa não conta na base de dados.");
            }
        } else {
            System.out.println("CNPJ inválido.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
