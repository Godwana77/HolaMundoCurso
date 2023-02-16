
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {
        Calendar calendario=Calendar.getInstance(); //Es una clase abtracta NO permite usar new
       calendario.set(2020,Calendar.SEPTEMBER,22,12,1,12);//El mes empieza en 0 0 a 11 jajaja
        calendario.set(Calendar.MONTH,Calendar.JULY);//SET mes
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato= new SimpleDateFormat("dd-MM-YYYY hh:mm:ss:SSS");// ojo no he asigndo los milisengos por lo que no se quedan estaticos
        String fechaFormato =formato.format(fecha);
        System.out.println("fecha con formato = " + fechaFormato);
    }
}
