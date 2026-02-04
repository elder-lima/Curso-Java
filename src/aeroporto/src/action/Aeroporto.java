package aeroporto.src.action;

import aeroporto.src.entities.*;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Aeroporto {

    private List<Aeronave> frota;
    private List<CadastroCliente> cadastroClientes;
    private List<Passageiro> passageiros;
    private List<Piloto> pilotos;
    private List<Voo> voos;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    Scanner sc = new Scanner(System.in);

    public Aeroporto() {
        this.frota = new ArrayList<>();
        this.cadastroClientes = new ArrayList<>();
        this.passageiros = new ArrayList<>();
        this.pilotos = new ArrayList<>();
        this.voos = new ArrayList<>();
    }

    public List<Aeronave> getFrota() {
        return frota;
    }

    public void setFrota(List<Aeronave> frota) {
        this.frota = frota;
    }

    public List<CadastroCliente> getCadastroClientes() {
        return cadastroClientes;
    }

    public void setCadastroClientes(List<CadastroCliente> cadastroClientes) {
        this.cadastroClientes = cadastroClientes;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

    public void run() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("1- Parametros do sistema");
        System.out.println("2- Parametros do cliente");
        System.out.println("3- Parametros do voo");
        System.out.println("4- Relatórios");
        System.out.println("5- Sair");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                parametroSistema();
                break;
            case 2:
                parametroCliente();
                break;
            case 3:
                parametroVoo();
                break;
            case 4:
                System.out.println("Funcionalidade de relatórios em construção.");
                run();
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                sc.close();
                break;
            default:
                System.out.println("Opção inválida!");
                run();
                break;
        }
    }

    public void parametroSistema() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("1- Cadastrar Aeronave");
        System.out.println("2- Listar Aeronaves");
        System.out.println("3- Voltar");
        Scanner sc = new Scanner(System.in);
        int opcaoAeronave = sc.nextInt();

        switch (opcaoAeronave) {
            case 1:
                cadastrarAeronave();
                break;
            case 2:
                listarAeronaves();
                break;
            case 3:
                run();
                break;
            default:
                System.out.println("Opção Inválida!");
                run();
        }
    }

    public void cadastrarAeronave() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("Digite o código da aeronave:");
        int codigo = sc.nextInt();
        System.out.println("Digite o modelo da aeronave:");
        String modelo = sc.next();
        System.out.println("Digite a capacidade da aeronave:");
        int capacidade = sc.nextInt();
        Aviao aviao = new Aviao(codigo, modelo, capacidade, true);
        frota.add(aviao);
        System.out.println("Aeronave cadastrada com sucesso!");
        run();
    }

    public void listarAeronaves() {
        if (frota.isEmpty()) {
            System.out.println("Nenhuma Aeronave Cadastrada!");
            run();
        }
        System.out.println("================= Aeroporto System ================");
        frota.forEach(System.out::println);
        run();
    }


    public void parametroCliente() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("1- Cadastrar Cliente");
        System.out.println("2- Listar Clientes");
        System.out.println("3- Voltar");
        int opcaoCliente = sc.nextInt();
        switch (opcaoCliente) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                listarClientes();
                break;
            case 3:
                run();
                break;
            default:
                System.out.println("Opção Inválida!");
                run();
                break;
        }
    }

    public void cadastrarCliente() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("Digite o nome do cliente:");
        String nome = sc.next();
        System.out.println("Digite o CPF do cliente:");
        int cpf = sc.nextInt();
        CadastroCliente cliente = new CadastroCliente(nome, cpf);
        cadastroClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
        run();
    }

    public void listarClientes() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("Lista de Clientes:");
        for (CadastroCliente cliente1 : cadastroClientes) {
            System.out.println(cliente1);
        }
        run();
    }

    public void parametroVoo() {
        System.out.println("================= Aeroporto System ================");
        System.out.println("1- Cadastrar Voo");
        System.out.println("2- Vender Passagem");
        System.out.println("3- Listar Voo");
        System.out.println("4- Voltar");
        int opcaoVoo = sc.nextInt();

        switch (opcaoVoo) {
            case 1:
                cadastrarVoo();
                break;
            case 2:
                venderPassagem();
                break;
            case 3:
                listarVoos();
                break;
            case 4:
                run();
                break;
            default:
                System.out.println("Opção Inválida!");
                run();
                break;
        }
    }

    public void cadastrarVoo() {
        if (frota.isEmpty()) {
            System.out.println("Nenhuma Aeronave Cadastrada!");
            run();
        }
        System.out.println("================= Aeroporto System ================");
        System.out.println("Digite o código do Voo");
        String codigoVoo = sc.next();
        System.out.println("Digite o destino");
        String destino = sc.next();
        System.out.print("Data: ");
        sc.nextLine();
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(), dtf);
        frota.forEach(System.out::println);
        System.out.print("Digite o código da Aeronave: ");
        int codigoAeronave = sc.nextInt();

        Aeronave aeronaveSelecionada = frota.stream()
                .filter(a -> a.getCodigo() == codigoAeronave) // filtra pelo código
                .findFirst()// pega o primeiro que encontrar
                .orElse(null); // se não achar, retorna null

        if (aeronaveSelecionada == null) {
            System.out.println("Aeronave não encontrada");
        }

        System.out.println(aeronaveSelecionada);

        Voo voo = new Voo(codigoVoo, destino, data, aeronaveSelecionada);
        voos.add(voo);
        run();
    }

    public void venderPassagem() {

    }

    public void listarVoos() {
        voos.forEach(System.out::println);
    }

    //    public void venderPassagem() {
//        if (!disponibilidade) {
//            System.out.println("Avião código: "+ getCodigo() + ", modelo: "+ getModelo() +", não está disponível.");
//            return;
//        }
//
//        if (getCapacidade() < 1) {
//            System.out.println("Todas as Passagems foram Vendida!");
//        }
//
//        int lugares = getCapacidade();
//        lugares -= 1;
//        setCapacidade(lugares);
//    }
}
