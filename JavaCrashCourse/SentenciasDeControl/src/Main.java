import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        var texto = "numero desconocido";

        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(scanner.nextLine());
        if(numero == 1){
            texto = "numero uno";
        }
        else if(numero == 2){
            texto = "numero dos";
        }
        else if(numero == 3){
            texto = "numero tres";
        }
        else{
            texto = "numero desconocido";
        }
        System.out.println(texto);


        switch (numero){
            case 1:
                texto = "numero 1";
                break;
            case 2:
                texto = "numero 2";
                break;
            case 3:
                texto = "numero 3";
                break;
            default:
                texto = "numero desconocido";
                break;
        }
        System.out.println(texto);

    }
}
