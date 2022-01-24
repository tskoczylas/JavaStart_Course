public class Rectangle implements Shape {

    double a;
    double b;


    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimiter() {
        return 2 * b + 2 * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt");
        sb.append("bok A: " + a + ", ");
        sb.append("bok B: " + b + ", ");
        sb.append("pole: " + area() + ", ");
        sb.append("obwód: " + perimiter());
        return sb.toString();
    }
}

