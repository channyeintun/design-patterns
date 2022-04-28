/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author channyeintun
 */
public class Observer implements Observable {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Notified to " + this.name + " " + message);
    }

}
