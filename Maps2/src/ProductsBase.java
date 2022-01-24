import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductsBase {

    HashMap<String, TreeSet<Products>> createMap(String name) throws FileNotFoundException {
        HashMap<String, TreeSet<Products>> productsmap=new HashMap<>();
        Scanner scanner= new Scanner(new File(name));
        while (scanner.hasNextLine()){
            String[] csv= scanner.nextLine().split(";");
            String category = csv[0];
            String names = csv[1];
            double price = Double.parseDouble(csv[2]);
            Products objectproducts = new Products(names,price);
            if (productsmap.containsKey(category)){
                productsmap.get(category).add(objectproducts);
            }
            else{
                TreeSet<Products> createProduts = new TreeSet<>();
                createProduts.add(objectproducts);
                productsmap.put(category,createProduts);

            }



        }
        return productsmap;

    }



}