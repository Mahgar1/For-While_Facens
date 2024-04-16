package ExerciciosFor;
import java.util.Scanner;
public class PesquisaPrefeitura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int totalHabitantes = 15;
        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;


        for (int i = 1; i <= totalHabitantes; i++) {
            System.out.println("Habitante " + i);
            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();
            somaSalarios += salario;
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            System.out.print("Digite o número de filhos: ");
            int numFilhos = scanner.nextInt();
            somaFilhos += numFilhos;
        }

        // Calculando média do salário e média do número de filhos
        double mediaSalario = somaSalarios / totalHabitantes;
        int mediaFilhos = (int) somaFilhos / totalHabitantes;


        // Exibindo resultados
        System.out.println("\nResultados da pesquisa:");
        System.out.printf("Média do salário da população: %.2f\n", mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);

        exibirTotalDaPesquisa(somaFilhos, somaSalarios, totalHabitantes);
        
        scanner.close();
    }

    public static void exibirTotalDaPesquisa(int somaFilhos, double somaSalarios, int totalHabitantes){
        System.out.printf("Total de filhos: %d | Total de salários: %.2f | Total de habitantes: %d\n", somaFilhos, somaSalarios, totalHabitantes);
    }
    
}
