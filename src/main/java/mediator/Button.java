/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author channyeintun
 */
public class Button implements Component {

    Mediator mediator;

    public Button() {
    }

    public void press() {
        System.out.println("button pressed");
    }

    @Override
    public String getName() {
        return "Button";
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
