public class PrimitivasCaracteres {
    public static void main(String[] args) {
        char caracter='\u0065'; // Corresponde a la 'e' en juego de caracteres secuencia de escape Unicode
        System.out.println("caracter = " + caracter);
        char decimal =101;
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal==caracter) = " + (decimal==caracter));

        //caracteres especiales
        char espacio= ' ';
        char borrar='\b';// borrar

        System.out.println("decimal+ borrar = " + decimal + borrar);
        char tabular='\t';// borrar

        System.out.println("decimal+ tabular = " + decimal + tabular + decimal);
    }
}
