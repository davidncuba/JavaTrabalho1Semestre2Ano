package Financeiro;

import Pessoa.Cliente;

public class Receber extends Financeiro  {

    private Cliente cliente = new Cliente();
    private String nota_fiscal;
    
    public Receber (Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setNotaFiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getNotaFiscal() {
        return nota_fiscal;
    }

    public void entrar() {
        super.entrar();
        System.out.println("Nota Fiscal........: ");
        setNotaFiscal(input.next());
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Nota Fiscal........: " + getNotaFiscal());
        try {
        System.out.println("Cliente............: " + this.cliente.getNome());
        System.out.println("CNPJ...............: " + this.cliente.getCnpj());
        }
        catch(Exception e){
        System.out.println("Cliente............: null" );
        System.out.println("CNPJ...............: null");
        }
    }

    public void botReceber() {
        setId(321);
        setNumero(123);
        setEmissao("21/07/21");
        setVencimento("22/07/22");
        setPagamento("23/07/23");
        setValor(333.33);
        setJuros(222.11);
        setMulta(333.44);
        setDesconto(5.00);
        setNotaFiscal("NotaFiscal");
        
    }
}
