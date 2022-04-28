/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author channyeintun
 */
public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Remote();
        Button button = new Button();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        button.setMediator(mediator);
        fan.setMediator(mediator);
        powerSupplier.setMediator(mediator);

        mediator.registerComponent(button);
        mediator.registerComponent(fan);
        mediator.registerComponent(powerSupplier);
        
        mediator.start();
    }
}
