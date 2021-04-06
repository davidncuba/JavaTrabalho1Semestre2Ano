package Pessoa;

public abstract class PessoaJuridica extends Pessoa {

    private String cnpj, inscricao_estadual, contato;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setInscricaoEstadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricaoEstadual() {
        return inscricao_estadual;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }
    
    @Override
    public void entrar() {
        super.entrar();
        System.out.println("CNPJ..........: ");
        setCnpj(input.next());
        System.out.println("Inscrição Estadual: ");
        setInscricaoEstadual(input.next());
        System.out.println("Contato......: ");
        setContato(input.next());
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ..........: " + getCnpj());
        System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
        System.out.println("Contato......: " + getContato());
    }
    

}
