public class Cart extends Product {
    static int MAXPRODUCTS= 10;
    Product products[]=new Product[MAXPRODUCTS];
   int currentProducts=0;
   Product product=new Product();

    public void  addProduct(Product product)
    {
        if(currentProducts<MAXPRODUCTS)
        products[currentProducts]=product;
        currentProducts++;


    }
    int ammount (){
        while (currentProducts)

    public int getCurrentProducts() {
        return currentProducts;
    }
}
