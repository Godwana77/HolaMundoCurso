public class SEntenciaSwichCaseNombreMes {
    public static void main(String[] args) {
    int mes=6;
    String nombreMes=null;

//Solo funciona con:  'char, byte, short, int, Character, Byte, Short, Integer, String, o enum'
// Es obligatorio el break.

        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes="abril";
                break;
            case 5:
                nombreMes="mayo";
                break;
            case 6:
                nombreMes="junio";
                break;
            case 7:
                nombreMes="julio";
                break;
            case 8:
                nombreMes="agosto";
                break;
            case 9:
                nombreMes="septiembre";
                break;
            case 10:
                nombreMes="octubre";
                break;
            case 11:
                nombreMes="noviembre";
                break;
            case 12:
                nombreMes="diciembre";
                break;
            default:
                nombreMes="Error";
                break;
        }
        System.out.println("Mes= " + nombreMes);
    }
}
