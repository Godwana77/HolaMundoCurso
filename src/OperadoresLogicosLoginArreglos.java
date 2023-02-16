import java.util.Scanner;

public class OperadoresLogicosLoginArreglos {
    public static void main(String[] args) {

        String usernames[] = new String[2];
        String passwords[] = new String[2];
        usernames[0]="Andres";
        usernames[1]="Juan";

        passwords[0]="1234";
        passwords[1]="1234";

        //ESto podria ser asi:
        /*
            String usernames[] = new String["Andres","Juan"];
        */
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingresar nombre:");

        String u = scaner.next();

        System.out.println("Ingresar password:");
        String p = scaner.next();

        boolean esAutenticado = false;
for (int i=0;i<usernames.length;i++) {
    if (u.equals(usernames[i]) && p.equals(passwords[i])) {
        esAutenticado = true;
        break;// si lo encontro salir En caso de muchos elementos seguiria buscando
    }
    //( Esto valdria tambien asi:
    esAutenticado = (u.equals(usernames[i]) && p.equals(passwords[i]) )? true : esAutenticado;//El segundo es para que no se pierda el valor porque si no lo perderia


}
    if (esAutenticado) {
        System.out.println("Bienvenido usuario");
    }else {
        System.out.println("Contraseña incorrecta");
    }
    //ESto se podria hace asi:

        String mensaje= esAutenticado ? "Bienvenido " .concat(u).concat("!") : "Error" ;
        System.out.println( mensaje);


    }

}
