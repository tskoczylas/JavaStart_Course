import java.util.Map;
import java.util.TreeMap;

public class Main5 {
    public static void main(String[] args) {
       /* StringBuilder stringBuilder=  new StringBuilder();
        if(num==1%num ){stringBuilder.append("I");}
        if(num==5 ){stringBuilder.append("V");}
        if(num==10 ){stringBuilder.append("X");}
        if(num==50 ){stringBuilder.append("L");}
        if(num==100 ){stringBuilder.append("C");}
        if(num==500 ){stringBuilder.append("D");}
        if(num==1000 ){stringBuilder.append("M");} */

/* I II III IV V VI VI VII VIII IX X XI XII XIII XIV XV XVI XVII XVIII IXX

1%11*/
TreeMap<Integer,String> romanMap=new TreeMap<>();

int num = 3;

romanMap.put(1,"I");
romanMap.put(5,"V");
romanMap.put(10,"X");
romanMap.put(50,"L");
romanMap.put(100,"C");
romanMap.put(500,"D");
 romanMap.put(1000,"M");
        StringBuilder stringBuilder = new StringBuilder();
        Number integer = romanMap.floorKey(num);
        for (int i = 0; i < num; i++) {
            String s = romanMap.get(integer);
            stringBuilder.append(s);

        }

        System.out.println(stringBuilder);
    }
    }
