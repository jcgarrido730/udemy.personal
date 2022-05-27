import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //permite leer información desde la consola, teclado

        String titulo;
        String autor;

        System.out.print("Titulo del libro: ");
        titulo = scanner.nextLine();
        System.out.print("Nombre del autor: ");
        autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
