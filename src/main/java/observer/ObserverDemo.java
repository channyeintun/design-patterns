/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author channyeintun
 */
public class ObserverDemo {
    public static void main(String []args){
        Observer observer1=new Observer("Obs1");
        Observer observer2=new Observer("Obs2");
        Observer observer3=new Observer("Obs3");
        
        Publisher subject=new Subject();
        
        subject.subscribeObserver(observer1);
        subject.subscribeObserver(observer2);
        subject.subscribeObserver(observer3);
        
        subject.publishAll("Msg for all");
        
        subject.publish(observer3, "Msg for obs 3");
    }
}
