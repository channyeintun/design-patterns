/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author channyeintun
 */
public class HighCostObject implements Prototype {

    String log;

    public HighCostObject() {
        System.out.println("Instatiate using constructor");
        this.log = this.readIOLog();
    }

    private String readIOLog() {
        return "this log cost numerous IO matrix";
    }

    @Override
    public HighCostObject reproduce() {

        try {

            Prototype clonedObj = (Prototype) super.clone();
            HighCostObject newObject = (HighCostObject) clonedObj;

            return newObject;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
