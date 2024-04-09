package Properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class testStoreProp {

    public static void main(String[] args) {

        try {
             FileOutputStream fos = new FileOutputStream("store.properties");
            System.out.println("\nFile is created ");
            Properties prop  = new Properties();
            prop.put("111","aaa");
            prop.put("222","bbb");
            prop.put("333","ccc");
            prop.put("444","ddd");
            prop.put("555","eee");
            prop.store(fos,"store.properties");
            System.out.println("prop obj :- "+prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
