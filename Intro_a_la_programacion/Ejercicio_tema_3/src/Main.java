public class Main {
    public static void main(String[] args) {
        // Punto 1
        suma(2,4,6);

        // Punto 2
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma (int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }

    static class Coche {
        public int puertas = 0;

        public void AgregarPuerta() {
            this.puertas++;
        }
    }

}