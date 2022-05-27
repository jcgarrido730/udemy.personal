/**
 * UsaFiguraGeometrica es la clase que permite interactuar con las demás clases y obtener el perímetro y área de la figura
 * @author jgarrido
 */
public class UsaFiguraGeometrica {
    private static double perimetro;
    private static double area;

    /**
     * inicio del programa que calcula el perimetro y el área de una figura geometrica
     * @param args no lleva parámetros
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo1", 5);
        perimetro = circulo.calcularPerimetro();
        area = circulo.calcularArea();
        circulo.setPerimetro(perimetro);
        circulo.setArea(area);
        System.out.println("circulo:" + circulo);

        Triangulo triangulo = new Triangulo("triangulo1", 3.6, 2, 3, 2, 3.6);
        perimetro = triangulo.calcularPerimetro();
        area = triangulo.calcularArea();
        triangulo.setPerimetro(perimetro);
        triangulo.setArea(area);
        System.out.println("triangulo: " + triangulo);
    }
}
