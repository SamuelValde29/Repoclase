package Logicadepro;

public class alRevesYMayor {

    public static void main(String[] args) {

        int[] numeros = {
                Entrada.leerEntero("Número 1: "),
                Entrada.leerEntero("Número 2: "),
                Entrada.leerEntero("Número 3: "),
                Entrada.leerEntero("Número 4: "),
                Entrada.leerEntero("Número 5: ")
        };


        System.out.print("Al revés: ");
        mostrarAlReves(numeros);


        int mayor = buscarMayor(numeros);
        System.out.println("\n El mayor es: " + mayor);
    }

    public static void mostrarAlReves(int[] numeros) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }

    public static int buscarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}