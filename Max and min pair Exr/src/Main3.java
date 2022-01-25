import javafx.scene.chart.Chart;
import org.w3c.dom.ls.LSOutput;

public class Main3 {
    public static void main(String[] args) {

StringBuilder stringBuilder = new StringBuilder();
 String hello="Hello";

        for (int i = 0; i <hello.length() ; i++) {
            char c = hello.charAt(hello.length()-i-1);
           stringBuilder.append(c);

        }
        System.out.println(stringBuilder);
    }

}
