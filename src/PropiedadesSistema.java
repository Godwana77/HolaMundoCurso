import java.util.Properties;

public class PropiedadesSistema {
    public static void main(String[] args) {
        
        String userName= System.getProperty("user.name");
        System.out.println("userName = " + userName);
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        String osVersion = System.getProperty("os.version");
        System.out.println("OS version = " + "" + osVersion);
        //hay muchas más en
        //https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        Properties p=System.getProperties();
        p.list(System.out);
    }
}
