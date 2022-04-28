/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author channyeintun
 */
public class Fan implements Component {

    Mediator mediator;
    private boolean isOn = false;

    // constructor, getters and setters
    public Fan() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Fan was turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan was turned off.");
    }

    @Override
    public String getName() {
        return "Fan";
    }

}
