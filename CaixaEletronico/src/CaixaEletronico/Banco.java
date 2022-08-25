
/*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 24/08/2022
 */

 //PACKAGE  que o caixa eletronico esta.
package CaixaEletronico;

//iniciando a class Banco.
public class Banco {
    
    //Inicializando as variavies necessarias para a classe.
    //Nome do Titular.
    String titular ;
    
    //Agência do titular. 
    String agencia = "0049";
    
    //Data de abertura da conta, com o dia e o mes aleatorio e o ano ja vai ser pré cadastrado
    int dia;
    int mes;
    int ano = 2020;
    String dataAbertura;
    
    //Nome do banco.
    String nomeBanco;
    
    //Numero da conta. 
    int numeroConta;
    
    //Saldo na conta do titular.
    double saldo = 1500;


    //Criando metodo Sacar.
    public double Sacar(double valor){
        //verificação (Estrutura condicional) para ver se o saque proposto é maior que o saldo disponivel.
        //se o saque for maior saldo.
        if(valor > saldo){
            System.out.println("Não é possivel efetuar o Saque de " + valor);
            System.out.println("Pois utrapassa o seu saldo de " + saldo);
        }
        //Caso for menor.
        else{
            //Efetura o saldo proposto.
            //O metodo sacar recebera um valor escolhido pelo usuario 
            // e ira subtrair do saldo disponivel.
            saldo = saldo - valor;
        }
        //Retornara o saldo.
        return saldo;
    }

    //Criando metodo Depositar.
    public double Despositar(double valor){
        //O metodo deposito recebera um valor escolhido pelo usuario 
        // e somara com o saldo disponivel.
        saldo = saldo + valor;

        //Retornara o saldo. 
        return saldo;
    }

    //Criando metodo Calcular Saldo.
    public void CalcularSaldo(){

    }

}
