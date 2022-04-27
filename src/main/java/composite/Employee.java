/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.*;

/**
 *
 * @author channyeintun
 */
public class Employee {

    String name;
    float salary;
    List<Employee> subordinates;
    boolean isLeaf;
    Employee parent = null;

    public Employee(String _name, float _salary) {
        name = _name;
        salary = _salary;
        subordinates = new ArrayList();
        isLeaf = false;
    }

    public Employee(Employee _parent, String _name, float _salary) {
        name = _name;
        salary = _salary;
        parent = _parent;
        subordinates = new ArrayList();
        isLeaf = false;
    }

    public void setLeaf(boolean b) {
        isLeaf = b;    //if true, do not allow children
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public boolean add(Employee e) {
        if (!isLeaf) {
            subordinates.add(e);
        }
        return isLeaf;    //false if unsuccessful
    }

    public boolean add(Employee... employees) {
        if (!isLeaf) {
            subordinates.addAll(Arrays.asList(employees));
        }
        return isLeaf;    //false if unsuccessful
    }

    public void remove(Employee e) {
        if (!isLeaf) {
            subordinates.remove(e);
        }
    }

    public Employee getChild(String s) {
        if (this.isLeaf) {
            return null;
        }
        Employee newEmp = null;
        if (getName().equals(s)) {
            return this;
        } else {
            boolean found = false;
            for (Employee e : this.subordinates) {
                found = e.getName().equals(s);
                if (!found) {
                    newEmp = e.getChild(s);
                    found = (newEmp != null);
                } else {
                    newEmp = e;
                    break;
                }
            }
            return found ? newEmp : null;
        }
    }

    public float getSalaries() {
        float sum = salary;
        int size = this.subordinates.size();
        for (int i = 0; i < size; i++) {
            sum += subordinates.get(i).getSalaries();
        }
        return sum;
    }
}
