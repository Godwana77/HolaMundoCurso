public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toChairArray = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();//crear arreglo con los caracteres del String

        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);//print sin ln

        }
        ;
        System.out.println();

        for (char c : arreglo) {
            System.out.println("arreglo[i] = " + c);// bucle for enhanced bucle for de los elemento arreglo. devuelve variable 'c'

        }
        ;
        System.out.println("trabalenguas.split = " + trabalenguas.split("a"));//corta la cadena en trozos en la letra indicada
        String[] arreglo2 = trabalenguas.split("a");
        for (String c : arreglo2) {
            System.out.println("c = " + c);
        }
        ;
        String archivo = "algunaimagen.js";
        String[] arvhivoArr = archivo.split("\\.");//crea array con los elementod split-ados

        for (String c : arvhivoArr) {

            System.out.println("c = " + c);
            System.out.println(" nombre = " + arvhivoArr[0]);
        };
        System.out.println(" nombre = " + arvhivoArr[0]);
        System.out.println(" Extension = " + arvhivoArr[1]);
    }
}
    
        