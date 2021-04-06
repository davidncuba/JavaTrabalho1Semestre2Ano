package Pessoa;

public class Cliente extends PessoaJuridica {

    private double limite_credito;
    private Endereco endereco_cobranca;
    
    public Cliente(){
        
    }
    public void setLimiteCredito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public double getLimiteCredito() {
        return limite_credito;
    }

    @Override
    public void entrar() {
        System.out.println("********************************************");
        System.out.println("***        CADASTRO DE CLIENTE           ***");
        System.out.println("*------------------------------------------*");
        super.entrar();
        System.out.println("\n*Endereço de Cobrança*\n");
        this.endereco_cobranca = new Endereco();
        endereco_cobranca.entrar();
        System.out.println("Limite_Credito..........: ");
        setLimiteCredito(input.nextDouble());

    }

    @Override
    public void imprimir() {
        System.out.println("********************************************");
        System.out.println("***        CONSULTA DE CLIENTE           ***");
        System.out.println("*------------------------------------------*");
        super.imprimir();
        System.out.println("\n*Endereço de Cobrança*\n");
        endereco_cobranca.imprimir();
        System.out.println("Limite_Credito..........: " + getLimiteCredito());

    }

    public void botCliente() {
        setNome("Nome Cliente");
        endereco = new Endereco();
        endereco_cobranca = new Endereco();
        telefone = new Telefone();
        this.endereco.setLogradouro("Logradouro-Cliente");
        this.endereco.setNumero("Logradouro-Cliente");
        this.endereco.setLogradouro("Logradouro-Cliente");
        this.endereco.setNumero("numero-Cliente");
        this.endereco.setComplemento("Complemento-Cliente");
        this.endereco.setBairro("Bairro-Cliente");
        this.endereco.setCidade("Cidade-Cliente");
        this.endereco.setEstado("Estado-Cliente");
        this.endereco.setCep(1234);
        this.telefone.setDdd(12);
        this.telefone.setNumero(321);
        setEmail("email");
        setCnpj("CNPJ-Cliente");
        setInscricaoEstadual("IE-cliente");
        setContato("Contato-Cliente");
        
        this.endereco_cobranca.setLogradouro("Logradouro-Cobrança");
        this.endereco_cobranca.setNumero("numero-cobrança");
        this.endereco_cobranca.setComplemento("Complemento-cobrança");
        this.endereco_cobranca.setBairro("Bairro-cobrança");
        this.endereco_cobranca.setCidade("Cidade-cobrança");
        this.endereco_cobranca.setEstado("Estado-cobrança");
        this.endereco_cobranca.setCep(123);
        setLimiteCredito(100.00);
    }
    

    
}
