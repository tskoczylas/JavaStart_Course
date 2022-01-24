public class Galla extends Aplle {

    String howBigInside;

    public Galla(int weight, String aplleType, String howBigInside) {
        super(weight, aplleType);
        this.howBigInside=howBigInside;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        {
            System.out.println(howBigInside);

        }
    }
}
