      /*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 22/08/2022
 */
package CaixaEletronico;

import java.util.Random;
import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        
        Banco conta = new Banco();
        Random numero = new Random();
        Scanner s = new Scanner(System.in);
        int acao;

        System.out.println(" --- Sistema De Conta Corrente --- ");

        System.out.println("\n");
        System.out.println("Seu nome por favor : ");
        String nome = s.nextLine();

        System.out.println("\n");
        System.out.println("Muito bem " + nome);

        conta.numeroConta =  numero.nextInt(10000);
        System.out.println("O numero da sua conta é: " + conta.numeroConta + " agência: " + conta.agencia);
        System.out.println("Saldo Disponivel: " + conta.saldo);

        
        do{
            menu();
            acao = s.nextInt();
        
            switch(acao){
                
                case 1:
                    System.out.println("Qual o valor do saque?");
                    double saque = s.nextDouble();
                    conta.Sacar(saque);
                    System.out.println("Saldo Disponível: "+conta.saldo);
                    break;

                case 2: 
                    System.out.println("Qual o valor do deposito?");
                    double deposito = s.nextDouble();
                    conta.Despositar(deposito);
                    System.out.println("Saldo Disponível: "+conta.saldo);
                    break;
                    
                
                case 3:
                    conta.calcularRendimento(conta.saldo);
                    System.out.println("Seu rendimento é de: "+conta.rendimento);
                    break;
    
            }

        }while(acao !=4);
        
      


    }

    public static void menu(){
        System.out.println("\n- o que você gostaria de fazer: Sacar, Despositar ou ver o Rendimento? ");
        System.out.println(" (1) - Sacar;");
        System.out.println(" (2) - Depositar;");
        System.out.println(" (3) - Calcular Rendimento;");
        System.out.println(" (4) - Sair;");
        System.out.println("\nDigite a Opção: ");

    }

}


