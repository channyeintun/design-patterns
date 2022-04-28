/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author channyeintun
 */
public interface Mediator {

    public void start();

    public void stop();
    
    public void registerComponent(Component component);
}
