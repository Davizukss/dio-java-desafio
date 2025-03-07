
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa: Por favor, digite o número da Conta! ");
        int NumeroConta = scan.nextInt();
        System.out.println("Programa: Por favor, digite o número da Agência! ");
        String Agencia = scan.next();
        System.out.println("Programa: Por favor, digite o seu nome! ");
        String NomeCliente = scan.next();
        System.out.println("Programa: Por favor, digite o seu saldo! ");
        double Saldo = scan.nextDouble();
        scan.close();
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque");
}
}
