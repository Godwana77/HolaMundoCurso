public class OperadorInstanceOf {

    public static void main(String[] args) {
        String texto = new String("Crear un objeto de la clase String ... que tal!");

        Integer num = 7;

        boolean b1= texto instanceof String;
        System.out.println("texto es String? = " + b1);
// No se puede validar si es Integer porque da error

       boolean b2 = texto instanceof  Object;

        System.out.println("text es Object? = " + b2);

    boolean b3= num instanceof Object;
        System.out.println("Es num un Object? = " + b3);

        boolean b4= num instanceof Number;
        System.out.println("Es num un Number? = " + b3);



    }
}
