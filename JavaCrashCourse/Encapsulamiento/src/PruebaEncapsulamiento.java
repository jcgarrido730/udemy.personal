public class PruebaEncapsulamiento{
    public static void main(String[] args){
        Persona persona1 = new Persona("Veronica", "Arellano", true);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        persona1.setApellido("Arellano Estrada");
        System.out.println(persona1.isBorrado());
        System.out.println(persona1.toString());
        System.out.println(persona1);
    }
}
