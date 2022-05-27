class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre){
        //cada que se crea un objeto Perosna se incrementa el contador para obtener un nuevo idPersona
        this.idPersona = contadorPersonas++;

        //se asigna el nombre recibido
        this.nombre = nombre;
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    public void idPersona(int i){
        this.idPersona = i;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public String toString(){
        return "idPersona: " + idPersona + ", Nombre: " + nombre;
    }
}
