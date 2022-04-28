/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author channyeintun
 */
public class PowerSupplier implements Component {

    Mediator mediator;

    public PowerSupplier() {
    }

    public void turnOn() {
        // implementation
        System.out.println("PowerSupplier was turned on.");
    }

    public void turnOff() {
        // implementation
        System.out.println("PowerSupplier was turned off.");
    }

    @Override
    public String getName() {
        return "PowerSupplier";
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
