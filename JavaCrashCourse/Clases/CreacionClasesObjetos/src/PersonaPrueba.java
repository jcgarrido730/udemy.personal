public class PersonaPrueba {
    public static void main(String[] args){
        //creacion del objeto persona
        Persona persona1 = new Persona();

        //llamado al metodo de la clase persona
        System.out.println("valores por default del objeto persona1: ");
        persona1.desplegarNombres();

        //modificar valores
        persona1.nombre = "Veronica";
        persona1.apellidoPaterno = "Arellano";
        persona1.apellidoMaterno = "Estrada";
        System.out.println("valores por default del objeto persona1: ");
        persona1.desplegarNombres();
    }
}
