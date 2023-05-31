package Ejercicio3;

public class Document implements IPOComponent{

    private String name;

    public Document(String name) {
        this.name = name;
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
