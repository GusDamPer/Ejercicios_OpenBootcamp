public class Main {
    public static void main(String[] args) {

        //1er ejercicio.
        int numeroIf = 1;

        if(numeroIf < 0){
            System.out.println("El número es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número es 0 (cero)");
        }

        //2do ejercicio.
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //3er ejercicio.
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 3;
        } while (numeroWhile < 3);

        //4to ejercicio.
        int numeroFor;

        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //5to ejercicio.
        var estacion = "invierno";

        switch (estacion) {
            case "verano":
                System.out.println("Verano");
                break;
            case "otoño":
                System.out.println("Otoño");
                break;
            case "invierno":
                System.out.println("Invierno");
                break;
            case "primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}