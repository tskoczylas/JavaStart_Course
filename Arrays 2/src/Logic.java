import javafx.scene.chart.Chart;

import java.util.Arrays;

public class Logic {


    public boolean cheakEquals(String input1, String input2)
    {
        String a = input1.toLowerCase();
        String b = input2.toLowerCase();
        char[] charts = a.toCharArray();
        char[] charts2=b.toCharArray();
        Arrays.sort(charts);
        Arrays.sort(charts2);
       boolean equal= Arrays.equals(charts,charts2);
       return equal;
    }

    void addAnswer(boolean equals){
        if (equals){
            System.out.println("Napisy składa się z takich samych liter"); }
        else System.out.println("Napisy są różne");
    }



}
