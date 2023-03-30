/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import controller.CCarro;
import controller.CPessoa;
import java.util.Scanner;
import model.Carro;
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

    public static void listarPessoa() {
        System.out.println("--Listar Pessoas--");
        for (Pessoa pessoa : cadPessoa.getpessoas()) {// criar TODOS OS Get nos controllers.
            System.out.println("---");
            System.out.println("Nome:\t" + pessoa.getNomePessoa());
            System.out.println("CPF:\t" + pessoa.getCpf());
            System.out.println("Idade:\t" + pessoa.getIdadePessoa());

        }// incompleto
    }

    public static void deletarPessoa() {
        System.out.println("-- Deletar Pessoa --");
        System.out.print("Informe o CPF: ");
        String cpf = leia.next();
        if (Validadores.isCPF(cpf)) {
            Pessoa p = cadPessoa.getPessoaCPF(cpf);
            if (p != null) {
                cadPessoa.removepessoa(p);
                System.out.println("Pessoa deletada com sucesso!");
            } else {
                System.out.println("Pessoa não conta na base de dados.");
            }
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public static void cadPessoa() {
        int idPessoa;
        String nomePessoa;
        String sobrenomePessoa = null;
        int idadePessoa = 0;
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
            System.out.print("Informe seu sobrenome: ");
            sobrenomePessoa = leia.next();
            System.out.print("Informe sua idade: ");
            idadePessoa = leia.nextInt();
            System.out.println("Informe o endereço: ");
            endereco = leia.next();

            idPessoa = cadPessoa.geraID();
            Pessoa p = new Pessoa(idPessoa, nomePessoa, sobrenomePessoa, idadePessoa, endereco, cpf);
            cadPessoa.addPessoa(p);
            System.out.println("Pessoa cadastrado com sucesso");

        }
    }

    private static void editarPessoa() {
        System.out.println("-- Editar Pessoa --");
        System.out.print("Informe o CPF: ");
        String cpf = leia.next();
        if (Validadores.isCPF(cpf)) {
            Pessoa p = cadPessoa.getPessoaCPF(cpf);
            if (p != null) {
                System.out.println("1 - Nome:\t" + p.getNomePessoa());
                System.out.println("2 - Sobrenome:\t" + p.getSobrenomePessoa());
                System.out.println("3 - Endereço:\t" + p.getEndereco());
                System.out.println("4 - Idade:\t" + p.getIdadePessoa());
                System.out.println("5 - Todos os campos acima");
                System.out.print("Qual campo deseja alterar?" + "\nDigite aqui: ");
                int opEditar = leiaNumInt();
                switch (opEditar) {
                    case 1:
                        System.out.print("Informe o nome a ser alterado: ");
                        p.setNomePessoa(leia.next());
                        break;
                    case 2:
                        System.out.println("Informe o sobrenome a ser alterado: ");
                        p.setSobrenomePessoa(leia.next());
                        break;
                    case 3:
                        System.out.print("Informe o endereço a ser alterado: ");
                        p.setEndereco(leia.next());
                        break;
                    case 4:
                        System.out.println("Informe a idade a ser alterada: ");
                        p.setIdadePessoa(leia.nextInt());
                    case 5:
                        System.out.print("Informe todos os campos abaixo: ");
                        System.out.print("Informe o nome a ser alterado: ");
                        p.setNomePessoa(leia.next());
                        System.out.print("Informe o endereço a ser alterado: ");
                        p.setEndereco(leia.next());

                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                System.out.println("Pessoa:\n" + p.toString());
            } else {
                System.out.println("Pessoa não cadastrado na base de dados.");
            }
        } else {
            System.out.println("CPF inválido.");
        }

    }

    public static void subMenu(int op) {
        String tpCad = null;
        switch (op) {
            case 1:
                tpCad = "Pessoa";
                break;
            case 2:
                tpCad = "Carro";
                break;

        }
        System.out.println(".: Gerenciar " + tpCad + " :.");
        System.out.println("1 - Cadastrar " + tpCad);
        System.out.println("2 - Editar " + tpCad);
        System.out.println("3 - Listar " + tpCad + "s");
        System.out.println("4 - Deletar " + tpCad);
        System.out.println("0 - Voltar");
        System.out.print("Escolha uma das opções acima: ");

    }

    private static void cadCarro() {
        System.out.println("--Cadastro de Carro--");
        System.out.print("Informe a placa: ");
        String placa = leia.nextLine();
        if (cadCarro.getCarroPlaca(placa) != null) {
            System.out.println("Carro já cadastrado. ");
        } else {
            int idCarro = cadCarro.geraID();
            System.out.print("Informe o renavam: ");
            int renavam = leiaNumInt();
            System.out.print("Informe a marca: ");
            String marca = leia.next();
            System.out.print("Informe o modelo: ");
            String modelo = leia.nextLine();
            System.out.print("Informe o ano: ");
            int ano = leiaNumInt();

            boolean isCPF = false;
            Pessoa idPessoa = null;
            do {
                System.out.print("Informe o CPF do proprietário: ");
                String cpf = leia.nextLine();
                isCPF = Validadores.isCPF(cpf);
                if (isCPF) {
                    idPessoa = cadPessoa.getPessoaCPF(cpf);
                    if (idPessoa == null) {
                        System.out.println("Pessoa sob este CPF não cadastrada. ");
                    } else {
                        System.out.println("Pessoa: " + idPessoa.getNomePessoa());
                    }
                } else {
                    System.out.println("CPF inválido. ");
                }
            } while (isCPF);
            Carro li = new Carro(idCarro, marca, modelo, ano, idPessoa, renavam, placa);
            cadCarro.addCarro(li);
            System.out.println("Carro cadastrado com sucesso");
        }
    }

    private static void listarCarro() {
        System.out.println("--Listar Carro--");
        for (Carro carro : cadCarro.getcarros()) {
            System.out.println("Placa:\t" + carro.getPlaca());
            System.out.println("Marca:\t" + carro.getMarca());
            System.out.println("Modelo:\t" + carro.getModelo());
            System.out.println("Ano:\t" + carro.getAno());
            System.out.println("Renavam:\t" + carro.getRenavam());
            System.out.println("Proprietário:\t" + carro.getProprietario().getNomePessoa());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        cadPessoa.mockpessoas();
        cadCarro.mockcarros();

        int opM;

        do {
            menuP();
            opM = leiaNumInt();
            switch (opM) {
                case 1:
                case 2:
                    int opSM;
                    do {
                        subMenu(opM);
                        opSM = leiaNumInt();
                        switch (opSM) {
                            case 1:
                                System.out.println("-- Cadastrar --");
                                if (opM == 1) {
                                    cadPessoa();
                                } else if (opM == 2) {
                                    cadCarro();
                                }
                                break;
                            case 2:
                                System.out.println("-- Editar --");
                                if (opM == 1) {
                                    editarPessoa();
                                } else if (opM == 2) {
                                    editarCarro();
                                }
                                break;
                            case 3:
                                System.out.println("-- Listar --");
                                if (opM == 1) {
                                    listarPessoa();
                                } else if (opM == 2) {
                                    listarCarro();
                                }
                                break;
                            case 4:
                                System.out.println("-- Deletar --");
                                if (opM == 1) {
                                    deletarPessoa();
                                } else if (opM == 2) {
                                    deletarCarro();
                                }
                                break;
                            case 0:
                                System.out.println("-- Menu Principal --");
                                break;
                            default:
                                System.out.println("Opção Inválida, tente novamente.");
                                break;
                        }
                    } while (opSM != 0);
                    break;

                case 0:
                    System.out.println("Aplicação encerrada pelo usuário.");
                    break;
                default:
                    System.out.println("Opção inváldida, tente novamente.");
            }
        } while (opM != 0);
    }

    // TODO code application logic here
}
