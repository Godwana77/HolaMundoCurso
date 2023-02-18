import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prueba08CalculaEdad {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        Date fechaActual = new Date();


        Scanner s = new Scanner(System.in);

        System.out.print("Introduce la fecha de tu nacimiento: ");
        Date miCumple = new Date(s.next());
        int annoActual = Integer.parseInt(formato.format(fechaActual));
        int annoCumple = Integer.parseInt(formato.format(miCumple));
        System.out.println("Tu edad es " + (annoActual - annoCumple));
    }
}