      /*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 22/08/2022
 */
package CaixaEletronico;

//Importando calsses ramdom e o scanner
import java.util.Random;
import java.util.Scanner;

public class Caixa {
    //Criando classe main
    public static void main(String[] args) {
        
        //Criando e inicializando objeto para a classe Banco
        Banco caixa = new Banco();
        //Criando e inicializando objeto para a classe Random
        Random numero = new Random();
        //Criando e inicializando objetos para a classe Scanner
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        //Criaando e inicializando variavies para entrada de dados para o switch case
        int acao,bancos;
         

        //Entrada de Dados
        System.out.println(" --- Sistema Do Caixa Eletronico --- ");
        System.out.println("\n");
        //Entrada de dados pro nome do titular da conta
        System.out.println("Seu nome por favor : ");
        caixa.titular = s.nextLine(); //Scanner do tipo String para receber o nome 

        //Entrada de dados para saber o banco do usuario
        System.out.println("Por favor " + caixa.titular + " selecione o nome do seu Banco: " );
        System.out.println(" (1) - Itaú;");
        System.out.println(" (2) - Bradesco;");
        System.out.println(" (3) - Banco do Brasil;");
        System.out.println("\nDigite a Opção: ");
        bancos = c.nextInt();  //Scanner do tipo Int para receber o banco 

        if(bancos == 1){
            caixa.nomeBanco = "Itaú";
        }else if(bancos == 2){
            caixa.nomeBanco = "Bradesco";
        }else{
            caixa.nomeBanco = "Banco do Brasil";
        }
       
        System.out.println("\n");
        System.out.println("  --- Banco " + caixa.nomeBanco);
        System.out.println("Muito bem " + caixa.titular);
        caixa.numeroConta =  numero.nextInt(10000);
        System.out.println("O numero da sua conta é: " + caixa.numeroConta + " agência: " + caixa.agencia);
        System.out.println("Saldo Disponivel: " + caixa.saldo);

                    do{
                        Menu();
                        acao = s.nextInt();
                    
                        switch(acao){
                            
                            case 1:
                                System.out.println("Qual o valor do saque?");
                                double saque = s.nextDouble();
                                caixa.Sacar(saque);
                                System.out.println("Saldo Disponível: "+caixa.saldo);
                                break;
            
                            case 2: 
                                System.out.println("Qual o valor do deposito?");
                                double deposito = s.nextDouble();
                                caixa.Despositar(deposito);
                                System.out.println("Saldo Disponível: "+caixa.saldo);
                                break;
                                
                            
                            case 3:
                                caixa.CalcularSaldo(caixa.saldo);
                                System.out.println("Seu rendimento é de: "+caixa.rendimento);
                                break;
                
                        }
            
                    }while(acao !=4);
         
                
    }

        //Criando metodo menu para o usuario escolher as opções que o programa realizará 
        public static void Menu(){
            System.out.println("\n- o que você gostaria de fazer: Sacar, Despositar ou Calcular Saldo? ");
            System.out.println(" (1) - Sacar;");
            System.out.println(" (2) - Depositar;");
            System.out.println(" (3) - Calcular Saldo;");
            System.out.println(" (4) - Sair;");
            System.out.println("\nDigite a Opção: ");

    }

}


