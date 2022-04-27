/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author channyeintun
 */
public abstract class Shape {
    Color color;
    public Shape(Color color){
        this.color=color;
    }
    abstract void paint();
}
