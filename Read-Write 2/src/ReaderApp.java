import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderApp {
    public static void main(String[] args) throws IOException {


        String name = "1.csv";
        String line = "";
        String coma = ",";
        File file=new File(name);
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 499; i++) {
            String csvLine = scanner.nextLine();
            String[] data = csvLine.split(",");
            int id=Integer.parseInt(data[0]);
            String firstname=data[1];
            String secoundName=data[2];
            String country=data[3];
            double ammount=Double.parseDouble(data[4]);
            ShopData shopData[]=new ShopData[499];
            shopData[i]=new  ShopData(firstname,secoundName,country,ammount,id);


            System.out.println(shopData[i].getAmmount());

           double ammount1= shopData[0].getAmmount();
          if(shopData[i].getAmmount()<ammount1)
              ammount1=shopData[i].getAmmount();
           System.out.println(ammount1);




        };
        ShopData shopData=new ShopData();
        System.out.println(shopData.getName());



    }

    }
