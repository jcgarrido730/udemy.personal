public class PalabraNull {
    public static void main(String[] args){
        Persona p1 = new Persona("Juan");
        System.out.println("Nombre objeto p1: " + p1.obtenerNombre());

        Persona p2 = p1; //p2 paunta al mismo objeto que p1
        System.out.println("Nombre objeto p2: " + p2.obtenerNombre());

        //p1 ya no apunta a ningun objeto
        p1 = null;
        System.gc(); //garbage collector solo planifica la llamada y el objeto persona no se destruye porque todavía existe el objeto p2

        //comprobamos si p1 existe
        if(p1 != null){
            System.out.println("Comprobamos que p1 sigue accediendo al objeto: " + p1.obtenerNombre());
        }

        //comprobamos que p2 sigue accediendo al objeto
        System.out.println("Comprobamos que p2 sigue accediendo al objeto: " + p2.obtenerNombre());
    }
}

class Persona{
    String nombre;

    public Persona(String n){
        this.nombre = n;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}
