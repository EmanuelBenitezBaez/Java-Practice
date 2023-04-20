public class condicionalIf {
    public static void main(String[] args) {
        int numero1 = 35;
        int numero2 = 35;

        if (numero1 > numero2) {

            System.out.println(" El numero 1 es mayor: " + numero1);
        } else {

            if (numero1 < numero2) {
                System.out.println("El numero 2 es mayor: " + numero2);
            }else {
                System.out.println("Ambos numeros son iguales.");
            }
        }

    }
}
