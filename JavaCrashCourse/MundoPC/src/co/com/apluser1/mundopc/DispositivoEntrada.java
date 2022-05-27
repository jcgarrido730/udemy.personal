package co.com.apluser1.mundopc;

public class DispositivoEntrada {
    private int idDispotivoEntrada;
    private String tipoEntrada;
    private String marca;
    private static int contadorDsipositivosEntrada;

    private DispositivoEntrada(){
        idDispotivoEntrada = ++contadorDsipositivosEntrada;
    }

    public DispositivoEntrada(String tipoEntrada, String marca){
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return " DispositivoEntrada{" +
                "idDispotivoEntrada=" + idDispotivoEntrada +
                ", tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
