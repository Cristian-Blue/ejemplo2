package animal.proccess;

import animal.interfaces.Swimmer;

public class Fish extends Animal implements Swimmer {
    public Fish(String name, String specie) {
        super(name, specie);
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
    
    
}
