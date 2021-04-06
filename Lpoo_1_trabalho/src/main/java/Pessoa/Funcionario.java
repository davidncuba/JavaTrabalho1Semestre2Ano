package Pessoa;

public class Funcionario extends PessoaFisica {

    private String data_admissao, data_demissao, ctps;
    private double salario;

    public void setDataAdmissao(String data_admissao) {
        this.data_admissao = data_admissao;

    }
    
    public String getDataAdmissao(){
        return data_admissao;
    }
    
    public void setDataDemissao(String data_demissao){
        this.data_demissao = data_demissao;
    }
    
    public String getDataDemissao(){
        return data_demissao;
    }
    
    public void setCtps(String ctps){
        this.ctps = ctps;
    }
    
    public String getCtps(){
        return ctps;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    @Override
    public void entrar(){
        System.out.println("********************************************");
        System.out.println("***        CADASTRO DE FUNCIONÁRIO       ***");
        System.out.println("*------------------------------------------*");
        super.entrar();
        System.out.println("Data Admissão......: ");
        setDataAdmissao(input.next());
        System.out.println("Data Demissão......:");
        setDataDemissao(input.next());
        System.out.println("CTPS..................:");
        setCtps(input.next());
    }
    
    @Override
    public void imprimir(){
        System.out.println("********************************************");
        System.out.println("***        CONSULTA DE FUNCIONÁRIO       ***");
        System.out.println("*------------------------------------------*");
        super.imprimir();
        System.out.println("Data Admissão......: " + getDataAdmissao());
        System.out.println("Data Demissão......:" + getDataDemissao());
        System.out.println("CTPS..................:" + getCtps());
    }
    
    public void botFuncionario() {
        setNome("Nome Funcionario");
        endereco = new Endereco();
        telefone = new Telefone();
        this.endereco.setLogradouro("Logradouro-Funcionario");
        this.endereco.setNumero("Logradouro-Funcionario");
        this.endereco.setLogradouro("Logradouro-Funcionario");
        this.endereco.setNumero("numero-Funcionario");
        this.endereco.setComplemento("Complemento-Funcionario");
        this.endereco.setBairro("Bairro-Funcionario");
        this.endereco.setCidade("Cidade-Funcionario");
        this.endereco.setEstado("Estado-Funcionario");
        this.endereco.setCep(333);
        this.telefone.setDdd(444);
        this.telefone.setNumero(555);
        setEmail("email-Funcionario");
        setCpf("Cpf-Funcionario");
        setRg("RG-Funcionario");
        setEmissor("01/02/03");
        setDataAdmissao("01/03/2003");
        setDataDemissao("01/04/2004");
        setCtps("ctps");
        
    }
}
