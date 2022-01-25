import com.sun.source.tree.Tree;

import java.awt.datatransfer.StringSelection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main6 {
    public static void main(String[] args) {

        int num = 104;

        System.out.println(getRoman(num));
    }

    private static String  getRoman(int num) {
        String roman = "";
        if(1<=num&&num<=10) roman= getLetters1(num).toString();
        if(10<=num&&num<=100) {
            StringBuilder letters1 = getLetters1((num/1)%10);
            StringBuilder letters10 = getLetters10((num/10)%10);
            StringBuilder append = letters10.append(letters1);
            roman=append.toString();
        if (((num/10)%10)==0){roman=getLetters10(num/10).toString(); }}
        if(100<=num&&num<=1000){
            StringBuilder letters1 = getLetters1((num/1)%10);
            StringBuilder letters10 = getLetters10((num/10)%10);
            StringBuilder letters100 = getLetters100((num/100)%10);
            StringBuilder append = letters100.append(letters10).append(letters1);
            roman=append.toString();
           if (((num/100)%10)==0){roman=getLetters100((num/100)%10).toString();} }
        if(1000<=num&&num<=3999) {
            StringBuilder letters1 = getLetters1((num/1)%10);
            StringBuilder letters10 = getLetters10((num/10)%10);
            StringBuilder letters100 = getLetters100((num/100)%10);
            StringBuilder letters1000 = getLetters1000((num/1000)%10);

            StringBuilder append = letters1000.append(letters100).append(letters10).append(letters1);
            roman=append.toString();
            if (((num/1000)%10)==0){roman=getLetters100((num/100)%10).toString();} }
        return roman;
    }

    private static StringBuilder getLetters100(int num) {
        StringBuilder stringBuilder=  new StringBuilder();


            if (1 <= num && num <= 3) {
                for (int i = 0; i < num; i++)
                    stringBuilder.append("C");
            }
            if (num == 4) {
                stringBuilder.append("CD");
            }

            if (5 <= num && num <= 8) {
                stringBuilder.append("D");
                for (int i = 0; i < num - 5; i++)
                    stringBuilder.append("C");
            }
            if (num == 9) {
                stringBuilder.append("CM");
            }

            if (num == 10) {
                stringBuilder.append("M");
            }

        return stringBuilder;
    }

    private static StringBuilder getLetters10(int num) {
        StringBuilder stringBuilder=  new StringBuilder();


            if (1 <= num && num <= 3) {
                for (int i = 0; i < num; i++)
                    stringBuilder.append("X");
            }
            if (num == 4) {
                stringBuilder.append("XL");
            }

            if (5 <= num && num <= 8) {
                stringBuilder.append("L");
                for (int i = 0; i < num - 5; i++)
                    stringBuilder.append("X");
            }
            if (num == 9) {
                stringBuilder.append("XC");
            }

            if (num == 10) {
                stringBuilder.append("C");
            }

        return stringBuilder;
    }





    private static StringBuilder getLetters1(int num) {
        StringBuilder stringBuilder=  new StringBuilder();

        if (1 <= num && num <= 3) {
            for (int i = 0; i < num; i++)
                stringBuilder.append("I");
        }
        if (num == 4) {
            stringBuilder.append("IV");
        }

        if (5 <= num && num <= 8) {
            stringBuilder.append("V");
            for (int i = 0; i < num - 5; i++)
                stringBuilder.append("I");
        }
        if (num == 9) {
            stringBuilder.append("IX");
        }

        if (num == 10) {
            stringBuilder.append("X");

    }
        return stringBuilder;
    }

    private static StringBuilder getLetters1000(int num) {
        StringBuilder stringBuilder=  new StringBuilder();

        if (1 <= num && num <= 3) {
            for (int i = 0; i < num; i++)
                stringBuilder.append("M");
        }

        return stringBuilder;
    }



}


