
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
    String nomeBanco;
    int numeroConta;
    double saldo = 1500, rendimento;


    //Criando metodo Sacar
    public double Sacar(double valor){
        //verificação (Estrutura condicional) para ver se o saque proposto é maior que o saldo disponivel
        //se o saque for maior saldo
        if(valor > saldo){
            System.out.println("Não é possivel efetuar o Saque de " + valor);
            System.out.println("Pois utrapassa o seu saldo de " + saldo);
        }
        //Caso for menor
        else{
            //Efetura o saldo proposto
            saldo = saldo - valor;
        }
        return saldo;
    }

    //Criando metodo Depositar
    public double Despositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    //Criando metodo Calcular Saldo
    public void CalcularSaldo(){
        
    }

}
