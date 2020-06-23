package be.intecbrussel.eatables;

public class IceRocket implements Eatable{


    public IceRocket() {

    }


    @Override
    public void eat() {
        System.out.println("Client eats an IceRocket");
    }

    @Override
    public String toString() {
        return "IceRocket";
    }
}
