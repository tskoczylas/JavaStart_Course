import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main10 {
    public static void main(String[] args) {

        String time = "09:56";
        char charfirst=time.charAt(0);
        int first = Character.getNumericValue(charfirst);
        char charsecound=time.charAt(1);
        int secund = Character.getNumericValue(charsecound);
        char chthird=time.charAt(3);
        int third = Character.getNumericValue(chthird);
        char cgfourth=time.charAt(4);
        int fourth = Character.getNumericValue(cgfourth);
 boolean result = true;
        if(first>2) {result=false;}
        if(first==2&&secund>=4){ result =false;}
        if(first==2&&secund==4) {result=false;}
        if(third>5) {result = false;}
        if(fourth>5) {result = false;}

        System.out.println(result);








}}
