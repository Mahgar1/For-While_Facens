package ExerciciosFor;

public class ImprimeFigura {

    public static void main(String[] args) {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
