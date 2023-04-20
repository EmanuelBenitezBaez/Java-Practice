public class primitives {

    public static void main(String[] args) {
        byte number=127;
        System.out.println("Byte:"+number);
        System.out.println("Cuantos bytes tiene un byte." + Byte.BYTES);
        System.out.println("Cuantos bites tiene un byte." + Byte.SIZE);
        System.out.println("Maximo valor del tipo de dato byte:" + Byte.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato byte:" + Byte.MIN_VALUE);

        short numShort=3000;
        System.out.println("Short:"+numShort);
        System.out.println("Cuantos bytes tiene un short." + Short.BYTES);
        System.out.println("Cuantos bites tiene un short." + Short.SIZE);
        System.out.println("Maximo valor del tipo de dato short:" + Short.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato short:" + Short.MIN_VALUE);

        int numInteger=123456789;
        System.out.println("Int:"+numInteger);
        System.out.println("Cuantos bytes tiene un integer." + Integer.BYTES);
        System.out.println("Cuantos bites tiene un integer." + Integer.SIZE);
        System.out.println("Maximo valor del tipo de dato integer:" + Integer.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato integer:" + Integer.MIN_VALUE);

        float numFloat= 20.268465312f;
        System.out.println("Float:"+numFloat);
        System.out.println("Cuantos bytes tiene un float." + Float.BYTES);
        System.out.println("Cuantos bites tiene un float." + Float.SIZE);
        System.out.println("Maximo valor del tipo de dato float:" + Float.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato float:" + Float.MIN_VALUE);

        long numLong= 2026846531284651351L;
        System.out.println("Long:"+numLong);
        System.out.println("Cuantos bytes tiene un long." + Long.BYTES);
        System.out.println("Cuantos bites tiene un long." + Long.SIZE);
        System.out.println("Maximo valor del tipo de dato long:" + Long.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato long:" + Long.MIN_VALUE);
    }
}
