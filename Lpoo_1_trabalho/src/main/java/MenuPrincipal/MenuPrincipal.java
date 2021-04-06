package MenuPrincipal;

import Pessoa.*;
import Financeiro.*;
import java.util.Scanner;

public class MenuPrincipal {

    public Scanner input = new Scanner(System.in);
    private int menu_principal;
    private String submenu;
    final String msg_sucesso_cadastro = "CADASTRO EFETUADO COM SUCESSO.";
    final String msg_sucesso_consulta = "CONSULTA REALIZADA COM SUCESSO";
    final String msg_excluido = "EXCLUIDO COM SUCESSO";
    final String msg_opcao_invalida = "OPÇÃO INVALIDA";
    Cliente cliente = new Cliente();
    Fornecedor fornecedor = new Fornecedor();
    Funcionario funcionario = new Funcionario();
    Receber receber = new Receber(cliente);
    Pagar pagar = new Pagar(fornecedor);
    FluxoCaixa fluxo_caixa = new FluxoCaixa(pagar, receber);

    public MenuPrincipal() {
        do {
            menuInicial();
        } while (getMenuPrincipal() != 7);
    }

    public MenuPrincipal(boolean bot) {
        if (bot == true) {
            cliente.botCliente();
            fornecedor.botFornecedor();
            funcionario.botFuncionario();
            receber.botReceber();
            pagar.botPagar();

        }
        do {
            menuInicial();
        } while (getMenuPrincipal() != 7);

    }

    public void menuInicial() {
        System.out.println("Escolha a opção Abaixo");
        System.out.println("1 = Cadastro de Funcionários");
        System.out.println("2 = Cadastro de Clientes");
        System.out.println("3 = Cadastro de Fornecedores");
        System.out.println("4 = Contas a Receber");
        System.out.println("5 = Contas a Pagar");
        System.out.println("6 = Fluxo de Caixa");
        System.out.println("7 = Sair");
        setMenuPrincipal(input.nextInt());
        menu(getMenuPrincipal());
    }

    public void subMenu() {
        System.out.println("Escolha a opção Abaixo");
        System.out.println("A = Incluir");
        System.out.println("B = Alterar");
        System.out.println("C = Consultar");
        System.out.println("D = Excluir");
        System.out.println("E = Voltar");
        setSubmenu(input.next());
    }

    public void menu(int menu_principal) {

        switch ((int) menu_principal) {
            
//          funcionario
            case 1:
                subMenu();
                switch ((String) getSubMenu()) {
                    case "A":
                    case "B":
                        funcionario.entrar();
                        msg(msg_sucesso_cadastro);
                        break;
                    case "C":
                        funcionario.imprimir();
                        msg(msg_sucesso_consulta);
                        break;
                    case "D":
                        funcionario = new Funcionario();
                        funcionario.endereco = new Endereco();
                        funcionario.telefone = new Telefone();
                        msg(msg_excluido); 
                        break;
                    case "E":
                        menuInicial();
                        break;
                    default:
                        msg(msg_opcao_invalida);
                        break;

                }
                break;
//          clientes
            case 2:
                subMenu();
                switch ((String) getSubMenu()) {
                    case "A":
                    case "B":
                        cliente.botCliente();
                        cliente.entrar();
                        msg(msg_sucesso_cadastro);
                        break;
                    case "C":
                        cliente.imprimir();
                        msg(msg_sucesso_consulta);
                    case "D":
                        cliente = new Cliente();
                        cliente.endereco = new Endereco();
                        cliente.telefone = new Telefone();
                        msg(msg_excluido); 
                        break;
                    case "E":
                        menuInicial();
                        break;
                    default:
                        msg(msg_opcao_invalida);
                        break;

                }
                break;
//          Fornecedor
            case 3:
                subMenu();
                switch ((String) getSubMenu()) {
                    case "A":
                    case "B":
                        fornecedor.entrar();
                        msg(msg_sucesso_cadastro);
                        break;
                    case "C":
                        fornecedor.imprimir();
                        msg(msg_sucesso_consulta);
                        break;
                    case "D":
                        fornecedor = new Fornecedor();
                        fornecedor.endereco = new Endereco();
                        fornecedor.telefone = new Telefone();
                        msg(msg_excluido); 
                        break;
                    case "E":
                        menuInicial();
                        break;
                    default:
                        msg(msg_opcao_invalida);
                        break;
                }
                break;
//          Contas a Receber
            case 4:
                subMenu();
                switch ((String) getSubMenu()) {
                    case "A":
                    case "B":
                        receber.entrar();
                        msg(msg_sucesso_cadastro);
                        break;
                    case "C":
                        receber.imprimir();
                        msg(msg_sucesso_consulta);
                        break;
                    case "D":
                        receber = new Receber(null);
                        msg(msg_excluido);          
                        break;
                    case "E":
                        menuInicial();
                        break;
                    default:
                        msg(msg_opcao_invalida);
                        break;
                }
                break;

            case 5:
                subMenu();
                switch ((String) getSubMenu()) {
                    case "A":
                    case "B":
                        pagar.entrar();
                        msg(msg_sucesso_cadastro);
                        break;
                    case "C":
                        pagar.imprimir();
                        msg(msg_sucesso_consulta);
                        break;
                    case "D":
                        pagar = new Pagar(null);
                        break;
                    case "E":
                        menuInicial();
                        break;
                    default:
                        msg(msg_opcao_invalida);
                        break;
                }
                break;
            case 6:
                fluxo_caixa.imprimir();
                break;

            case 7:
                msg("Sair!");
                break;
            default:
                msg(msg_opcao_invalida);
                break;
        }

    }

    public void setMenuPrincipal(int menu_principal) {
        this.menu_principal = menu_principal;
    }

    public int getMenuPrincipal() {
        return menu_principal;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu.toUpperCase();
    }

    public String getSubMenu() {
        return submenu;
    }

    public void msg(String msg) {
        System.out.println("\n\n");
        System.out.println(msg);
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal(true);

    }
}
