import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int res1=0, num1=3, num2=5, modulo=0;
        double res2=0.0, num3=8.5, num4 = 0.0;
        boolean boolVar1 = true;
        boolean boolVar2 = true;

        //operadores aritmeticos
        res1 = num1 + num2;
        res1 = num1 - num2;
        res1 = num1 * num2;
        res2 = num3 / num1;
        modulo = num1 % 2;


        //operadores de asignacion (-=, *=, /=, %=)
        res1 = res1 + 1;
        res1 += 1;


        //operadores unarios (-, !)
        res1 = -num1;
        boolVar1 = !boolVar2;

        //post-incremento
        res1++;
        //pre-incremento
        ++res1;
        //post-decremento
        res1--;
        //pre-decremento
        --res1;


        //operadores de igualdad (==, !=)
        //tipo de dato String no se compara con ==, se usa el String.equals(...);
        //operadores relacionales (>, >=, <, <=)

        //operadores condicionales (&&, ||, )


        //operador condicional o ternario (?:)
        //simplificación de la estructura de if else
        int numero = 10;
        var resultado = (numero % 2 == 0) ? "el numero es par" : "el numero es impar";
        var par = (numero % 2 == 0) ? true : false;
    }
}
