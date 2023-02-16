import java.util.Scanner;

public class Prueba05NumeroMenor {
    public static void main(String[] args) {
        int[] numeros = new int[10];//Creo arreglo con 10 muneros enteros
        Scanner s = new Scanner(System.in);//Creo objeto Scanner
        String texto;
        for (int n = 0; n < 10; n++) {
            //Solicita los 10 numeros por consola
            System.out.println("Por favor ingresar el numero " + (n+1));
            numeros[n] = s.nextInt();
        }
        //recorrer el arreglo para ver cual es el menor
        int numerotemp = numeros[0];//asigno el primer numero a la variable temporal
        for (int n : numeros) {

            numerotemp = n < numerotemp ? n : numerotemp;

        }
        //Sacar por consola el resultado
        System.out.println("El número menor es= "+ numerotemp);
        texto = numerotemp <= 10 ? "El número menor es menor que 10!" : "el numero menor es igual o mayor que 10!";
        System.out.println( texto);
    }
}

