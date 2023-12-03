package oop;

/**
 * A class which defines all Animals.
 */
public abstract class Animal {

    // All animals have names.
    private String name;

    // 'getter' method for name property.
    public String getName() {
        return this.name;
    }

    // 'setter' method for name property.
    public void setName(String name) {
        this.name = name;
    }

    // All animals can eat food.
    public String eat(String food) {
        String text  = this.name + " eats " + food + "! Om nom nom ...";
        return text;
    }
}
