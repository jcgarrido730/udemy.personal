public class PalabraReturn {
    public static void main(String[] args){
        var resultado = division(3, 6);
        System.out.println("division= " + resultado);
    }

    public static int division(int a, int b){
        if(b == 0){
            System.out.println("El diviso es cero.");
            return 0;
        }
        return a / b;
    }
}
