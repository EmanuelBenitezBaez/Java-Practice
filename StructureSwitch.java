import java.util.Scanner;

public class StructureSwitch {
    public static void main(String[] args) {

/*
Una pequeña empresa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener
3 categorias : 1- repositor, 2-cajero, 3-supervisor.
-Los repositores cobran $15.890 + bono de 10%.
-Los cajeros cobran $25.630,89 fijos.
-Los supervisores cobran $35.560,20 en bruto al cual  se les descuenta
un 11% de jubilacion.
Se necesita un programa que, dependiendo del tipo de empleado, calcule y muestre en pantalla
el correspondiente sueldo.
*/

String categoria;
        float sueldo , auxiliar;
        float sueldoRepositor = 15.890f;//bono de 10%
        float sueldoCajero = 25630.89f;
        float sueldoSupervisor = 35560.20f;//descuento 11% jubilacion

        System.out.println("Ingrese la categoria a la que pertenece: ");
        Scanner puestos = new Scanner (System.in);
        categoria = puestos.next();


        switch (categoria) {
            case "Repositor":
                auxiliar = sueldoRepositor / 100;
                sueldo = sueldoRepositor + auxiliar;
                System.out.println("Su sueldo correspondiente es: " + sueldo);
                break;

            case "Cajero":
                System.out.println("Su sueldo correspondiente es: " + sueldoCajero);
                break;

            case "Supervisor":
                auxiliar = (float) (sueldoSupervisor * 0.11);
                sueldo = sueldoSupervisor - auxiliar;
                System.out.println("Su sueldo correspondiente es: " + sueldo);
                break;

            default:
                System.out.println("Puesto inválido");
                break;
        }


    }
}
