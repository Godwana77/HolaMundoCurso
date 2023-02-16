import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba2OrdenarNumeros {
    public static void main(String[] args) {
        int a=0,b=0,resultado1=0, resultado2=0;//No uso variables auxiliares
        Scanner s=new Scanner(System.in);

        System.out.println("Por favor introducir primer numero:");
        try {
            a=s.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Se requiere numero entero!!");
            main(args);
            System.exit(0);}


        System.out.println("Por favor introducir segundo numero:");
            try {
        b=s.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Se requiere numero entero!!");
                main(args);
                System.exit(0);}

        resultado1= a>b ? a : b ; //Si a>b devuelve a, si no b (Opción con variables auxiliares)
       resultado2= a>b ? b : a ; //Si a>b devuelve a, si no b
        System.out.println("El orden de mayor a menor es: " + (a>b ? a : b) + ", " + (a>b ? b : a));

        //Concactenando
        //String resultado= "El orden de mayor a menor es: ".concat(String.valueOf(a>b ? a : b)).concat(", ").concat(String.valueOf(a>b ? b : a));
       // System.out.println( resultado);
    }
}

