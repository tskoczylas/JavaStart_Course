import java.util.*;

public class Logic {

  ArrayList<Integer> generate(int randomBound) {
        ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i <= randomBound; i++) {

         list.add(i);
      }
      return list;

  }

    ArrayList<Integer> randomize( ArrayList<Integer> list) {
       Collections.shuffle(list);
       return list;
    }
    int checkResult(ArrayList<Integer> randomnumbers, ArrayList<Integer> usernumbers){
      ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> ite = randomnumbers.iterator();
        int fre=0;
        for (int i = 0; i <usernumbers.size() ; i++) {
            int lot= ite.next();
            list.add(lot);
        fre = Collections.frequency(usernumbers,lot) + fre;}

        return fre;
    }

}
