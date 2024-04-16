package ExercicioWhile;

import java.util.Scanner;

public class CalculadoraInterativa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Pressione 1 para somar");
            System.out.println("Pressione 2 para subtração");
            System.out.println("Pressione 3 para sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    double numero1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    double numero2 = scanner.nextDouble();
                    double resultadoSoma = numero1 + numero2;
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                case 2:
                    System.out.println("Digite o primeiro número:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    double num2 = scanner.nextDouble();
                    double resultadoSubtracao = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida tente novamente.");
            }
            System.out.println("*************************");
        }
        scanner.close();
    }
}
