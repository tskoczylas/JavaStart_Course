package pl.javastart.logic;

import pl.javastart.model.Telephone;

public class Charger {

    public void addPower(Telephone telephone44) {
        telephone44.setChargeLevel(telephone44.getChargeLevel()+1);
    }
}