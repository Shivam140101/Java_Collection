package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class testLoadProp {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("store.properties");
            System.out.println("\nFile is read");
            Properties prop = new Properties();
            prop.load(fis);
            String drivername = (String) prop.get("dname");
            System.out.println("Driver name "+drivername);
            String yoo = (String) prop.get("dname1");
            System.out.println("Dname1 "+yoo);
            String a1 = (String) prop.get("111");
            System.out.println("Data "+a1);
            System.out.println("Data "+prop.getProperty("222"));
            System.out.println("Data "+prop.getProperty("333"));
            System.out.println("Data "+prop.getProperty("77777"));
            System.out.println("Data "+prop.getProperty("444"));
            System.out.println("Data "+prop.getProperty("555"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
