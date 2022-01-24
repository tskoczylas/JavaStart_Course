public class Main {
    public static void main(String[] args) {
        int input[] = {5 ,1 ,4, 2, 8};


        Sortable sortable = new Sortable() {
            @Override
            public void sort(int[] tab) {
                for (int j = 0; j < tab.length; j++) {
                    for (int i = 0; i < tab.length - 1; i++) {
                        if (tab[i] > tab[i + 1]) {
                            int temp = tab[i];
                            int temp2 = tab[i + 1];
                            tab[i + 1] = temp;
                            tab[i] = temp2;
                        }
                    }
                }

            }


        };
        //printArray(input);
        sortable.sort(input);
        printArray(input);


    }
    static void printArray(int[] tab)
    { for (int i : tab) {
        System.out.println(i);

    }
    }

}
