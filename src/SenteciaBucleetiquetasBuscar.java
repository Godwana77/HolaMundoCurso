public class SenteciaBucleetiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo Tres tristes tigres comen trigo en un trigal";
        int count = frase.length();
        int cantidad = 0;
        for (int i = 0; i < count; i++) {

            if (frase.charAt(i) != 't') {
                continue;

            }
            cantidad++;
        }

        System.out.println("cantidad = " + cantidad);

        // Recorrer String y buscar una palabra
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        cantidad = 0;
        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {// ojo con le K++ de esta linea busca el caracter u aumenta la variable
                    continue buscar;//si la letra era distinta vuelve al bucle i
                }
            }
            cantidad++;
        }
        System.out.println("palabra se encotró = " + cantidad);
    }
}
