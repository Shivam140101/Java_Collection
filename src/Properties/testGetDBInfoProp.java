package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class testGetDBInfoProp {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new FileInputStream("dbinfo.properties").getFD());
            System.out.println("\nFile is Read..................");
            Properties prop1 = new Properties();
            prop1.load(fis);


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
