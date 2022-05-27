import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Simbolo: ");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.print("Envio gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        System.out.println(nombre + " #" + String.valueOf(id));
        System.out.println("Precio: " + simbolo + String.valueOf(precio));
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}
