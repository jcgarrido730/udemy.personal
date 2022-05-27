public class PalabraReturnClases {
    public static void main(String[] args){
        Division d = creaObjetoDivision();
        int resultado = 0;

        if(d.b != 0){
            resultado = d.a / d.b;
        }

        System.out.println("resultado = " + resultado);
    }

    public static Division creaObjetoDivision() {
        Division d = new Division(3, 4);
        return d;
    }
}

class Division{
    int a;
    int b;

    Division(int a, int b){
        this.a = a;
        this.b = b;
    }
}
