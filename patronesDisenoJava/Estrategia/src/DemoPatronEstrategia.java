import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoPatronEstrategia {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el primer numero: ");
        float numero1 = Float.parseFloat(br.readLine());
        System.out.print("Ingrese el segundo numero: ");
        float numero2 = Float.parseFloat(br.readLine());

        Contexto contexto = new Contexto(new Sumar());
        System.out.println("Sumar = " + contexto.ejecutarEstrategia(numero1, numero2));

        contexto = new Contexto(new Restar());
        System.out.println("Restar = " + contexto.ejecutarEstrategia(numero1, numero2));

        contexto = new Contexto(new Multiplicar());
        System.out.println("Multiplicar = " + contexto.ejecutarEstrategia(numero1, numero2));
    }
}
