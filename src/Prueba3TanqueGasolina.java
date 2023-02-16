import java.util.Scanner;

public class Prueba3TanqueGasolina {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        double gasolina=0;
      /*  Double[] valores=new Double[7];   //Todo esto equvale a la linea de abajo
        valores[0]=100d;
        valores[1]=70d;
        valores[2]=60d;
        valores[3]=40D;
        valores[4]=35d;
        valores[5]=20d;
        valores[6]=0d;
*/
        Double[] valores= {100d,70d,60d,40d,35d,20d,0d};

        System.out.println("Introducir cantidad de gasolina:");
        gasolina=s.nextDouble();
        if (gasolina>100 || gasolina < 1) {
            System.out.println("El valor debe estar entre 1 y 100");
            main(args);
        }

        if (gasolina <= valores[0] && gasolina >= valores[1]){//entre 70 y 100
            System.out.println("Estanque lleno");
            System.exit(0);
        } else if (gasolina < valores[1] && gasolina >= valores[2]){// Entre 69 y 60
            System.out.println("Estanque casi lleno");
            System.exit(0);
        }else if (gasolina < valores[2] && gasolina >= valores[3]){// Entre 59 y 40
            System.out.println("Estanque 3/4");
            System.exit(0);
        }else if (gasolina < valores[3] && gasolina >= valores[4]){// Entre 39 y 35
            System.out.println("Estanque medio");
            System.exit(0);
        }else if (gasolina < valores[4] && gasolina >= valores[5]){// Entre 34 y 20
            System.out.println("Estanque suficiente");
            System.exit(0);
        }else if (gasolina < valores[5] && gasolina >= valores[6]){// Entre 20 y 1
            System.out.println("Estanque insuficiente");
            System.exit(0);
        }

    }
}
