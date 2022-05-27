import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("break... imprime el primer numero par del ciclo.");
        for (int i = 0; i < 3; i++) {
            if(i % 2 == 0)
                System.out.println("i = " + i);
            break;
        }
        System.out.println();
        System.out.println("continue... salta la impresion de los numeros impares del ciclo.");
        for (int i = 0; i < 3; i++) {
            if(i % 2 != 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}
