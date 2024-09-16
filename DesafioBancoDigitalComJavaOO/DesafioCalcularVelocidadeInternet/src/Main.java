import java.util.Scanner;

public class Main {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        double soma = 0;
        int total = velocidades.length;

        // Somar todas as velocidades registradas
        for (String velocidade : velocidades) {
            try {
                // Convertendo a string para double
                soma += Double.parseDouble(velocidade.trim());
            } catch (NumberFormatException e) {
                // Se a conversão falhar, exibe uma mensagem de erro e ignora o valor inválido
                System.err.println("Valor inválido detectado: " + velocidade);
                total--; // Ajusta a quantidade para refletir a falha na conversão
            }
        }

        // Calcular a média, evitando divisão por zero
        if (total > 0) {
            return soma / total;
        } else {
            return 0; // Retorna 0 se não houver valores válidos
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        // 130,134,132,130,130,136 -- 132
        // 120,130,125,125,120,130 = 125
        // 110,100, 120,110, 115,105 = 110
        System.out.println("Digite as velocidades de conexão separadas por vírgula:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}   