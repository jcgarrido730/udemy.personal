import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int alto = 0;
        int ancho = 0;
        int area = 0;
        int perimetro = 0;

        alto = Integer.parseInt(scanner.nextLine());
        ancho = Integer.parseInt(scanner.nextLine());

        area = alto * ancho;
        perimetro = (alto + ancho) * 2;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
