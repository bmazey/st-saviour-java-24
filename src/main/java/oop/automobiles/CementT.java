package oop.automobiles;

public final class CementT extends Truck {
   
    public CementT(String license) {
        this.setLicense(license);
    }
    public void getCargo(String license) {
        CementT cement = new CementT(license);
        this.getCargo().add(license);

    }




}
