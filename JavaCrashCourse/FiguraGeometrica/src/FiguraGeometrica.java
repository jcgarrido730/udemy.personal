/**
 * Representa una figura geometrica la cual es definida en tiempo de ejecucion
 * @author jgarrido
 */
public class FiguraGeometrica {
    private int idFigura;
    private String nombre;
    private double perimetro;
    private double area;
    private static int contadorFiguras;

    private FiguraGeometrica() {
        this.idFigura = ++contadorFiguras;
    }

    /**
     * Constructor sobrecargado de la figura geometrica
     * @param nombre Nombre de la figura geometrica
     */
    public FiguraGeometrica(String nombre) {
        this();
        this.nombre = nombre;
    }

    /**
     * Constructor sobrecargado de la figura geometrica
     * @param nombre Nombre de la figura geometrica
     * @param perimetro Perimetro de la figura geometrica
     * @param area Area de la figura geometrica
     */
    public FiguraGeometrica(String nombre, double perimetro, double area){
        this();
        this.nombre = nombre;
        this.perimetro = perimetro;
        this.area = area;
    }

    /**
     * Permite obtener el id de la figura geometrica que se acaba de crear
     * @return Retorna el id de la figura geometrica que se acaba de crear
     */
    public int getIdFigura(){
        return idFigura;
    }

    /**
     * Permite asignar un id a la figura geometrica que se esta creando
     * @param idFigura Id de la figura geometrica
     */
    public void setIdFigura(int idFigura) {
        this.idFigura = idFigura;
    }

    /**
     * Permite obtener el nombre de la figura geometrica
     * @return Retorna el nombre de la figura geometrica
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar un nombre a la figura geometrica que se esta creando
     * @param nombre Nombre de la figura geometrica
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el perimetro de la figura geometrica
     * @return Retorna el perimetro de la figura geometrica
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Permite asignar un perimetro a la figura geometrica que se esta creando
     * @param perimetro Perimetro de la figura geometrica
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * Permite obtener el area de la figura geometrica
     * @return Retorna el area de la figura geometrica
     */
    public double getArea() {
        return area;
    }

    /**
     * Permite asignar un area a la figura geometrica que se esta creando
     * @param area Area de la figura geometrica
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Sobreescribe el metodo toString()
     * @return Retorna objeto con sus valores
     */
    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "idFigura=" + idFigura +
                ", nombre='" + nombre + '\'' +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
