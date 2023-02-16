public class ConversionDeTipos {
    public static void main(String[] args) {
String numeroStr="50";
int numeroInt=Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        String realStr="54545";
        double realDouble= Double.parseDouble(numeroStr);
        System.out.println("realDouble = " + realDouble);

        int otroNumero=45;
        System.out.println("Integer.toString( otroNumero) = " +Integer.toString( otroNumero));
        System.out.println("otroNumero valueOf = " +String.valueOf(otroNumero));
//El resultado es el mismo pero si le pones una operacion te lo calcula
        System.out.println("otroNumero valueOf = " +String.valueOf(otroNumero+10));

        //Conversiones entre primitivas

        int i=100000;
        short s=(short)i;//Ojo puede haber perdida de datos
        System.out.println("s = " + s);
        long l=i;
        System.out.println("l = " + l);
    }
}
