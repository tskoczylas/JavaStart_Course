import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class draw {


    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(9999);

        logic log=new logic();
        System.out.println(x);
        log.sprawdzCzy(x);
        log.czyParzyste(x);
        log.ma4Cyfry(x);



    }
}
