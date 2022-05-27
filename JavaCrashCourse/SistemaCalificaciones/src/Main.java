import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var texto = "Valor desconocido";
        double valor = Double.parseDouble(scanner.nextLine());

        if (valor >= 9 && valor <= 10)
            texto = "A";
        else if (valor >= 8 && valor < 9)
            texto = "B";
        else if (valor >= 7 && valor < 8)
            texto = "C";
        else if (valor >= 6 && valor < 7 )
            texto = "D";
        else if (valor >=0 && valor < 6)
            texto = "F";
        else
            texto = "Valor desconocido";
        System.out.println(texto);
    }
}
