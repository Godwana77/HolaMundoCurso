public class OperadorInstanceOfTiposAbstracto {

    public static void main(String[] args) {
        Object texto = new String("Crear un objeto de la clase String ... que tal!");

        Object num = 7;

        boolean b1= texto instanceof String;
        System.out.println("texto es String? = " + b1);
// Ahora texto es un Object y si permite ver si es un tipo Number

       boolean b2 = texto instanceof  Object;

        System.out.println("text es Object? = " + b2);

    boolean b3= num instanceof Object;
        System.out.println("Es num un Object? = " + b3);

        boolean b4= num instanceof Number;
        System.out.println("Es num un Number? = " + b3);

        boolean b6= num instanceof Integer;
        System.out.println("Es num un Integer? = " + b6);

        boolean b5= texto instanceof Number;
        System.out.println("texto es Number? = " + b5);
// Ahora texto es un Object y si permite ver si es un tipo Number

        Number num2=Integer.valueOf(7);//Forma correcta de dar valor
        boolean b7= num2 instanceof Number;
        System.out.println("num2 es Number? = " + b7);

        boolean b8= num2 instanceof Integer;
        System.out.println("num2 es Integer? = " + b8);

    }
}
