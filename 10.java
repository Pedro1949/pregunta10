import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura?: ");
        double altura = scanner.nextDouble();
        double g = 9.81;
        double tiempo = Math.sqrt((2 * altura) / g);

        System.out.println("El objeto tardara: " + tiempo );
    }
}
