public class PrecedenciaOperdoresJava {
    public static void main(String[] args) {
        
        int i=14,j = 6,k=20;
        
        double promedio= i+j+k/3;//ESto no es correcto
        System.out.println("promedio i+j+k/3= " + promedio);

        promedio= (i+j+k)/3;//Uso de parentesis
        System.out.println("promedio i+j+k)/3= " + promedio);

        promedio= (i+j+k)/3d;// Se pone que el 3 sea decimal para que lo convierta a double
        System.out.println("promedio i+j+k)/3= " + promedio);

        promedio= (++i+j--+k)/3d;// Se pone que el 3 sea decimal para que lo convierta a double
        System.out.println("promedio i+j+k)/3= " + promedio);
    }
}
