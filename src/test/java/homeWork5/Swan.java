package homeWork5;

import homeWork5.interfaces_birds.CanEat;
import homeWork5.interfaces_birds.CanSwim;

public class Swan extends Birds implements CanEat, CanSwim {
    public Swan(String name, String type) {
        super(name, type);
    }

    @Override
    public void fly() {

    }

    @Override
    public void iAm() {

    }

    @Override
    public String toString() {
        return "Swan{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void canEat() {

    }

    @Override
    public void canSwim() {

    }
}
