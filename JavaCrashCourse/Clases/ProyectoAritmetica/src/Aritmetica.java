public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    Aritmetica(){

    }

    //constructor con 2 argumentos
    Aritmetica(int arg1, int arg2)
    {
        this.a = arg1;
        this.b = arg2;
    }

    public int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    public int sumar()
    {
        return a + b;
    }

    public int restar()
    {
        return a - b;
    }

    public int multiplicar()
    {
        return a * b;
    }

    public int dividir()
    {
        return a / b;
    }
}
