

## Descrição

Este código permite ao usuário inserir dois números inteiros através do terminal e, com base nesses números, o programa realizará uma contagem incremental e imprimirá uma série de mensagens no console. O sistema também é projetado para lidar com entradas inválidas e situações específicas que requerem tratamento de exceções.

### Funcionalidade Principal

####      Entrada de Dados:

        O usuário é solicitado a inserir dois números inteiros.
        O primeiro número representa o valor inicial, e o segundo número representa o valor final.

####      Lógica de Contagem:

        Se o primeiro número for menor que o segundo, o programa calculará quantos números existem entre esses dois valores (exclusivo do primeiro número) e imprimirá uma mensagem para cada número. Por exemplo, se você inserir 12 e 30, o programa imprimirá 18 mensagens, uma para cada número de 1 a 18.

####      Tratamento de Erros:

        Entrada Inválida: Se o usuário inserir qualquer caractere que não seja um número inteiro (como letras ou símbolos), o sistema exibirá uma mensagem informando que são necessários números inteiros válidos e não continuará a execução.
        Ordem dos Parâmetros: Se o primeiro número for maior ou igual ao segundo, o sistema lançará uma exceção personalizada e exibirá a mensagem "O segundo parâmetro deve ser maior que o primeiro", indicando que a ordem dos números está incorreta.

### Fluxo de Operação

####     Execução do Programa:

        O programa inicia e solicita que o usuário insira o primeiro número.
        Em seguida, solicita que o usuário insira o segundo número.

####     Validação das Entradas:

        Se os valores inseridos forem números inteiros válidos, o programa verifica se o primeiro número é menor que o segundo.
        Se essa condição for atendida, o programa inicia a contagem e imprime as mensagens correspondentes.

####     Mensagens de Saída:

        Para cada número na faixa de contagem (do número 1 até o número que representa a diferença entre o segundo e o primeiro número inserido), o programa imprime uma mensagem como "Imprimindo o número X", onde X é o número atual da contagem.

####     Encerramento:

        Se as entradas forem válidas e na ordem correta, o programa concluirá após a contagem.
        Se ocorrer qualquer erro (entrada inválida ou ordem incorreta), o programa exibirá a mensagem de erro correspondente e encerrará a execução.
