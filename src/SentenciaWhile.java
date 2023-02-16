public class SentenciaWhile {
    public static void main(String[] args) {
        
        int i=0;
        
        while(i<=5){
            System.out.println("i = " + i);
            i++;
        }
        i=0;
        boolean prueba=true;

        while (prueba) {
            if (i==7){
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // prueba es false
        do {
            System.out.println("Esto se ejecuta al menos una vez");
        }while (prueba);//prueba es false y sale del bucle

        prueba=true;
        i=0;
        do {
            if (i==10){
                prueba=false;
            }
            System.out.println("Esto se ejecuta al menos una vez");
        i++;
        }while (prueba);//prueba es false y sale del bucle

    }
}
