package oop.automobiles;

import java.util.ArrayList;
import java.util.List;

/*
 * A class which defines all Trucks.
 */
public class Truck extends Manual {

    // An array list that stores cargo
    private List<String> cargo = new ArrayList<String>();

    // Constructor method for Truck
    public Truck(String license, int wheels) {
      // Use setter method to set the value of the properties from the Car class
      this.setLicense(license);
      this.setWheels(wheels);
    }

    // Getter method for the cargo list
    public List<String> getCargo() {
      return this.cargo;
    }

    // A method that adds items to cargo list (loads cargo into the truck)
    public void loadCargo(String item) {
      this.cargo.add(item);
    }

    // A method that searches for an item in the cargo list
    public boolean searchCargo(String item) {
      return this.cargo.contains(item);
    }
}
