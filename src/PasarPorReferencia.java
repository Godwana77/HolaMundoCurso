public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad={10,23,45};//una variable primitiva solo se puede para por valor no por referencia
        System.out.println("Iniciamos main");
        System.out.println("Antes de invocar test");
        for (int i=0;i<edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }


        test(edad);
        System.out.println("Despues de invocar test");
        for (int i=0 ;i<edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }



    }
//Se pasa el valor por valor
    public static void test ( int[] edad) {
      edad[1]=1;
    }

    
}
