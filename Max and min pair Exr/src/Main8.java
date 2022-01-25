import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.util.*;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main8 {
    public static void main(String[] args) {

double x = 5;
       double[]  prices = {40, 40, 40, 40};

       String[] notes = {"10.0% higher than in-store",
               "10.0% lower than in-store",
               "10.0% higher than in-store",
               "10.0% lower than in-store"};
       isAdmissibleOverpayment(prices,notes,x);

    }

   static boolean isAdmissibleOverpayment(double[] prices, String[] notes, double x) {

       ArrayList<Double> afterNotePricesList = new ArrayList<>();
       for (int i = 0; i < notes.length; i++) {
           if(notes[i].contains("higher")){
               String[] split = notes[i].split("%");
               double percentage = Double.parseDouble(split[0]);
               double storePrice=(prices[i]*100)/(percentage+ 100);
               afterNotePricesList.add(prices[i]-storePrice); }
           if(notes[i].contains("lower")){
               String[] split = notes[i].split("%");
               double percentage = Double.parseDouble(split[0]);
               double storePrice=(prices[i]*100)/(100 -percentage);
               afterNotePricesList.add(prices[i]-storePrice); }
       }
       System.out.println(afterNotePricesList);
       double sum = afterNotePricesList.stream().mapToDouble(Double::doubleValue).sum();
       System.out.println(sum);
       return sum==x;
    }





}






