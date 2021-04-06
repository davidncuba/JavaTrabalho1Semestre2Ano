package Pessoa;
public class Telefone implements InterfaceCadastro.InterfaceCadastro{

    private int ddd;
    private long numero;

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdd() {
        return ddd;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void entrar() {
        System.out.println("DDD....: ");
        setDdd(input.nextInt());
        System.out.println("Telefone........: ");
        setNumero(input.nextLong());

    }

    public void imprimir() {
        System.out.println("DDD....: " + getDdd());
        System.out.println("Telefone........: " + getNumero());
    }
   
}
