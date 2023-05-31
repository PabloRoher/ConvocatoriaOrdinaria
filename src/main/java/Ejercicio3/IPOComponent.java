package Ejercicio3;

public interface IPOComponent {
    void add(IPOComponent component);
    void remove(IPOComponent component);
    IPOComponent getChild(int index);
    void process();
}
