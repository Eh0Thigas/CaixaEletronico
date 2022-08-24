
/*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 22/08/2022
 */

 //PACKAGE  que o caixa eletronico esta 
package CaixaEletronico;

//iniciando a class Banco
public class Banco {
    
    //Inicializando as variavies necessarias para a classe
    String titular , agencia = "0049", dataAbertura;
    String nomeBanco1 = "Itaú" , nomeBanco2 = "Bradesco", nomeBanco3 = "Banco do Brasil";
    int numeroConta;
    double saldo = 1500, rendimento;


    public double Sacar(double valor){
        if(valor > saldo){
            System.out.println("Não é possivel efetuar o Saque de " + valor);
            System.out.println("Pois utrapassa o seu saldo de " + saldo);
        }else{
            saldo = saldo - valor;
        }
        return saldo;
    }

    public double Despositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public double CalcularSaldo(double saldo){
        rendimento = (saldo*100) / saldo;
        return rendimento;
    }

}
