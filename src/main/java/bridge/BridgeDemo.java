/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author channyeintun
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Color color = new Red();

        Shape shape = new Circle(color);

        shape.paint();

        color = new Blue();
        shape = new Rectangle(color);
        shape.paint();
    }
}
