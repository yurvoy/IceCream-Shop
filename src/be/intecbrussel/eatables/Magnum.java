package be.intecbrussel.eatables;


public class Magnum implements Eatable {


    private MagnumType type;


    public Magnum() {
        this.type = getType();
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }


    //Getter and setter
    public MagnumType getType() {
        return type;
    }

    public void setType(MagnumType type) {
        this.type = type;
    }


    @Override
    public void eat() {
        System.out.println("Client eats a " + toString());
    }

    @Override
    public String toString() {
        return "Magnum [" + getType() + "]";
    }


    public enum MagnumType {

        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;

    }
}
