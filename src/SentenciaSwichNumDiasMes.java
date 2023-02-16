import java.util.Scanner;

public class SentenciaSwichNumDiasMes {
    public static void main(String[] args) {

        /*swich (variable) {
            case valor:
            accion
            break;
            case valor,valor:
            accion:
            break:
            default:
            accion
            }
        */

        int mes = 2;
        int numeroDias=0;
       int anno=2023;
        Scanner s=new Scanner((System.in));
        System.out.println("Ingrese numero del año");
        anno=s.nextInt();
        System.out.println("Ingrese numero del mes");
        mes=s.nextInt();
        switch (mes){
            case 1,3,5,7,8,10,12:
                numeroDias=31;
                break;
            case 4,6,9,11:
                numeroDias=31;
                break;
            case 2:
                if (mes==2 && (anno%4==0 || anno % 400==0 && !(anno % 100==0))){
                    numeroDias=29;}else {
                    numeroDias=28;
                break;}

            default:
                break;
        }

        System.out.println("El mes tiene: " + numeroDias);
    }
}