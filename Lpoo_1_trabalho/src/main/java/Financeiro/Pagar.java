package Financeiro;

import Pessoa.Fornecedor;

public class Pagar extends Financeiro {

    public Fornecedor fornecedor = new Fornecedor();
    private String boleto;

    public Pagar(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getBoleto() {
        return boleto;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Boleto........: ");
        setBoleto(input.next());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Boleto........: " + getBoleto());
        try {
            System.out.println("Fornecedor....: " + this.fornecedor.getNome());
            System.out.println("CNPJ..........: " + this.fornecedor.getCnpj());
        }
        catch(Exception e){
            
            System.out.println("Fornecedor....: null");
            System.out.println("CNPJ..........: null");
        }
    }

    public void botPagar() {
        setId(123);
        setNumero(1433);
        setEmissao("21/01/21");
        setVencimento("22/01/22");
        setPagamento("23/01/23");
        setValor(1233.33);
        setJuros(11.11);
        setMulta(33.44);
        setDesconto(6.00);
        setBoleto("Boleto");
    }
}
