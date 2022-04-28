/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author channyeintun
 */
public class StateDemo {

    public static void main(String[] args) {
        Player player = new Player();
        String output = "";
        output = player.getState().onPlay();
        System.out.println(output);
//        output = player.getState().onPlay();
//        System.out.println(output);
        output = player.getState().onNext();
        System.out.println(output);
        output = player.getState().onPrevious();
        System.out.println(output);
        output = player.getState().onLock();
        System.out.println(output);
        output = player.getState().onNext();
        System.out.println(output);

    }
}
