package pl.javastart.model;

import pl.javastart.logic.Charger;

public class Telephone {
      String brand;
     String model;
     int batteryCapacity;
     int chargeLevel;

      public Telephone(String brand, String model, int batteryCapacity, int chargeLevel) {
           this.brand = brand;
          this.model = model;
         this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
     }
//setery
     public void setBrand(String brand) { this.brand = brand; }
     public void setModel(String model) {this.model=model;}
     public void setBatteryCapacity(int batteryCapacity){this.batteryCapacity=batteryCapacity;}
     public void setChargeLevel(int chargeLevel){this.chargeLevel=chargeLevel;}

 //getter

     public String getBrand() { return brand; }
     public String getModel() { return model;}
     public int getBatteryCapacity() { return batteryCapacity;}
     public int getChargeLevel() {return chargeLevel;}

      String printInfo()
     {
         return( getBrand()
                 + " " + getModel()
                 + ", bateria: " + getBatteryCapacity() +"mAh"
                 + ", poziom naładowania: " + getChargeLevel() + "%");

     }


     public String getPrintInfo(){return printInfo();}




     }


