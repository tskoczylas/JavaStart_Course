public class Min5 {
    public static void main(String[] args) {
     //   long xlong = Long.valueOf(x);

        int input = 444333234;


        long reversed = 0;
   while(input!=0){
            reversed=reversed*100 + input%10;
            input /= 10;
           if (reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE){
                reversed=0;
            }

        System.out.println(reversed);

}}}