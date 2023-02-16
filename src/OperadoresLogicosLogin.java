import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Andres";
        String password = "1234";

        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingresar nombre:");

        String u = scaner.next();

        System.out.println("Ingresar password:");
        String p = scaner.next();

        boolean esAutenticado = false;

        if (u.equals(username) && p.equals(password)) {
esAutenticado=true;
        }

    if (esAutenticado) {
        System.out.println("Bienvenido usuario");
    }else {
        System.out.println("Contraseña incorrecta");
    }
    }

}
