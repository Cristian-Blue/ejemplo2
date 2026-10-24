package animal.proccess;
import animal.interfaces.Flying;
import animal.interfaces.Walker;

public class Pigeon extends Animal implements Flying, Walker  {
    
    public Pigeon(String name, String specie){
        super(name, specie);
    }
    
    @Override
    public void fly(){
        System.out.println("Fly");
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }
    

}
