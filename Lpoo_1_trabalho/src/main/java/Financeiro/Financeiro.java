package Financeiro;

public abstract class Financeiro implements InterfaceCadastro.InterfaceCadastro {

    private int id, numero;
    private String emissao, vencimento, pagamento;
    private double valor, juros, multa, desconto, total;
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getMulta() {
        return multa;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public double getTotal(){
        this.total = getValor() + getJuros() + getMulta() - getDesconto();
        return this.total;
    }

    public void entrar() {
        System.out.println("Id..............: ");
        setId(input.nextInt());

        System.out.println("Numero..........: ");
        setNumero(input.nextInt());

        System.out.println("Emissao.........: ");
        setEmissao(input.next());
        
        System.out.println("Vencimento......: ");
        setVencimento(input.next());
        
        System.out.println("Pagamento.......: ");
        setPagamento(input.next());
        
        System.out.println("Valor...........: ");
        setValor(input.nextDouble());
        
        System.out.println("Juros...........: ");
        setJuros(input.nextDouble());
        
        System.out.println("Multa...........: ");
        setMulta(input.nextDouble());
        
        System.out.println("Desconto........: ");
        setDesconto(input.nextDouble());
        

    }
    
    public void imprimir(){
        System.out.println("Id..............: " + getId() );
        System.out.println("Numero..........: " + getNumero());
        System.out.println("Emissao.........: " + getEmissao());
        System.out.println("Vencimento......: " + getVencimento());
        System.out.println("Pagamento.......: " + getPagamento());
        System.out.println("Valor...........: " + getValor());
        System.out.println("Juros...........: " + getJuros());      
        System.out.println("Multa...........: " + getMulta());
        System.out.println("Desconto........: " + getDesconto());
        System.out.println("Total........: " + getTotal());
    }
    
  
}
