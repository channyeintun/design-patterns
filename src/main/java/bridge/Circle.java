/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author channyeintun
 */
public class Circle extends Shape{
    Circle(Color color){
        super(color);
    }

    @Override
    void paint() {
        this.color.paintCircle();
    }
}
