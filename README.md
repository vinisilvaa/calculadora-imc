Este repositório contém um simples aplicativo Android desenvolvido em Kotlin para calcular o Índice de Massa Corporal (IMC). O aplicativo possui duas atividades principais: MainActivity para entrada de dados e ResultadoActivity para exibição do resultado do cálculo.

MainActivity

A MainActivity é a tela inicial do aplicativo, responsável por coletar as informações do usuário. Os campos de entrada incluem peso e altura, com validações para garantir que ambos sejam fornecidos. O botão "Calcular" inicia a ResultadoActivity e envia os dados fornecidos.

ResultadoActivity

A ResultadoActivity exibe o resultado do cálculo de IMC com base nos dados recebidos da MainActivity. Os resultados incluem peso e altura informados, o resultado do IMC categorizado (abaixo do peso, peso ideal, sobrepeso ou obeso) e o valor numérico do IMC. São realizadas verificações para lidar com casos em que peso ou altura não são informados, resultando em mensagens apropriadas.

Como Executar o Projeto
1- Clone o repositório.
2- Abra o projeto no Android Studio.
3- Execute o aplicativo em um emulador ou dispositivo Android.
