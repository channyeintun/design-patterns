/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author channyeintun
 */
public class Subject implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void publish(Observer observer, String message) {
        int index = observers.indexOf(observer);
        observers.get(index).notify(message);
    }

    @Override
    public void publishAll(String message) {
        for (Observer observer : this.observers) {
            observer.notify(message);
        }
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

}
