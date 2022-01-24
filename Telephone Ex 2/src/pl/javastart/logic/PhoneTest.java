package pl.javastart.logic;

import pl.javastart.model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        Telephone telephone2 = new Telephone("Xioami", "Mi 10", 4000, 24);

        Charger charger = new Charger();
        charger.addPower(telephone);
        charger.addPower(telephone);
        charger.addPower(telephone);
        charger.addPower(telephone);



        System.out.println(telephone.getPrintInfo());
        System.out.println(telephone2.getPrintInfo());
    }
}