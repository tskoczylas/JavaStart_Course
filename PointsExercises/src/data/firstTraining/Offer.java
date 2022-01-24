package data.firstTraining;

public class Offer
{
    Product product;
    double price;
    boolean special;

    Offer(double sprice,boolean sspecial)
    {
        price=sprice;
        special=sspecial;
    }
    void printItOut ()
    {
        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);

    }
}
