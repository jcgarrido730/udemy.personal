//https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
public class PalabraThis {
    public static void main(String[] args){
        Persona p = new Persona("Juan");

        System.out.println("Imprime obeto Persona creado (p): " + p);
        System.out.println("Imprime valor del atributo (nombre): " + p.nombre);
    }
}

class Persona{
    String nombre; //atributo de la clsae Persona

    Persona(String nombre){
        this.nombre = nombre; //this es el objeto Persona (actual)

        //imprimir el objeto Persona
        Imprimir i = new Imprimir();
        i.imprimir(this); //this es el objeto Persona (actual)
    }
}

class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimir parámetro (o): " + o); //el parametro es el objeto persona
        System.out.println("Imprimir objeto actual (this): " + this); //this es el objeto imprimir (actual)
    }
}