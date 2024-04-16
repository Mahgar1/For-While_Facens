package ExercicioWhile;
import java.util.Scanner;

public class RecebeNumerosInterativamente {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        
        int numero;
        int maiorNumero = Integer.MIN_VALUE;
        int soma = 0;
        int quantidadeNumeros = 0;
        int opcao;
        
        do {
            System.out.print("Digite um número: ");
            numero = entradaDeDados.nextInt();
            
            soma += numero;
            quantidadeNumeros++;
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            
            System.out.println("Digite 1 para informar mais um número ou 2 para parar: ");
            opcao = entradaDeDados.nextInt();
        } while (opcao == 1);
        
        double media = (double) soma / quantidadeNumeros;
        
        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("A média aritmética dos números digitados é: " + media);
        entradaDeDados.close();
    }
}