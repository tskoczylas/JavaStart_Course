import java.sql.SQLOutput;

public class Table {

    public static void main(String[] args) {

        Logic[] logics= new Logic[3];
        logics[0]=new Logic(1);
        logics[1]=new Logic(2);
        logics[0]=new Logic(1);

        Logic[] logics1= new Logic[3];
        logics1[0]=new Logic(12);
        logics1[1]=new Logic(33);
        logics1[0]=new Logic(33);

        int indexNumber=1;

        System.out.println(logics[indexNumber].getCommonNumber());










    }
}
