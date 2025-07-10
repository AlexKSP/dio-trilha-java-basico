import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acountNumber;
        String agencia;
        String name;
        double balance;

        System.out.println("----Login----");
        System.out.println("Digite o número da conta: ");
        acountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        name = sc.nextLine();

        System.out.println("Saldo atual: ");
        balance = sc.nextDouble();

        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", name,agencia, acountNumber, balance);

        sc.close();
    }
}