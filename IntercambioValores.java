public class IntercambioValores {
    public static void main(String[] args) {

        /*
        Realizar un programa que permita el intercambio de valores entre dos variables.
        Por ejemplo: Si una variable numero vale 35, y la variable numero2 vale 20, realizar
        las acciones necesarias para que numero pase a valer 20 y numero2 35. Una vez realizado el
        cambio, mostrar el resultrado en pantalla.
         */

        int numero1 = 35;
        int numero2 = 20;
        int numeroAux;

        System.out.println("Numero 1 antes:" + numero1);
        System.out.println("Numero 2 antes:" + numero2);

        numeroAux = numero2;// Guardamos en la variable auxiliar el valor de numero2.
        numero2 = numero1;//numero2 quedo vacio, le asignamos el valor de numero1. valiendo ahora 35.
        numero1 = numeroAux;// el aux valia 20 y se lo asignamos el val numero 1. quedando en 20.

        System.out.println("Numero 1 despues:" + numero1);
        System.out.println("Numero 2 despues:" + numero2);

        //creo que el truco de este ejercicio esta en ir moviendo los valores entre las variables
        //con ayuda de la variable auxiliar.

    }
}
