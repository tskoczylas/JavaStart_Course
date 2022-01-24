import java.util.Arrays;

public class Logic {
    public static int countDigit (String input){
        int sun = 0;
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                sun++;
            }
        }
        return sun;
    }

    public static   int countLetters (String input){
        int sum = 0;
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                sum++;
            }
        }
        return sum;
}


    public static char findMax(String input) {
        char sum = 0;
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
       if (!Character.isLetter(chars[0]))
         sum=chars[countDigit(input)-1];

        return  sum ;

    }
}
