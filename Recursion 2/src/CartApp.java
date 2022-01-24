public class CartApp {
    public static void main(String[] args) {

Product product=new Product();
Cart cart= new Cart();
    cart.addProduct(new Product("Tomasz",33));
    cart.addProduct(new Product("Tomasz",33));
    cart.addProduct(new Product("Tomasz",33));



        System.out.println(cart.products[0]);
        int a =cart.products[0].getPrice();
        System.out.println(cart.getCurrentProducts());


}}
