public class PasoPorValor {
    public static void main(String[] args){
        var x = 10;
        imprimir(x);

        //no es posible cambiar el valor, pasa una copia del valor
        cambiarValor(x);
        imprimir(x);

        x = 15;
        imprimir(x);
    }

    public static void imprimir(int arg){
        System.out.println("arg= " + arg);
    }

    public static void cambiarValor(int i){
        i = 200;
    }
}
