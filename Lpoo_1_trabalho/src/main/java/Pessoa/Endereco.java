package Pessoa;


public class Endereco implements InterfaceCadastro.InterfaceCadastro{

    private String logradouro, numero, complemento, bairro, cidade, estado;
    private int cep;

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    public void entrar() {
        System.out.println("Logradouro....: ");
        setLogradouro(input.next());
        System.out.println("Numero........: ");
        setNumero(input.next());
        System.out.println("Complemento...: ");
        setComplemento(input.next());
        System.out.println("Bairro...: ");
        setBairro(input.next());
        System.out.println("Cidade...: ");
        setCidade(input.next());
        System.out.println("Estado...: ");
        setEstado(input.next());
        System.out.println("Cep...: ");
        setCep(input.nextInt());
    }

    public void imprimir() {
        System.out.println("Logradouro....: " + getLogradouro());
        System.out.println("Numero........: " + getNumero());
        System.out.println("Complemento...: " + getComplemento());
        System.out.println("Bairro...: " + getBairro());
        System.out.println("Cidade...: " + getCidade());
        System.out.println("Estado...: " + getEstado());
        System.out.println("Cep...: " + getCep());

    }

  
}
