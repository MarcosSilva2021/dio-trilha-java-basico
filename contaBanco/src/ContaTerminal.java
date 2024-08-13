import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe escaner
         // Cria um objeto Scanner para ler entradas do terminal
        Scanner scanner = new Scanner(System.in);

        //Exibir as msg p o usuario
         // Solicita e lê o número da conta
         System.out.println("Por favor, digite o número da Conta:");
         int numero = scanner.nextInt();
         scanner.nextLine();  // Limpa o buffer do scanner

         // Solicita e lê a agência
         System.out.println("Por favor, digite o número da Agência:");
         String agencia = scanner.nextLine();

          // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Exibir a msg conta criada
         // Concatena a mensagem de saída com os dados fornecidos
         String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibe a mensagem final
        System.out.println(mensagem);

    }
}
