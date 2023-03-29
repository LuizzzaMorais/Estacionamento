/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import controller.CCarro;
import controller.CPessoa;
import java.util.Scanner;
import model.Pessoa;
import util.Validadores;

/**
 *
 * @author 182120039
 */

//NÃO TEM METODO NENHUM PRONTO NESSA MERDA,ODEIO TODOS.

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

    public static void listarNomesP() {
        for (Pessoa NP : cadPessoa.getNomePessoa()) {// criar TODOS OS Get nos controllers.
            System.out.println("---");
            System.out.println("Nome:\t" + pessoa.getNomePessoa());
            System.out.println("CPF:\t" + pessoa.getCpf());
            System.out.println("Fone:\t" + pessoa.getTelefone());
            System.out.println("Idade:\t" + pessoa.getIdade());
            System.out.println("Proprietario:\t" + pessoa.getCarro());//aqui não faço ideia, mas seria " Proprietario: Palio " algo assim. em caso de não ser, ficaria um não ao lado.
            
        }// incompleto
    }

    public static void deletarPessoa() {
        System.out.println("-- Deletar Pessoa --");
        System.out.print("Informe o CPF: ");
        String cpf = leia.next();
        if (Validadores.isCPF(cpf)) {
            Pessoa edi = cadPessoa.getPessoaCpf(cpf);
            if (edi != null) {
                cadPessoa.removePessoa();
                System.out.println("Pessoa deletada com sucesso!");
            } else {
                System.out.println("Pessoa não conta na base de dados.");
            }
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public static void cadastrarPessoa() {
        int idPessoa;
        String nomePessoa;
        String sobrenomePessoa;
        int idadePessoa;
        String endereco;
        String cpf;

        System.out.println(".: Cadastro de Pessoa :.");
        System.out.print("Informe o CPF: ");
        boolean cpfIs;
        int opCPF;
        do {
            cpf = leia.next();
            cpfIs = Validadores.isCPF(cpf);
            if (!cpfIs) {
                System.out.println("CPF inválido." + "\nDeseja tentar novamente? 1 - Sim | 2 - Não");
                opCPF = leiaNumInt();
                if (opCPF == 1) {
                    System.out.print("Informe o CPF:");
                } else if (opCPF == 2) {
                    System.out.println("Cadastro cancelado pelo usuário.");
                    break;
                }
            }
        } while (!cpfIs);
        if (cadPessoa.getPessoaCPF(cpf) != null) {
            System.out.println("CPF já cadastrado");
        } else {
            System.out.print("Informe o nome: ");
            nomePessoa = leia.next();
            System.out.print("Informe o telefone: ");
            telefone = leia.next();
            System.out.println("Informe o endereço: ");
            endereco = leia.next();
            idPessoa = cadPessoa.geraID();
            Pessoa cli = new Pessoa(idPessoa, nomePessoa, cpf, cpf, endereco, telefone);
            cadPessoa.addPessoa(cli);
            System.out.println("Pessoa cadastrado com sucesso");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
