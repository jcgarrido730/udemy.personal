public class PasoPorReferencia {
    public static void main(String[] args){
        Persona persona = new Persona();

        imprimirNombre(persona);
        persona.cambiarNombre("Juan");
        imprimirNombre(persona);

        modificarPersona(persona);
        imprimirNombre(persona);

        persona = null;
    }

    public static void imprimirNombre(Persona p){
        System.out.println("Valor recibido= " + p.obtenerNombre());
    }

    public static void modificarPersona(Persona p){
        p.cambiarNombre("Carlos");
    }
}
