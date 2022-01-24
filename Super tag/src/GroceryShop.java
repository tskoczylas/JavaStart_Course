public class GroceryShop extends Galla {
    public GroceryShop(int weight, String aplleType, String howBigInside) {
        super(weight, aplleType, howBigInside);
    }

    public static void main(String[] args) {




        Aplle aplle = new Aplle(20, "RoyalGalla");
        aplle.getInfo();

        Galla galla = new Galla(20,"Reneta","Bardzo duże");
        galla.getInfo();
        aplle.getInfo();






    }
}
