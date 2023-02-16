import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    //Entrada por consola Scanner
    public static void main(String[] args) {
        System.out.println("Ingresar un numero:");
    Scanner Scanner=new Scanner(System.in);
int numero=0;


       try {
    numero=Scanner.nextInt();
}catch (InputMismatchException e){// ver que el tipo de error es distinto
    System.out.println( "Error");
    main(args);
    System.exit(0);// Si no lo pone al volver a ejecutar otra vez main eternamente
}
        System.out.println( numero);

        

    }
}
