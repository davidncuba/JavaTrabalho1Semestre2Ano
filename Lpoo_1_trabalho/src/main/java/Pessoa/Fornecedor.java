package Pessoa;

public class Fornecedor extends PessoaJuridica {

    private double limite_compra;
    private String data_cadastro, site;
    
    public void setLimiteCompra(double limite_compra){
        this.limite_compra = limite_compra;
    }
    
    public double getLimiteCompra(){
        return limite_compra;
    }
    
    public void setDataCadastro(String data_cadastro){
        this.data_cadastro = data_cadastro;
    }
    
    public String getDataCadastro() {
        return data_cadastro;
    }
    
    public void setSite(String site){
        this.site = site;
    }
    
    public String getSite(){
        return site;
    }
    
    @Override
    public void entrar(){
        System.out.println("********************************************");
        System.out.println("***         CADASTRO FORNECEDOR          ***");
        System.out.println("*------------------------------------------*");
        super.entrar();
        System.out.println("Limite de Compra......: ");
        setLimiteCompra(input.nextDouble());
        System.out.println("Data do Cadastro......:");
        setDataCadastro(input.next());
        System.out.println("Site..................:");
        setSite(input.next());
    }
    
    @Override
    public void imprimir() {
        System.out.println("********************************************");
        System.out.println("***        CONSULTA DE FORNECEDOR        ***");
        System.out.println("*------------------------------------------*");
        super.imprimir();
        System.out.println("Limite de Compra......: " + getLimiteCompra());
        System.out.println("Data do Cadastro......:" + getDataCadastro());
        System.out.println("Site..................:" + getSite());
    

        
    }
    
    public void botFornecedor() {
        setNome("Nome Cliente");
        endereco = new Endereco();
        telefone = new Telefone();
        this.endereco.setLogradouro("Logradouro-Fornecedor");
        this.endereco.setNumero("Logradouro-Fornecedor");
        this.endereco.setLogradouro("Logradouro-Fornecedor");
        this.endereco.setNumero("numero-Fornecedor");
        this.endereco.setComplemento("Complemento-Fornecedor");
        this.endereco.setBairro("Bairro-Fornecedor");
        this.endereco.setCidade("Cidade-Fornecedor");
        this.endereco.setEstado("Estado-Fornecedor");
        this.endereco.setCep(321);
        this.telefone.setDdd(2222);
        this.telefone.setNumero(333);
        setEmail("email-Fornecedor");
        setCnpj("CNPJ-Fornecedor");
        setInscricaoEstadual("IE-Fornecedor");
        setContato("Contato-Fornecedor");
        setDataCadastro("01/01/01");
        setSite("www");
        setLimiteCompra(200.00);
    }
    
}

