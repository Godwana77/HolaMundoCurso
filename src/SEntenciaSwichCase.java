public class SEntenciaSwichCase {
    public static void main(String[] args) {
    int num=2;
//Solo funciona con:  'char, byte, short, int, Character, Byte, Short, Integer, String, o enum'

        switch (num) {
            case 1:
                System.out.println("num = 1");
                break;
            case 2:
                System.out.println("num = 2 ");
                break;
            default:
                System.out.println("numero no contemplado ");
        }
// Lo mismo version guay
        switch (num) {
            case 1 -> System.out.println("num = 1");
            case 2 -> System.out.println("num = 2 ");
            default -> System.out.println("numero no contemplado ");
        }
    }
}
