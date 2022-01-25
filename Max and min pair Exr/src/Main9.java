import javafx.scene.chart.Chart;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main9 {
    public static void main(String[] args) {
       String  inputStrinwg= "00-1B-63-84-45-E6";
        String  inputString= "Z1-1B-63-84-45-E6";

       if(inputString.contains("-")&&inputString.length()==17&&inputString.matches("[a]"));
        {
            String[] macTwoDigitSplit = inputString.split("-");

            for (int i = 0; i < macTwoDigitSplit.length; i++) {
                System.out.println(macTwoDigitSplit[i]);
            }


            String text="abc";
            boolean matches = text.matches("[^abc]");
            System.out.println(matches);

        }



    }}