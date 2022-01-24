public class Aplle extends Fruit {

    private String aplleType;

    public Aplle(int weight, String aplleType) {
        super(weight);
        this.aplleType = aplleType;
    }

    void getInfo()
    {
        System.out.println(Fruit.fruitType+getWeight()+aplleType);
    }




}
