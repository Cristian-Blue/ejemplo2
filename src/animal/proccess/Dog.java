package animal.proccess;

import animal.interfaces.Walker;

public class Dog extends Animal implements  Walker  {
    public Dog(String name, String specie) {
        super(name, specie);
    }
    
    
    @Override
    public void walk() {
        System.out.println("Walk");
    }
    
}
