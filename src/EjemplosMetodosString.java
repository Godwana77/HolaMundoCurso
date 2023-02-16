public class EjemplosMetodosString {
    public static void main(String[] args) {

        String nombre="Mariano";
        System.out.println("nombre.length() = " + nombre.length());//Longitud Los String em piezan en 0

        System.out.println("nombre.mayúsculas = " + nombre.toUpperCase()); //Todo mayúsculas

        System.out.println("nombre.minuscules = " + nombre.toLowerCase()); //Todo minuscules

        System.out.println("nombre.equals = \"Mariano\" " + nombre.equals("Mariano")); // Comparación por valor Obserbar \" que sirve para poder poner comillas dobles en un texto.

        System.out.println("nombre.equals = \"mariano\" " + nombre.equals("mariano")); // Comparación por valor Obserbar \" que sirve para poder poner comillas dobles en un texto.

        System.out.println("nombre.equalsIgnoreCase = \"mariano\" " + nombre.equalsIgnoreCase("mariano")); // Comparación por valor sin tener en cuenta mayusculas o minusculas

        System.out.println("nombre.compareTo = \"mariano\" " + nombre.compareTo("mariano")); // Compara caracter por caracter

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));//Devuelve el character de esa position
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));//Ultimo caracter Observar que es -1 el primer indice es '0'

        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));//SubString de la cadena

        String trabalenguas ="trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\"A\") = " + trabalenguas.replace("a","A"));

        System.out.println("trabalenguas.indexOf(\"l\") = " + trabalenguas.indexOf("l")); //ojo contando desde '0'

        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf('a'));//Se puede poner comillas simples 'a'

        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //Aqui no

        System.out.println("trabalenguas.contains('lenguas') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));//Comienza con
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));//finaliza con
        String trabalenguasTrim ="trabalenguas";
        System.out.println("trabalenguasTrim.trim() = " + trabalenguasTrim.trim());
        System.out.println("    trabalenguas =   ".trim());

    }
}
