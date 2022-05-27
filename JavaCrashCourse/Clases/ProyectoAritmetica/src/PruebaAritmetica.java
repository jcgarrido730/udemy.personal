public class PruebaAritmetica {
    public static void main(String[] args)
    {
        Aritmetica  aritmetica = new Aritmetica();
        int resultado = aritmetica.sumar(5, 3);
        System.out.println("a = " + aritmetica.a);
        System.out.println("b = " + aritmetica.b);
        System.out.println("resultado= " + resultado);

        System.out.println();
        Aritmetica objeto1 = new Aritmetica();
        objeto1.a = 1;
        objeto1.b = 3;
        System.out.println("a = " + objeto1.a);
        System.out.println("b = " + objeto1.b);
        resultado = objeto1.sumar();
        System.out.println("resultado = " + resultado);

        System.out.println();
        Aritmetica objeto2 = new Aritmetica(2, 4);
        System.out.println("resultado 2= " + objeto2.sumar());

        int operandoA = 6;
        int operandoB = 2;
        Aritmetica objeto3 = new Aritmetica(operandoA, operandoB);

        System.out.println("\nResultado sumar= " + objeto3.sumar());
        System.out.println("\nResultado restar= " + objeto3.restar());

        System.out.println("\nResultado multiplicar= " + objeto3.multiplicar());
        System.out.println("\nResultado dividir= " + objeto3.dividir());
    }
}
