package Pessoa;

public abstract class Pessoa implements InterfaceCadastro.InterfaceCadastro {

    private int id, valor_editado_int;
    private String nome, email, valor_editado_string;
    public Endereco endereco;
    public Telefone telefone;
    private double valor_editado_double;
    private long valor_editado_long;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

  public void setValorEditado(String valor_editado_string) {
        this.valor_editado_string = valor_editado_string;
    }

    public String getValorEditadoString() {
        return valor_editado_string;
    }

    public void setValorEditado(int valor_editado_int) {
        this.valor_editado_int = valor_editado_int;
    }

    public int getValorEditadoInt() {
        return valor_editado_int;
    }

    public void setValorEditado(double valor_editado_double) {
        this.valor_editado_double = valor_editado_double;
    }

    public double getValorEditadoDouble() {
        return valor_editado_double;
    }
    
    public void setValorEditado(long valor_editado_long){
        this.valor_editado_long = valor_editado_long;
    }
    
    public long getValorEditadoLong(){
        return valor_editado_long;
    }

    public void entrar() {
        this.endereco = new Endereco();
        this.telefone = new Telefone();
        System.out.println("Nome..........: ");
        setNome(input.next());
        System.out.println("\n*Endereço de Correspondencia*\n");
        this.endereco.entrar();
        this.telefone.entrar();
        System.out.println("E-mail..........: ");
        setEmail(input.next());

    }

    public void imprimir() {
        System.out.println("Nome..........: " + getNome());
        System.out.println("E-mail..........: " + getEmail());
        System.out.println("\n*Endereço de Correspondencia*\n");
        this.endereco.imprimir();
        this.telefone.imprimir();
    }

    

}
