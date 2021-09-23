package org.erick.patters.singleton;

public class ConnectionDBSingleton {

    private static ConnectionDBSingleton instance;

    private ConnectionDBSingleton() {
        System.out.println("Connecting some database engine");
    }

    public static ConnectionDBSingleton getInstance() {

        if (instance == null) {
            instance = new ConnectionDBSingleton();
        }

        return instance;
    }
}
