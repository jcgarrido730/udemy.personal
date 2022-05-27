public class Main {
    public static void main(String[] args){
        String str1 = "Cadena 1";
        String str2 = "Cadena 2";

        System.out.println("Concatenar: " + str1 + " con " + str2);
        System.out.println("Nueva linea: \n" + str1);
        System.out.println("Tabulador: \t" + str1);
        System.out.println("Retroceso: \b" + str1);
        System.out.println("Retorno de carro: \r" + str1); //no se imprime la frase Retorno de carro: porque str1 queda al inicio de la linea
        System.out.println("Comilla simple: \'" + str1 + "\'");
        System.out.println("Comilla doble: \"" + str1 + "\"");
    }
}
