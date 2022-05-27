package ventas;

import co.com.apluser1.ventas.*;

public class Ventas {
    public static void main(String[] args){
        Producto producto1 = new Producto("camisa", 50);
        Producto producto2 = new Producto("pantalon", 100);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Producto producto3 = new Producto("medias", 10);
        Producto producto4 = new Producto("camiseta", 20);
        Producto producto5 = new Producto("calzoncillos", 15);

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.mostrarOrden();
    }
}
