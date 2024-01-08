package oop.automobiles;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Manual {

      private List<String> Cargo = new ArrayList<String>();

      public Truck(String license, int wheels) {
        this.setLicense(license);
        this.setWheels(wheels);
      }

      public List<String> getCargo() {
        return this.Cargo;
      }

    public void loadCargo(String item) {
      this.Cargo.add(item);
    }

    public boolean searchCargo(String item) {
      return this.Cargo.contains(item);
    }
}
