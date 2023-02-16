import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal=500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal en binario = " + Integer.toBinaryString((numeroDecimal)));
int numeroBinario=0b11111000;//248d
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numeroDecimal en octal= " + Integer.toOctalString((numeroDecimal)));
        System.out.println("numeroDecimal en hex= " + Integer.toHexString((numeroDecimal)));
String entrada=JOptionPane.showInputDialog(null,"Ingrese numero entero");
        int entradaDatos=0;
try {
     entradaDatos = Integer.parseInt(entrada);
}catch (NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Error");
    main(args);
    System.exit(0);// Si no lo pone al volver a ejecutar otra vez main eternamente
}
    JOptionPane.showMessageDialog(null, entradaDatos);
//Entrada por consola Scanner


    }
}
