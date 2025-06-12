import java.util.Locale; 
import java.util.Scanner; 

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;          
        String agencia;     
        String nomeCliente; 
        double saldo;        

        System.out.println("Bem-vindo ao Banco DIO!");
        System.out.println("Por favor, siga as instruções para criar sua conta.");
        System.out.println("--------------------------------------------------");

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt(); 

        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência (Ex: 067-8): ");
        agencia = scanner.nextLine(); 

        System.out.print("Por favor, digite o seu Nome Completo: ");
        nomeCliente = scanner.nextLine(); 

 
        System.out.print("Por favor, digite o saldo inicial da conta (Ex: 237.48): ");
        saldo = scanner.nextDouble();

        System.out.println("\n--------------------------------------------------");
        System.out.println("Processando informações...");
        System.out.println("--------------------------------------------------");

        String mensagemFinal = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );

        System.out.println(mensagemFinal);

        System.out.println("--------------------------------------------------");
        System.out.println("Conta criada com sucesso! Tenha um ótimo dia!");

        scanner.close();
    }
}