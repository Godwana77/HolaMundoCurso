import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
         String [] nombre=new String[3];
         String[] temp=new String[3];
         int lugar;
        Scanner scan =new Scanner(System.in);
// Entrada de datos (Si el nombre es menor de 2 caracteres dara error
        System.out.println("Ingrese el nombre de la primera persona:");
        nombre[0]=scan.nextLine();
        System.out.println("Ingrese el nombre de la segunda persona:");
        nombre[1]=scan.nextLine();
        System.out.println("Ingrese el nombre de la tercera persona:");
        nombre[2]=scan.nextLine();

        for(int i=0;i<3;i++){
            lugar=nombre[i].length();
            temp[i]=new String().concat(String.valueOf(nombre[i].charAt(1)).toUpperCase()).concat(".")+nombre[i].substring(lugar-2,lugar);
        }
 //Salida de datos
        System.out.println(temp[0]+"_"+temp[1]+"_"+temp[2]);
    }
}