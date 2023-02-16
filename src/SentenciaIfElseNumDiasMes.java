public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        // if (expresion){ codigo a ejecutar}else{ Si no ejecuta esto}
        // if (expresion){ codigo a ejecutar}elseif ( expresion) { Ejecuta esto} etc...
        int mes = 2;
        int numeroDias=0;
        int anno=2023;

        if ( mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
            numeroDias=31;
        }else if ( mes==4 || mes==6 || mes==9|| mes==11) {
            numeroDias=30;
        }else if (mes==2 && (anno%4==0 || anno % 400==0 && !(anno % 100==0))){
            numeroDias=29;}else {
            numeroDias=28;
        }
        System.out.println("El mes tiene: " + numeroDias);
    }
}