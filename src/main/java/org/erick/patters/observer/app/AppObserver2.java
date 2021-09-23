package org.erick.patters.observer.app;

import org.erick.patters.observer.UserRepository;

public class AppObserver2 {
    public static void main(String[] args) {

        UserRepository repository = new UserRepository();
        repository.addObserver((o,u)-> System.out.println("Sending an email to the user "+u));
        repository.addObserver((o,u)-> System.out.println("Sending an email to the administrator "));
        repository.addObserver((o,u)-> System.out.println("Saving user information" + u + " in the logs"));
        repository.createUser("Erick");

    }
}
