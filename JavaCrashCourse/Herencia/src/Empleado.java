public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++contadorEmpleados;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Primero se manda a llamar el metodo toString de Persona
    //para que se pueda observar los valores de la clase padre,
    //y despues se imprimen los valores de la clase hija
    @Override
    public String toString() {
        return super.toString() + ", Empleado{"
                                + " idEmpleado='" + idEmpleado + '\''
                                + ", sueldo='" + sueldo + '\''
                                + '}';
    }
}
