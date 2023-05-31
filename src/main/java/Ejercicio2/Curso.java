package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Subject{

    private String name;
    private List<Observer> observers;

    public Curso(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(double grade) {
        for (Observer observer : observers) {
            observer.update(this, grade);
        }
    }

    public String getName() {
        return name;
    }

    public void concludeCourse(double grade) {
        notifyObservers(grade);
    }

}
