import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta ! ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Por favor, digite o número da Agencia ! ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome ! ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
        
        scanner.close();
        }

}