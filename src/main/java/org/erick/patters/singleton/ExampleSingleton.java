package org.erick.patters.singleton;

public class ExampleSingleton {
    public static void main(String[] args) {

        ConnectionDBSingleton conn = null;

        for (int i = 0; i < 10; i++) {
            conn = ConnectionDBSingleton.getInstance();
            System.out.println("coon = "+conn);
        }

        ConnectionDBSingleton conn2 = ConnectionDBSingleton.getInstance();
        ConnectionDBSingleton conn3 = ConnectionDBSingleton.getInstance();

        boolean b1 = ((conn == conn2) && (conn2 == conn3) &&(conn == conn3));
        System.out.println("b1 = " + b1);
    }
}
