public class Triangle implements Shape {


    double  a;
   double  h;
    double  b;
   double  c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double h, double b, double c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return (1/2)*a*h;
    }

    @Override
    public double perimiter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Trojkąt");
        sb.append("bok A: " + a + ", ");
        sb.append("bok B: " + b + ", ");
        sb.append("bok C: " + c + ", ");
        sb.append("pole: " + area() + ", ");
        sb.append("obwód: " + perimiter());
        return sb.toString();
    }
}


