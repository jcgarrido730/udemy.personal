package co.com.apluser1.mundopc;

public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha alcanzado el maximo de computadoras permitidas: " + MAX_COMPUTADORAS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i=0; i<contadorComputadoras; i++){
            total += computadoras[i].getMonitor().getPrecio();
            total += computadoras[i].getTeclado().getPrecio();
            total += computadoras[i].getRaton().getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + idOrden);
        System.out.println("Total de la orden $" + calcularTotal());
        System.out.println("Productos en la orden:");
        for(int i=0; i<contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
}
