public class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia){
        this.estrategia = estrategia;
    }

    public float ejecutarEstrategia(float num1, float num2){
        return estrategia.calcular(num1, num2);
    }
}
