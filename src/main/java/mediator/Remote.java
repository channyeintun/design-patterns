/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author channyeintun
 */
public class Remote implements Mediator {

    Button button;
    Fan fan;
    PowerSupplier powerSupplier;

    @Override
    public void start() {
        button.press();
        powerSupplier.turnOn();
        fan.turnOn();
    }

    @Override
    public void stop() {
        button.press();
        powerSupplier.turnOff();
        fan.turnOff();
    }

    @Override
    public void registerComponent(Component component) {
        switch (component.getName()) {
            case "Button" ->
                button = (Button) component;
            case "Fan" ->
                fan = (Fan) component;
            case "PowerSupplier" ->
                powerSupplier = (PowerSupplier) component;
        }
    }

}
