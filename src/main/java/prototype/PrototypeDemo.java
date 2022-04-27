/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author channyeintun
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        HighCostObject hco = new HighCostObject();
        System.out.println("high cost object " + hco);
        HighCostObject newHco = hco.reproduce();
        System.out.println("after clone "+newHco);
    }
}
