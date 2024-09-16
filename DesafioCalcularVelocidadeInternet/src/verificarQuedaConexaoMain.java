import java.util.Scanner;

public class verificarQuedaConexaoMain {

     // Função para verificar se houve queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        // Percorre cada velocidade na lista
        for (String velocidade : velocidades) {
            // Remove espaços em branco e converte para inteiro
            int velocidadeInt;
            try {
                velocidadeInt = Integer.parseInt(velocidade.trim());
            } catch (NumberFormatException e) {
                // Se a conversão falhar, ignora o valor e continua
                continue;
            }
            
            // Verifica se a velocidade é igual a 0
            if (velocidadeInt == 0) {
                return "Queda de Conexao";
            }
        }
        // Se não encontrar nenhuma velocidade igual a 0
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        // 130,50,0,90,130,136 - Queda de Conexao
        // 120,130,125,125,120,130 - Sem Quedas
        // 110,125,80,0,105,125 - Queda de Conexao
        System.out.println("Digite as velocidades de conexão separadas por vírgula:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
