
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaDateParse {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy");//Crear el patron
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese fecha con formato dd-mm-yyy");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                System.out.println("fecha es despues de fecha actual ");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha es anterior de fecha actual ");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual que fecha actual ");
            }

            if (fecha.compareTo(fecha2)>0) {
                System.out.println("fecha es despues de fecha actual ");
            } else if (fecha.compareTo(fecha2)<0) {
                System.out.println("fecha es anterior de fecha actual ");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
