package Ejercicio3;

import java.util.List;

public class IPOComposite implements IPOComponent{
    private List<IPOComponent> components;

    public IPOComposite(List<IPOComponent> components) {
        this.components = components;
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
