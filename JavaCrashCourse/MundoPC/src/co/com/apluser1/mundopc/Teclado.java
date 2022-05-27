package co.com.apluser1.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private double precio;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " Teclado{" +
                "idTeclado=" + idTeclado +
                ", precio=" + precio +
                '}';
    }
}
