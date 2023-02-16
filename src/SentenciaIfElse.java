public class SentenciaIfElse {
    public static void main(String[] args) {

        // if (expresion){ codigo a ejecutar}else{ Si no ejecuta esto}
        // if (expresion){ codigo a ejecutar}elseif ( expresion) { Ejecuta esto} etc...

        float promedio = 2.8f;

        if (promedio >= 6.5f) {
            System.out.println("Excelente promedio");

        } else if (promedio < 3) {
            System.out.println("Suspenso");

        } else if (promedio > 3 || promedio<=6.5f) {
            System.out.println("Necesitas esforzarte más");
        }
    }
}