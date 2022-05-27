public class Main {
    public static void main(String[] args){
        //boolean, el tamaño del tipo de dato depende de la arquitectura
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = false;

        if(booleanVar)
            System.out.println("La variable tiene valor verdadero");
        else
            System.out.println("La variable tiene valor falso");

        var edad = 23;
        var adulto = edad >= 18;
        if (adulto)
            System.out.println("Mayor de edad");
        else
            System.out.println("Menor de edad");

    }
}
