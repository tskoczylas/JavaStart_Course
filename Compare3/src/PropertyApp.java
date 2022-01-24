import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class PropertyApp {
    public static void main(String[] args) throws FileNotFoundException {
        Property property=new Property();

        String name = "1.txt";
        String line=";";
        Property[] propertys=new Property[property.lines(name)];

        File file=new File(name);
        try (Scanner scanner=new Scanner(file);){

            {
                for (int i = 0; i <property.lines(name); i++) {
                    String dataBase = scanner.nextLine();

                    String data[] = dataBase.split(line);
                    //String first = data[0];
                    //String se = data[1];
                    //String th = data[2];
                    //double secound = Double.parseDouble(se);
                    //double third = Double.parseDouble(th);
                    //propertys[i] = property;
                    //property = new Property(first, third, secound);

                }





            }

        } catch (FileNotFoundException e) {
            System.out.println("Błąd odczytu");
        }
        sortProperty(propertys);
        for (Property property1 : propertys) {
            System.out.println(property1);

        }

    }

    private static void sortProperty(Property[] propertys) {
        Arrays.sort(propertys, new Comparator<Property>() {
            @Override
            public int compare(Property o1, Property o2) {
                return Double.compare(o1.getPriceForSqm(),o2.getPriceForSqm());
            }
        });
    }
}
