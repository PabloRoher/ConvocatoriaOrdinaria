package Ejercicio3;

public class Requirement implements IPOComponent{

    private String description;

    public Requirement(String description) {
        this.description = description;
    }

    @Override
    public void add(IPOComponent component) {

    }

    @Override
    public void remove(IPOComponent component) {

    }

    @Override
    public IPOComponent getChild(int index) {
        return null;
    }

    @Override
    public void process() {

    }
}
