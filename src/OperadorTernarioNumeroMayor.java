import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max=0;

       Scanner s= new Scanner(System.in);

        System.out.println("Ingrese numero");
        int numero1=s.nextInt();

        System.out.println("Ingrese numero");
        int numero2=s.nextInt();

        System.out.println("Ingrese numero");
        int numero3=s.nextInt();
        
        max = (numero1>numero2) ? numero1 : numero2;
        max = (max> numero3) ? max : numero3;

        System.out.println("max = " + max);
        

    }
}
