public class SentenciaFor {
    public static void main(String[] args) {
       //for(inicializacion de variable;evaluación de exprexión;paso incremento o decremento ) {Sentencias a ejecutar }
        
        for(int i=0;i<=5;i++)//del 0 al 5 incluido
        {
            System.out.println("i = " + i);
        }
        for(int i=0;i<5;i++)// del 0 al 4 el 5 no incluye
        {
            System.out.println("i = " + i);
        }
        int j=0;// Esta variable queda fuera de los limites del FOR
        for(;j<5;j++){//Se pueden eliminar cualquiera de las iniclalizadoares del for
            System.out.println("j = " + j);
        }
        System.out.println("j = " + j);

        int k=5;// Esta variable queda fuera de los limites del FOR
        for(;k>0;){//Se pueden eliminar cualquiera de las iniclalizadoares del for
            System.out.println("k = " + k);
            k--;//Tambien se puede sacar
        }

        for(int l=1,m=10; l < m ; l++,m--){// Con más de una variaable
            System.out.println("i - j " + l +" " + m);
        }
        for(int par=0;par<=10;par++){
            if(par % 2==0){
                continue;
            }
            System.out.println("impar = " + par);
        }
        for(int impar=0;impar<=10;impar++){
            if ((impar % 2!=0)){
                continue;// si el modulo es distinto de 0 continua con el FOR
            }
            System.out.println("par = " + impar);
        }
    }
}
