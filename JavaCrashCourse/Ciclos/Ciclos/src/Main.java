import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //while: la condicion se evalua al principio
        while(condicion){
            //cuerpo del bloque de codigo a repetir;
            //condicion de parada;
        }

        //do-while: la condicion se evalua al final. El codigo se ejecuta al menos una vez
        do{
            //cuerpo del bloque de codigo a repetir;
            //condicion de parada;
        } while(condicion);

        //for: iteraciones
        for(inicializacion; condicion; iteracion){
            //cuerpo del bloque de codigo a repetir;
        }
    }
}
