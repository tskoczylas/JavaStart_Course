public class App {
    public static void main(String[] args) {

        Unit unit = new Unit(new Coordinates(2,3),30,20);
        unit.setFuel(10);
        unit.tankUp();
        System.out.println(unit.getFuel());

    }
}
