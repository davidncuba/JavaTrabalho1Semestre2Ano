package Pessoa;

public abstract class PessoaFisica extends Pessoa {

    private String cpf, rg, emissor;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getEmissor() {
        return emissor;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("CPF..........: ");
        setCpf(input.next());
        System.out.println("RG...........: ");
        setRg(input.next());
        System.out.println("Emissor......: ");
        setEmissor(input.next());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF..........: " + getCpf());
        System.out.println("RG...........: " + getRg());
        System.out.println("Emissor......: " + getEmissor());
    }
}
