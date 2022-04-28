/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author channyeintun
 */
public class MementoDemo {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");

        textEditor.hitUndo();
        System.out.println(textEditor.print());
    }
}
