package pl.javastart.model;

import pl.javastart.application.*;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.brand
                + " " + telephone.model
                + ", bateria: " + telephone.batteryCapacity +"mAh"
                + ", poziom naładowania: " + telephone.chargeLevel + "%");
    }
}
