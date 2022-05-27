public class Caja {
        int ancho;
        int alto;
        int profundo;

        Caja(){

        }

        Caja(int ancho, int alto, int profundo){
            this.ancho = ancho;
            this.alto = alto;
            this.profundo = profundo;
        }

        /*
         * calcula el volumen de la caja
         * volumen = ancho * alto * profundo
         */
        public int calcularVolumen(){
            return ancho * alto * profundo;
        }
}
