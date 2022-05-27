public class Main {
    public static void main(String[] args){
        //char
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo byte: " + Character.BYTES);
        System.out.println("valor minimo tipo byte: " + Character.MIN_VALUE); //los valores mínimo y máximo corresponden a la tabla unicode
        System.out.println("valor maximo tipo byte: " + Character.MAX_VALUE); //los valores mínimo y máximo corresponden a la tabla unicode

        char c1 = '!';
        System.out.println("c1 = " + c1);
        char c2 = '\u0021'; //unicode representacion hexadecimal
        System.out.println("c2 = " + c2);
        char c3 = 33; //decimal
        System.out.println("c3 = " + c3);

        var c4 = '!';
        System.out.println("c4 = " + c4); //no funciona para el caso que la representacion del caracter sea decimal, el var lo interpreta como entero
    }
}