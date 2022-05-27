public class Circulo extends FiguraGeometrica {
    private int idCirculo;
    private double radio;
    static final double pi = 3.1416;
    private static int contadorFiguras;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.idCirculo = ++contadorFiguras;
        this.radio = radio;
    }

    public int getIdCirculo() {
        return idCirculo;
    }

    public void setIdCirculo(int idCirculo) {
        this.idCirculo = idCirculo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro(){
        return 2 * pi * radio;
    }

    public double calcularArea(){
        return pi * radio * radio;
    }

    @Override
    public String toString() {
        return super.toString() + " Circulo{" +
                "idCirculo=" + idCirculo +
                ", radio=" + radio +
                '}';
    }
}
