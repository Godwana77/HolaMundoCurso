public class SentenciaForEach {
    public static void main(String[] args) {
        
        int[] numeros= {1,3,5,7,9,11,13,14};
        // ESto es un FO EACH
        for (int num : numeros){
            System.out.println("num = " + num);
        }


        //Recorrer arreglo String con For Each
        String [] nombres={"Pepe","Juan","Luis","Paco","Pepa"};

        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
        
    }
}
