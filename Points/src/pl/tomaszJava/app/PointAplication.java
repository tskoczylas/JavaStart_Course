package pl.tomaszJava.app;

import org.omg.PortableServer.POA;
import pl.tomaszJava.data.Point;
import pl.tomaszJava.logic.PointController;

public class PointAplication
{
    public static void main(String[] args) {
        Point point = new Point(44,22);
        point.printIt();
        Point point2=new Point(33,311);
        point2.printIt();
        PointController pointController=new PointController();
        pointController.minusX(point);

        point2.printIt();
        point.printIt();





    }
}
