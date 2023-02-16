public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1=Integer.valueOf(1000);
        Integer num2=num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num1 == num2));//True Es el mismo objeto
        num2=1000;
        System.out.println("Son el mismo objeto? " + (num1 == num2));//False NO ES EL MISMO OBJETO
        //NO SE PUEDEN COMPARAR CLASES WRAPPER CON ==

        System.out.println("Son iguales ? " + (num1.equals(num2)));//True
        System.out.println("Son el mismo objeto? " + (num1.intValue() == num2.intValue()));//Asi si True
        num2=1001;
        boolean condicion= num1<num2;// con operadores si funciona hace un intvalue() interno
        System.out.println("condicion = " + condicion);

    }
}
