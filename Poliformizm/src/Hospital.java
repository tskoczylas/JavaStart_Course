public class Hospital {
    final static int MaxWORKERS = 5;
    Person[] tab = new Person[MaxWORKERS];
    int workersNumbers = 0;
    String result;


    void addPerson(Person person) {
        if (MaxWORKERS > workersNumbers) {
            tab[workersNumbers] = person;
            workersNumbers++;
        } }
    //String getInfo() {
    //    String result = "";
    //    for (int i = 0; i < workersNumbers; i++) {
    //       result = result + tab[i].getInfo()+ "\n";
      //  }
     //   return result;
   // }
    String getInfo()
    {
        for (int i = 0; i < workersNumbers; i++) {
            result =result + tab[i].getInfo() + " \n";}
        return result;
    }


    }