/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author channyeintun
 */
class Connection {

    private static Connection instance;

    private Connection() {
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
            System.out.println("Instantiated");
        }
        return instance;
    }

    public void connect(String url) {
        System.out.println("Connected to " + url);
    }
    public void close(){
        instance=null;
        System.out.println("Closed connection");
    }
}

public class SingletonDemo {

    public static void main(String[] args) {
        //    Connection connection=new Connection(); //error
        Connection connection = Connection.getInstance();
        connection.connect("google.com");
        connection=Connection.getInstance();
        connection.close();
    }
}
