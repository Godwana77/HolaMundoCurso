public class OperadorTernario {
    public static void main(String[] args) {

// variable = condición ? valor si es verdad : valor si es falso ;

        String variable = 7 == 7 ? "Si es verdad" : "Es falso";
        System.out.println("variable = " + variable);

        String variable2 = 7 == 3 ? "Si es verdad" : "Es falso";
        System.out.println("variable2 = " + variable2);
        String estado = "";
        double promedio =5.2;
        
        estado = promedio >= 5.49 ? "Aprobado" : "Suspenso";
        System.out.println("estado = " + estado);

        
    }
}
