import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[]nombre1=new String[6];
        String[] nombre2={"Pepe","Juan","Luis","Paco","Pepa"};
       final int  count=nombre2.length;// esto es mas optimo porque sino en el for se calcula cada vez.
     //el final lo convierte en constante
        for(int i=0;i<count;i++){
            if (nombre2[i].toLowerCase().equalsIgnoreCase("LuIs".toLowerCase())//Si es Luis continua...
                    //contains () Si contiene
            ) {
              continue;
            }
            System.out.println("nombres = " + nombre2[i]);
        }

     String buscar=   JOptionPane.showInputDialog(("Ingrrese ub nombre, por ejemplo \"Pepe\" o \"Paco\"  :"));
        System.out.println("buscar = " + buscar);
        boolean entontrado=false;

        for(int i=0;i<count;i++){
            if (nombre2[i].equalsIgnoreCase(buscar)){
                entontrado=true;
                break;
            }
        }
        if (entontrado=true){
    JOptionPane.showMessageDialog(null,buscar.concat(" fue encontrado"));
        }else{ JOptionPane.showMessageDialog(null,buscar.concat(" no existe"));}
    }
}
