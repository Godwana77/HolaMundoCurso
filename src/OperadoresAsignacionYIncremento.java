public class OperadoresAsignacionYIncremento {
    public static void main(String[] args) {

        int i =5 ; //operador de asignación '='
        int j=i+4;

        //Operadores combinados o compuestos
        i= i + 2;// forma larga
        i += 2;//forma resumida PRIMERO SUMA

        String sqlString="Select * from clientes as c";
        sqlString +=" where c.nombre='Andres'";
        sqlString +="and c.activo = 1";
        System.out.println("sqlString = " + sqlString);

        i=10;
        //Operadores incrementales
        System.out.println("i += " + (i));
        System.out.println("j = " + j);
        System.out.println("i++ = " + (i++));//primero visualiza y luego incrementa
        System.out.println("++i = " + (++i)); //primero incrementa y luego suma
        System.out.println("i-- = " + (i--));//primero visualiza y luego decrementa
        System.out.println("--i = " + (--i)); //primero decrementa y luego suma
// En caso de asignar a variables seria igual
        System.out.println("j = " + j + " e i "+ i);
        j= --i; //primero decrenta y luego asigna Si i =10 j=9
        System.out.println("j = " + j + " e i "+ i);
        j =i--;//Primero asigna y luego decrementa J=9 e i=8
        System.out.println("j = " + j + " e i "+ i);


    }
}
