package mundopc;
import co.com.apluser1.mundopc.*;

public class MundoPC {
    public static void main(String[] args){
        Monitor monitor1 = new Monitor("hp", 17);
        monitor1.setPrecio(150);
        Teclado teclado1 = new Teclado("usb", "hp");
        teclado1.setPrecio(50);
        Raton raton1 = new Raton("usb", "hp");
        raton1.setPrecio(15);
        Computadora computadora1 = new Computadora("Hewlett Packard", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("monitor toshiba", 15.5);
        monitor2.setPrecio(134.9);
        Teclado teclado2 = new Teclado("usb", "teclado toshiba");
        teclado2.setPrecio(30.5);
        Raton raton2 = new Raton("usb", "raton toshiba");
        raton2.setPrecio(11.5);
        Computadora computadora2 = new Computadora("Toshiba", monitor2, teclado2, raton2);

        Monitor monitor3 = new Monitor("monitor w", 19);
        monitor3.setPrecio(155);
        Teclado teclado3 = new Teclado("usb", "teclado hg");
        teclado3.setPrecio(14.5);
        Raton raton3 = new Raton("usb", "raton r");
        raton3.setPrecio(10);
        Computadora computadora3 = new Computadora("Gato", monitor3, teclado3, raton3);

        Computadora computadora4 = new Computadora("Gato2", monitor3, teclado3, raton3);

        Computadora computadora5 = new Computadora("Clon", monitor3, teclado1, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadora3);
        orden3.mostrarOrden();

        Orden orden4 = new Orden();
        orden4.agregarComputadora(computadora4);
        orden4.mostrarOrden();

        Orden orden5 = new Orden();
        orden5.agregarComputadora(computadora5);
        orden5.mostrarOrden();
    }
}
