package org.erick.patters.observer.app;

import org.erick.patters.observer.Corporation;

public class AppObserver {
    public static void main(String[] args) {

        Corporation google = new Corporation("Google", 1000);

        google.addObserver((observable, obj) -> {
            System.out.println("Erick: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Fiorella: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Juan: " + observable);
        });
        google.modifyPrice(2000);
    }
}
