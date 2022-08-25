      /*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 24/08/2022
 */
package CaixaEletronico;

//Importando calsses ramdom e o scanner.
import java.util.Random;
import java.util.Scanner;

public class Caixa {
    //Criando classe main.
    public static void main(String[] args) {
        
        //Criando e inicializando objeto para a classe Banco.
        Banco caixa = new Banco();
        
        //Criando e inicializando objeto para a classe Random.
        Random numero = new Random();
        
        //Criando e inicializando objetos para a classe Scanner.
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        
        //Criaando e inicializando variavies para entrada de dados para o switch case.
        int acao,bancos;
         

        //Entrada de Dados.
        System.out.println(" --- Sistema Do Caixa Eletronico --- ");
        System.out.println("\n");
        
        //Entrada de dados pro nome do titular da conta.
        System.out.println("Seu nome por favor : ");
        //Scanner do tipo String para receber o nome. 
        caixa.titular = s.nextLine(); 

        //Entrada de dados para saber o banco do usuario.
        System.out.println("Por favor " + caixa.titular + " selecione o nome do seu Banco: " );
        System.out.println(" (1) - Itaú;");
        System.out.println(" (2) - Bradesco;");
        System.out.println(" (3) - Banco do Brasil;");
        System.out.println("\nDigite a Opção: ");
        
        //Scanner do tipo Int para receber o banco.
        bancos = c.nextInt();  

        //Estrutura condicional para saber qual o Banco o usuario escolher.
        
            switch(bancos){
                case 1:
                    //caso selecione 1 o nome do banco recebera "Itaú".
                    caixa.nomeBanco = "Itaú";
                    break;
                case 2: 
                    //caso selecione 2 o nome do banco recebera "Bradesco".
                    caixa.nomeBanco = "Bradesco";
                    break;
                case 3:
                    //caso selecione 3 o nome do banco recebera "Banco do Brasil".
                    caixa.nomeBanco = "Banco do Brasil";
                    break;
            }
            
        //Saida de dados para as informações do titular/usuario. 
        System.out.println("\n");
        
        //Nome do banco escolhido. 
        System.out.println("  --- Banco " + caixa.nomeBanco);  
        
        //Nome do titular.                                               
        System.out.println("Muito bem " + caixa.titular);   
        
        // criando numero aleatorio para o numero da conta ficticia.                                                   
        caixa.numeroConta =  numero.nextInt(10000);     
        
        // Aqui imprimi o numero da conta e a agencia.                                               
        System.out.println("O numero da sua conta é: " + caixa.numeroConta + " agência: " + caixa.agencia);  
        
        //Quando a conta do titular foi criada
       
        //criando numero do dia aleatório
        caixa.dia = numero.nextInt(31);
        
        //cirando numero do mes aleatorio
        caixa.mes = numero.nextInt(12);
        
        //Deixando a String dataAbertura com o dia mes e ano criados acima
        caixa.dataAbertura = caixa.dia + "/" + caixa.mes + "/" + caixa.ano;

        //Impressão da data de abertura 
        System.out.println("Data de abertura da conta: "+caixa.dataAbertura);
        
        //Saldo da pessoa.
        System.out.println("Saldo Disponivel: " + caixa.saldo); 
        //OBS: O saldo sempre irá vir com R$ 1500 (Pré definido na classe Caixa.java).

                //Criando um do while para repetição de ações que o usuario. 
                    do{
                        //Chamando o metodo menu.
                        Menu();
                        //entrada de dados da variavel acao e usar no switch.
                        acao = s.nextInt();
                    
                        switch(acao){
                            // caso for 1 (Saque).
                            case 1:
                                System.out.println("Qual o valor do saque?");
                                //Receberá o valor do saque proposto.
                                double saque = s.nextDouble();
                                //Chamada do metodo Sacar().
                                caixa.Sacar(saque);
                                //Imprimira o saldo restante.
                                System.out.println("Saldo Disponível: R$ "+caixa.saldo);
                                break;
                            
                            // caso for 2 (Deposito). 
                            case 2: 
                                System.out.println("Qual o valor do deposito?");
                                //Receberá o valor do deposito proposto.
                                double deposito = s.nextDouble();
                                //Chamada do metodo Deposito().
                                caixa.Despositar(deposito);
                                //Imprimira o saldo resultante.
                                System.out.println("Saldo Disponível: R$ "+caixa.saldo);
                                break;

                            case 3:
                                System.out.println("Qual o valor a ser retirado da poupanca?");
                                //Receberá o valor do saque proposto na conta poupanca.
                                double valorPR = s.nextDouble();
                                //Chamada do metodo RetirarPoupanca().
                                caixa.RetirarPoupanca(valorPR);
                                //Imprimira o valor da poupança.
                                System.out.println("valor na poupanca: R$ " + caixa.poupanca);
                                //Imprimira o saldo resultante.
                                System.out.println("Saldo Disponível: R$ "+caixa.saldo);
                                break;
                                
                            // caso for 4 Deposita na poupanca (DepositarPoupanca). 
                            case 4:
                                System.out.println("Qual o valor a ser guardado na poupanca?");
                                //Receberá o valor do saque proposto.
                                double valorPD = s.nextDouble();
                                //Chamada do metodo CalcularSaldo().
                                caixa.DepositarPoupanca(valorPD);
                                System.out.println("Transferencia realizada com sucesso");
                                //Imprimira o valor guardado na poupança.
                                System.out.println("valor na poupanca: R$ " + caixa.poupanca);
                                //Imprimira o saldo resultante.
                                System.out.println("Saldo Disponível: R$ "+caixa.saldo);
                                break;

                            
                
                        }
                        //Caso a opção for 5 (Sair) encerrará a aplicação.
                    }while(acao !=5);
         
                
    }

        //Criando metodo menu para o usuario escolher as opções que o programa realizará. 
        public static void Menu(){
            System.out.println("\n- o que você gostaria de fazer: Sacar, Despositar ou Calcular Saldo? ");
            System.out.println(" (1) - Sacar;");
            System.out.println(" (2) - Depositar;");
            System.out.println(" (3) - Retirar da poupanca;");
            System.out.println(" (4) - Depositar na poupanca;");
            System.out.println(" (5) - Sair;");
            System.out.println("\nDigite a Opção: ");

    }

}


