public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros={1,2,3,45,5,6,7,8,9,9,99,7,6,};
        int suma=0;

        for (Integer i :enteros){
            if (i.intValue()%2 ==0){//aqui se esta usando el unboxing
                suma += i.intValue();//Aqui no se usa el boxing Podria se con i.intValue();
            }
        }
        System.out.println("suma de numeros pares = " + suma);
    }
}
