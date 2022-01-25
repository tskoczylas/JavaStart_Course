public class Main11 {
    public static void main(String[] args) {
        int[] arr2={3, 5, 16, 8};


        int[] arr={795, 743, 144, 829, 390, 682, 340, 541, 569, 826, 232, 261, 42, 360, 117, 23, 761, 81, 309, 190, 425, 996, 367, 677, 234, 690, 626, 524, 57, 614, 168, 205, 358, 312, 386, 100, 346, 726, 994, 916, 552, 578, 529, 946, 290, 647, 970, 51, 80, 631, 593, 857, 627, 312, 886, 214, 355, 512, 90, 412, 479, 610, 969, 189, 274, 355, 641, 620, 433, 987, 888, 338, 566, 770, 284, 856, 417, 606, 260, 849, 237, 205, 59, 217, 518, 945, 783, 873, 458, 873, 637, 289, 483};


int result = 0;

for (int i = 0; i < arr.length; i++) {

            result+= arr[i];


        }

        System.out.println(result);
boolean isIt=false;
        for (int i = 0; i < arr.length; i++) {
            isIt=(arr[i]==result-arr[i]);
            System.out.println(isIt);
        }
        System.out.println(isIt);




    }
}
