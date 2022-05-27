public class Main {
    public static void main(String[] args){
        //float, double
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double: " + Double.MAX_VALUE);

        float floatVar = 0.5F;
        System.out.println("floatVar = " + floatVar);

        double doubleVar = 0.5D;
        System.out.println("doubleVar = " + doubleVar);

        var floatVar2 = 0.15F;
        System.out.println("floatVar = " + floatVar2);

        var doubleVar2 = 0.15D;
        System.out.println("doubleVar = " + doubleVar2);
    }
}
