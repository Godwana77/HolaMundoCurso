import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);//imprime fecha y hora actual Sat Feb 11 12:37:08 CET 2023

        //Costumizar formato fecha y hora
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");//da formato a la fecha 11-febrero-2023 11-febrero-2023
        String fechadf = df.format(fecha);
        System.out.println("fechadf = " + fechadf);

        df = new SimpleDateFormat("' la hora actual es 'hh:mm");// para poner un String adicional usar ' ' dentro del String " " la hora actual es 12:37
        fechadf = df.format(fecha);
        System.out.println("fechadf = " + fechadf);

        df = new SimpleDateFormat(" EEEE dd' del 'MM' y la hora es 'hh:mm");// para poner un String adicional usar ' ' dentro del String " " = sábado 11 del 02 y la hora es 12:37
        fechadf = df.format(fecha);
        System.out.println("fechadf = " + fechadf);
    }

}
