import javax.swing.*;

public class Prueba4NombreMAsLargo {
    public static void main(String[] args) {

        String nombreYApellido[] = new String[3];//Arreglo de long 3
        String nombre[][] = new String[3][];// Areglo para guardar los nombres y apellidos separados
        String nombreMasLArgo = "";
        for (int n = 0; n < 3; n++) {
            nombreYApellido[n] = JOptionPane.showInputDialog(null, "Introduce nombre y apellido de la persona ".concat(String.valueOf(n + 1)));
            if ((nombreYApellido[n].length() < 1) || (nombreYApellido[n].indexOf(' ') == -1)) { // Probar que al menos hay un espacio en el texto introducido
                JOptionPane.showMessageDialog(null, "Introduce nombre y apellido por favor");
                n--;
            } else {
                nombre[n] = nombreYApellido[n].split(" ");//Separar el nombre y el apellido en arreglo
            }
        }
        //Ahora comparo los nombre para ver cual es mas largo
        for (int m = 0; m < 3; m++) {
            nombreMasLArgo = nombre[m][0].length() > nombreMasLArgo.length() ? nombre[m][0] : nombreMasLArgo;//Comparar variable temporal con el contenido del arreglo donde tengo los nombres
        }
        ;
        JOptionPane.showMessageDialog(null, "El nombre mas largo es ".concat(nombreMasLArgo));
        System.out.println("El nombre mas largo es " + nombreMasLArgo);
    }

}
