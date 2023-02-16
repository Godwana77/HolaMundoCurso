import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i=5,j=4;

        int suma =i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i+ j);// ojo esto no es correcto
        System.out.println("i + j = " + (i+ j));// PAra que primero sume hay que usar parentesis
        
        int resta = i - j;
        System.out.println("resta = " + resta);
      //  System.out.println("i - j = " + i- j);// Da error no se pueden restar String
        System.out.println("i - j = " + (i- j));// PAra que primero sume hay que usar parentesis

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);
        //  System.out.println("i * j = " + i * j);// Da error no se pueden restar String
        System.out.println("i * j = " + (i * j));// PAra que primero sume hay que usar parentesis

        int div = i / j;
        System.out.println("division = " + div);
        //  System.out.println("i / j = " + i / j);// Da error no se pueden restar String
        System.out.println("i / j = " + (i / j));// PAra que primero sume hay que usar parentesis

        float div2 = (float) i / j;// Cast de un numero y lo convierte a float
        System.out.println("division = " + div2);
        int resto=i % j;
        System.out.println("resto = " + resto);

        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
        if (numero % 2==0) {JOptionPane.showMessageDialog(null,numero + " es par");

        }else{JOptionPane.showMessageDialog(null,numero +" es impar");

        };


    }
}
