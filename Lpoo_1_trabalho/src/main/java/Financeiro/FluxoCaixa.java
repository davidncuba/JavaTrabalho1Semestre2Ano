package Financeiro;

public class FluxoCaixa {
            
    private Pagar pagar;
    private Receber receber;
    private double saldo;

    public FluxoCaixa(Pagar pagar, Receber receber) {
        this.pagar = pagar;
        this.receber = receber;
    }

  

    public Pagar getPagar() {
        return pagar;
    }

    public double getSomaPagar() {
        return (pagar.getValor() + pagar.getJuros() + pagar.getMulta() - pagar.getDesconto() );
    }
    
    public double getSomaReceber() {
        return (receber.getValor() + receber.getJuros() + receber.getMulta() - receber.getDesconto() );
    }
    
    public double somarPagarReceber() {
        return pagar.getTotal() - receber.getTotal();
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
        
        
    }
    public double getSaldo(){
       return saldo;
    }
    

    public String getPrintFormatado(double print_formatado){
        return String.format("%.2f", print_formatado);
    }
    
   

    
    public void imprimir() {
        //var texto = new String('P', 5);
        System.out.println("+--------------------------------------------------------------------");
        System.out.println("|                           Fluxo de Caixa                          |");
        System.out.println("+-------------------------------------------------------------------+");
        System.out.println("+---------------------+-----------+----------------+----------------+");
        System.out.println("| Tipo do Financeiro  | Vencimento|     Valor      |     Saldo      |");
        System.out.println("+---------------------+-----------+----------------+----------------+");
        setSaldo(0);
        System.out.println();
        System.out.println("|Saldo Inicial        |           |                |      "+ getPrintFormatado(getSaldo())+"      |");
        System.out.println("+---------------------+-----------+----------------+----------------+");
        setSaldo(getSaldo() -pagar.getTotal());
        System.out.println("|Pagar                |" + pagar.getVencimento() + "   | R$ " +  getPrintFormatado(pagar.getTotal()) + "     |    R$ " + getPrintFormatado(getSaldo()) + " | ");
        setSaldo(getSaldo() + receber.getTotal());
        System.out.println("+---------------------+-----------+----------------+----------------+");
        System.out.println("|Receber              |" + receber.getVencimento() + "   | R$ " + getPrintFormatado(receber.getTotal())+ "      |    R$ " + getPrintFormatado(getSaldo()) + "  |");
        System.out.println("+---------------------+-----------+----------------+----------------+");
        System.out.println("|                                     Saldo final: |    R$ "+ getPrintFormatado(getSaldo()) +"  |");
        System.out.println("+--------------------------------------------------+----------------+");
    }
}
