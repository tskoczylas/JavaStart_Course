public class MAin {
    public static void main(String[] args) {
        int[] s1 = {1, 2, 1, 2};
        int[] s2={1, 2, 3, 4, 5, 3, 5, 6}; //f
        int[] s3={ 1, 2, 5, 3, 5}; //true
        int[] s4={1, 2, 3, 4, 3, 6}; //truu

       // boolean b = almostIncreasingSequence(s2);
        boolean b2 = almostIncreasingSequence(s2);

       // System.out.println(b);
        System.out.println(b2);
        // Integer.compare(sequence[i+1],sequence[i])

    }

    static boolean almostIncreasingSequence(int[] sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i + 1] > sequence[i]) /*||sequence[i]==sequence[sequence.length-1])*/ {
                count++;
            }
        }
        System.out.println(count);

        if (count <= sequence.length - 2)
            return false;
        return true;
    }
}