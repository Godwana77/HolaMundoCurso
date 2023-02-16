import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba06MultiplicarNumeros {
    public static void main(String[] args) {
        Integer numero1=1;
        int numero2=1;
        int total=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el primer numero a multiplicar");
        try {
            numero1 = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error debes introducir un numero");
            System.exit(0);
        }


        System.out.println("Introduce el segundo numero a multiplicar");
        try {
            numero2 = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error debes introducir un numero");
            System.exit(0);
        }
        for (int i = 0; i < Math.abs(numero1); i++) {
            total= (numero1>0) ? (total+=numero2) : (total -=numero2);
        }
        System.out.println("El resultado es: " + total);
    }
}
