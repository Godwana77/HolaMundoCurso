public class PasarPorValor {
    public static void main(String[] args) {

        int i=10;//una variable primitiva solo se puede para por valor no por referencia
        Integer j=10; //Objeto Integer
        test(i);
        test(j);
        System.out.println("VAlor de i del main= " + i);
        System.out.println("Valor de j en main = " + j);
    }
//Se pasa el valor por valor
    public static void test ( int i) {
        System.out.println("i en test = " + i);
        i=35;
    }
  //Se pasa el valor por referencia
  public static void test ( Integer j) {// Ojo crea una función con el mismo nombre pero con el objeto Integer (Sobrecarga)
      System.out.println("j en test = " + j);
      j=35;
  }
    
}
