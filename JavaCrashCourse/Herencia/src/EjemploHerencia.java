import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Juan", 2500);
        empleado1.setEdad(25);
        empleado1.setGenero('M');
        empleado1.setDireccion("Cali-Sur");
        System.out.println("empleado1: " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Armando");
        cliente1.setEdad(30);
        cliente1.setGenero('M');
        cliente1.setDireccion("Cali-Norte");
        System.out.println("cliente1: " + cliente1);
    }
}
