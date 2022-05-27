import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = Integer.parseInt(scanner.nextLine());
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El mayor es: " + (numero1 > numero2 ? numero1 : numero2));
    }
}
