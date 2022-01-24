public class Circle implements Shape {

    double r;

    @Override
    public double area() {
        return 2 * Shape.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double perimiter() {
        return r * r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło");
        sb.append("Promień: " + r + ", ");
        sb.append("pole: " + area() + ", ");
        sb.append("obwód: " + perimiter());
        return sb.toString();
    }
}
