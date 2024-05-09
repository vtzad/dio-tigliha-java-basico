import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
  
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero da conta: ");
        int numero = Scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia= Scanner.next();
        
        System.out.println("Digite seu nome; ");
        String nomeCliente = Scanner.next();

        System.out.println("Digite seu saldo; ");
        double saldo = Scanner.nextDouble();

        System.out.println("digite o numero da conta " + numero + " numero " );
        System.out.println("digite o numero da agencia " + agencia + " agencia ");
        System.out.println("digite seu nome  " + nomeCliente );
        System.out.println("digite seu saldo  " + saldo + " seu saldo é ");
        System.out.println("olá cliente " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}