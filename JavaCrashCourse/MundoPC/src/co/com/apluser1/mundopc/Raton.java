package co.com.apluser1.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private double precio;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " Raton{" +
                "idRaton=" + idRaton +
                ", precio=" + precio +
                '}';
    }
}
