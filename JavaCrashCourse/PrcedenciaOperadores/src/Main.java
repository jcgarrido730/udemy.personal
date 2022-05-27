import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        var x = 5;
        var y = 10;
        var z = ++x + y--; //x = 6, y = 10
        //x antes de utilizarse se incrementa el valor
        //y se utiliza con el valor con el que se inicializo, posterior mente se decrementa en 1

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Precedencia de operadores");
        var resultado = 4 + 5 * 6 / 3; //4+(5*6)/3 => 4+30/3 => 4+10 => 14
        System.out.println("resultado = " + resultado);

        resultado = (4 + 5) * (6 / 3);
        System.out.println("resultado = " + resultado);

        //Ejercicio:
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        //Se evalua: 4 / ++a (donde 'a' se preincrementa y vale 3)
        System.out.println(6 / 3); //Imprime 2
        //Se evalua: 2 * 4
        System.out.println(2 * 4 ); //imprime 8
        //Se evalua -3 + 8
        System.out.println(-3 + 8); //imprime 5
        //Se evalua 5 - b-- (donde b primero se asigna 3, y luego se decrementa)
        System.out.println(5 - 3); //imprime 2
        //Se evalua 2 + b (teniamos pendiente un decremento de b, vale 2)
        System.out.println(2 + 2);//imprime 4,
        //System.out.println("res = " + res); //es el mismo valor que el valor final


        //Agrupando con parentesis tenemos:
        //Recordar que las expresiones se evaluan de izquierda a derecha
        //y se comienza a agrupar aplicando la precedencia de operadores
        //int res2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
        //System.out.println("res2 = " + res2);
    }
}
