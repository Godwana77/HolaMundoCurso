import java.util.Date;

public class ClaseDateMilisegundos {
    public static void main(String[] args) {

        long suma=0;
        Date fechas=new Date();
        long tiempoInicio=  fechas.getTime();
        for (int i=0;i<1000000000;i++) {//mil millones
            suma+=i;
        }
        System.out.println("suma = " + suma);
        Date fechas2=new Date();
      long tiempoFinal=  fechas2.getTime();
        System.out.println("tiempo despues for = " + (tiempoFinal-tiempoInicio + "milisegundos"));
    }
}
