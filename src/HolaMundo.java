public class HolaMundo {
    public static void main(String[] args) {
        String nombre="Mariano";
        System.out.println("nombre = " + nombre);
       // System.out.println("Hello world!");
        int numero=10;
        Integer numero2=5;
        char caracter='\65';
        byte pequeno=127;// -128 a +127
        short corto=32767;//hasta -32768
        int entero=2147483647;//-2.147.483.648
        long largo= 121212121232323L; //mu grande
        boolean valor=true;
        float flotante=21212.1212f;
        double doble=2323232323e3;
if(valor){
    System.out.println("valor = " + valor);
   numero2++;
}
        System.out.println("numero2 = " + numero2);
        System.out.println("caracter = " + caracter);
        prueba();
    }
   public static void prueba(){
        System.out.println("Hello world!");
    }
}