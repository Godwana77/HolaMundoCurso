public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo="alguna.imagen.js";
        int i=archivo.indexOf(".")+1;//Lo queremos desde despues del punto '.'
        System.out.println("archivo = " + archivo.length());
        System.out.println("archivo.substring(13) = " + archivo.substring(13));

        System.out.println("archivo.substring dinámico: " +archivo.substring(i) );//Si tuviera algun punto entremedias fallaria
        int u=archivo.lastIndexOf(".")+1;
        System.out.println("LastIndexof = " +archivo.substring(u));
        System.out.println("LastIndexof = " +archivo.substring(archivo.lastIndexOf(".")+1));

    }
}
