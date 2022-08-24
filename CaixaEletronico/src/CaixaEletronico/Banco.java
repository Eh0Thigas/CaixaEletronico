
/*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 22/08/2022
 */

package CaixaEletronico;

public class Banco {
    
    String titular , agencia = "0049", dataAbertura;
    int numeroConta;
    double saldo = 1500, rendimento;


    public double Sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }

    public double Despositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public double calcularRendimento(double saldo){
        rendimento = (saldo*100) / saldo;
        return rendimento;
    }

}
