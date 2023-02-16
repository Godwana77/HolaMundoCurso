public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {
        // etiquetar
        bucle1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println();

                if (i == 2) {
                    continue;// El continue sique en el bucle j
                }
                System.out.print("i = " + i+ " J = " +j + " ");
            }
        }
        System.out.println();
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {


                if (i == 2) {
                    break bucle2;// Salta al bucle i y se olvida del resto del j
                }
                System.out.print(" i = " + i+ " J = " +j + " ");
            }
        }

    }
}
