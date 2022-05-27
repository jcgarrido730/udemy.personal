import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ancho de la caja= ");
        int ancho = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el alto de la caja= ");
        int alto = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la profundidad de la caja= ");
        int profundo = Integer.parseInt(scanner.nextLine());

        Caja objCaja = new Caja(ancho, alto, profundo);

        System.out.println("el volumen de la caja es: " + objCaja.calcularVolumen());
    }
}
