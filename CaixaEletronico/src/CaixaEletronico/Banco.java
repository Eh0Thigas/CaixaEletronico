
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
    
    //Data de abertura da conta, com o dia e o mes aleatorio e o ano (que ja vai ser pré cadastrado).
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

    //Criando variavel poupança do tipo double.
    double poupanca;


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
            //Efetura o saque proposto.
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

    //Criando metodo Depositar na poupanca.
    public double RetirarPoupanca(double valor){
        
        //verificação (Estrutura condicional) para ver se o valor proposto para retirar da
        //poupança é maior que o saldo da poupanca disponivel.
        
        //se o saque for maior que o saldo da poupanca.
        if(valor > poupanca){
            System.out.println("Não é possivel transferir para a poupança");
            System.out.println("Pois utrapassa o seu saldo na poupanca de " + poupanca);
        }
        //Caso for menor.
        else{
            //Efetura a transferencia com o valor proposto.
            //O metodo poupança recebera um valor escolhido pelo usuario 
            // e ira subtrair do saldo na poupanca disponivel para transferir o valor
            // a variavel saldo
            System.out.println("Transferencia realizada com sucesso");
            poupanca = poupanca - valor;
            saldo = saldo + valor;
        }
        
        return poupanca;
    }

    //Criando metodo Depositar na poupanca.
    public double DepositarPoupanca(double valor){
        
        //verificação (Estrutura condicional) para ver se o valor proposto para transferir para 
        //o saldo da poupança é maior que o saldo disponivel.
        
        //se o saque for maior saldo.
        if(valor > saldo){
            System.out.println("Não é possivel transferir para a poupança");
            System.out.println("Pois utrapassa o seu saldo de " + saldo);
        }
        //Caso for menor.
        else{
            //Efetura a transferencia com o valor proposto.
            //O metodo poupança recebera um valor escolhido pelo usuario 
            // e ira subtrair do saldo disponivel para transferir o valor
            // a variavel poupança
            System.out.println("Transferencia realizada com sucesso");
            saldo = saldo - valor;
            poupanca = valor;
        }
        
        return poupanca;
    }

}
