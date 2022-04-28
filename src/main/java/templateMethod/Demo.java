/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templateMethod;

import java.io.IOException;

/**
 *
 * @author channyeintun
 */
/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        Network network = null;

        String userName = "John";
        String password = "pass";

        // Enter the message.
        String message = "a message here";

        
//        Choose social network for posting message.
//        1 - Facebook
//        2 - Twitter
        int choice = 2;

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
