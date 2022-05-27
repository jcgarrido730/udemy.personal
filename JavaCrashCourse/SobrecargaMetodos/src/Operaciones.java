public class Operaciones {

    //Metodo sumar
    public static int sumar(int a, int b){
        System.out.print("sumar(" + a + ":int, " + b + ":int): ");
        return a + b;
    }

    public static double sumar(int a, double b){
        System.out.print("sumar(" + a + ":int, " + b + ":double): ");
        return a + b;
    }

    public static double sumar(double a, int b){
        System.out.print("sumar(" + a + ":double, " + b + ":int): ");
        return a + b;
    }

    public static double sumar(double a, double b){
        System.out.print("sumar(" + a + ":double, " + b + ":double): ");
        return a + b;
    }
}
