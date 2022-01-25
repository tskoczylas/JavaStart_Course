import java.util.TreeMap;

public class RomanNumber {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        System.out.println(l);
        if ( number == l ) {
            System.out.println(map.get(number));

            return map.get(number);
        }

        return map.get(l) + toRoman(number-l);
    }

    public static void main(String[] args) {
        System.out.println(toRoman(33));
    }

}