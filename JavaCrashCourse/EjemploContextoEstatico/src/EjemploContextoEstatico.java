public class EjemploContextoEstatico {
    public static void main(String[] args){
        Persona p1 = new Persona("Juan");
        System.out.println("Persona1: " + p1);

        Persona p2  = new Persona("Veronica");
        System.out.println("Persona2: " + p2);

        //se imprime el contador contadorPersonas
        System.out.println("Nro. Personas: " + Persona.getContadorPersonas());
    }
}
