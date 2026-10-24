package animal.proccess;

import animal.interfaces.Flying;
import animal.interfaces.Swimmer;
import animal.interfaces.Walker;

public class Duck extends Animal implements Flying, Walker, Swimmer {

    public Duck(String name, String specie) {
        super(name, specie);
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
