package ExerciciosFor;


import java.util.Scanner;
public class CalculoMediasAlunos{
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        int alunosTotal = 30;
        

        for (int i = 0; i <= alunosTotal; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.println("Digite a nota da teoria: ");
            double notaDaTeoria = entradaDeDados.nextDouble();
            System.out.println("Digite a nota de laboratório: ");
            double notaDoLaboratorio = entradaDeDados.nextDouble();
        
            double mediaFinal = calcularMediaFinal(notaDaTeoria, notaDoLaboratorio);
            System.out.println("Média Final " + mediaFinal + " - Status: " + verificarStatus(mediaFinal));
            System.out.println();
        }


        entradaDeDados.close();
    }

    public static double calcularMediaFinal(double notaDaTeoria, double notaDoLaboratorio){
        return notaDaTeoria * 0.6 + notaDoLaboratorio * 0.4;
    }

    public static String verificarStatus(double mediaFinal) {
        if (mediaFinal >= 7) {
            return "Bem";
        } 
        else if (mediaFinal >= 5) {
            return "Razoável";
        } 
        else {
            return "Mal";
        }


    }


}
