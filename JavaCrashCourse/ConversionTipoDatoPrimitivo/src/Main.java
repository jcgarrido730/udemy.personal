import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double valorPi = Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);
        
        char c = "hola".charAt(0);
        System.out.println("c = " + c);
        char c1 = "hola".charAt(1);
        System.out.println("c1 = " + c1);

        var scanner = new Scanner(System.in);
        System.out.print("Ingresar la edad: "); //se produce una exepcion si la el valor de entrada no es de tipo int
        int edad2 = Integer.parseInt(scanner.nextLine());
        System.out.println("edad2 = " + edad2);

        System.out.print("Ingresar una cadena: ");
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

        String valorPiTexto = String.valueOf(valorPi);
        System.out.println("valorPiTexto = " + valorPiTexto);
        
        String valorPiTexto2 = "" + valorPi;
        System.out.println("valorPiTexto2 = " + valorPiTexto2);

        byte b1 = 10;
        short s1 = b1;
        System.out.println("s1 = " + s1);

        short s2 = 15;
        byte b2 = (byte) s2; //casteo de datos
        System.out.println("b2 = " + b2);
    }
}
