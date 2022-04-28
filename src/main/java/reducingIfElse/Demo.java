package reducingIfElse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author channyeintun
 */
public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(1, 3, Operator.ADD);
        System.out.println("1 ADD 3 = " + result);
    }
}
