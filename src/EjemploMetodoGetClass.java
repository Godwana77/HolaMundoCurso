import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto="Hola que tal?";
        Class strClass= texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);
        for (Method metodo: strClass.getMethods()){
            System.out.println(metodo.getName());
        }
        
        Integer num=34;
        Class intClass = num.getClass();
        System.out.println("intClass.getPackage() = " + intClass.getPackage());
        System.out.println("intClass.getPackage() = " + intClass.getSuperclass());
    }

}
