# modaba
modaba
import java.util.Scanner;

public class ModabaPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número para 'y modaba' (n): ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Por favor, ingrese un número entero positivo.");
            } else {
                generarModaba(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número entero válido.");
        }
    }

    private static void generarModaba(int n) {
        for (int i = 1; i <= n; i++) {
            String resultado = "y modaba" + "a".repeat(i);
            System.out.println(resultado);
        }
    }
}
