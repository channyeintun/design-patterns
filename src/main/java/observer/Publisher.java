/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 *
 * @author channyeintun
 */
public interface Publisher {
    
    void subscribeObserver(Observer observer);
    void publish(Observer observer,String message);
    void publishAll(String message);
}
