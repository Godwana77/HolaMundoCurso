public class OperdoresLogicos {
    public static void main(String[] args) {
        int i=3;
        byte j=3;
        float k=127e-7f;
        double l=2.1413e3;
        boolean m=false;
        
        boolean b1= i==j && k < l && m==false;// primero compara el && ii==j =true k<l True && m=false es true
        System.out.println("b1 = " + b1);
        
        boolean b2= i==j || k<l ; // al menos uno es true

        System.out.println("b2 = " + b2);

        boolean b3= i==j && k<l || m==true;// true primero ejecuta el && que es true y luego el || que al menos uno es true
        System.out.println("b3 = " + b3);

        boolean b4= (i==j ||  k<l) && m==true ;// false primero ejecuta el parentesis que es false y luego el && que al menos uno es false
        System.out.println("b4 = " + b4);

        boolean b5= true || false && false || false; // Es true
        System.out.println("b5 = " + b5);


    }
}
