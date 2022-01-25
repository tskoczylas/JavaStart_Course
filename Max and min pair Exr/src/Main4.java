import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main4
{
    public static void main(String[] args) {
        int x = -1563847412;
        long resultlong=0;

        if(x>0) {
            String hh = Integer.toString(x);

            StringBuilder ww = new StringBuilder();
            StringBuilder dd = ww.append(hh);
            StringBuilder tttt = dd.reverse();
            String www = tttt.toString();
             resultlong = Long.parseLong(www);
        }
        else {
            long newlong=Long.valueOf(x);
            long abs = Math.abs(newlong);

            String hh = Long.toString(abs);


            StringBuilder ww = new StringBuilder();
            StringBuilder dd = ww.append(hh);
            StringBuilder tttt = dd.reverse();
            String www = tttt.toString();
            resultlong = Long.parseLong(www);

        }


        int result = 0;
        if (Math.abs(Long.valueOf(x))
                >Integer.MAX_VALUE||(resultlong
                >Integer.MAX_VALUE)) {
        } else if (x > 0) {
            String c = Integer.toString(x);

            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder append = stringBuilder.append(c);
            StringBuilder reverse = append.reverse();
            String string = reverse.toString();
            result = Integer.parseInt(string);
        } else if (x < 0) {
            x = (x * -1);
            String c = Integer.toString(x);

            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder append = stringBuilder.append(c);
            StringBuilder reverse = append.reverse();
            String string = reverse.toString();
            result = Integer.parseInt(string);
            result = (result * -1);
        }
        System.out.println(result);
    }

}
