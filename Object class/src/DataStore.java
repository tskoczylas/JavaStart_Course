import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.soap.SAAJMetaFactory;
import java.util.Arrays;
public class DataStore  extends Computer {
    private static int MAXCOMPUTERS = 100;
    private int currentComputers = 0;

    Computer computer = new Computer();
    Computer tab[] = new Computer[MAXCOMPUTERS];

    void addComputer(Computer computer) {
        if (MAXCOMPUTERS > currentComputers) {
            tab[currentComputers] = computer;
            currentComputers++;
        }
    }

    public void getInfo() {
        System.out.println("Kopmutery w bazie:" + "\n");
        for (int i = 0; i < currentComputers; i++) {
            System.out.println(tab[i].getModel() + "    " + tab[i].getProducer());
        }
    }

    private int sameComupters = 0;
   private int x = 0;

    int checkAvailability(Computer computer) {
        while (sameComupters < currentComputers) {
            boolean a = tab[sameComupters++].equals(tab[1]);
            if (a == true) {
                x = x + 1; } }
        return x;}

}