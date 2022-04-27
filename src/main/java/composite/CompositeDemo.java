/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author channyeintun
 */
public class CompositeDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("Mr.John", 3000000);
        Employee hr = new Employee("Lylia", 400000);
        hr.setLeaf(true);
        Employee reactDeveloper = new Employee("Foo", 800000);
        reactDeveloper.setLeaf(true);
        Employee javaDeveloper = new Employee("Bar", 1000000);
        javaDeveloper.setLeaf(true);
        Employee leadDeveloper = new Employee("Alex", 1200000);
        leadDeveloper.setLeaf(true);
        Employee projectManager = new Employee("Will", 1000000);
        projectManager.add(reactDeveloper, javaDeveloper, leadDeveloper);
        ceo.add(hr, projectManager);
        System.out.println("CEO salary:" + ceo.getSalary());
        System.out.println("CEO salaries:" + ceo.getSalaries());
        Employee search = ceo.getChild("Foo");
        if (search != null) {
            System.out.println("Search Foo salary:" + search.getSalary());
        }

    }
}
