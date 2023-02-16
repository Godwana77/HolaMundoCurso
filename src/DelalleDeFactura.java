import java.util.InputMismatchException;
import java.util.Scanner;

public class DelalleDeFactura {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        String descripcionFactura="";
        float producto1=0f, producto2=0f;
        System.out.println("Ingresar descripción de la factura:");
        descripcionFactura=Scanner.nextLine();
        System.out.println("Ingresar importe primer producto:");
        try{
    producto1=Scanner.nextFloat();}
        catch(InputMismatchException e){
            System.out.println("Se requiere numero");
            main(args);
            System.exit(0);
        }
        System.out.println("Ingresar importe segundo producto:");
        try{
        producto2=Scanner.nextFloat();}
         catch(InputMismatchException e){
            System.out.println("Se requiere numero");
            main(args);
            System.exit(0);
        }
       float total=(producto1+producto2);
     Float  impuesto= (float) ((producto1+producto2)*0.19);
        System.out.println("La factura producto de oficina tiene un total bruto de "+total +", con un impuesto de " +impuesto+" y el monto después de impuesto es de " +(total+impuesto));
    }
}
