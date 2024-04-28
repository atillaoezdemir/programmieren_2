package de.thws.klausursuebungen.twotter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    
    static List<User> users = new ArrayList<>();
    private final String benutzername;
    private final String passwort;

    public User(String benutzername, String passwort) {
        if (!isUserInList(benutzername)) {
            this.benutzername = benutzername;
            this.passwort = passwort;
            users.add(this);
        } else
            throw new RuntimeException("Dieser Benutzername ist schon benutzt!");
    }

    private boolean isUserInList(String username) {
        for (User user : users) {
            if (user.benutzername.equals(username))
                return true;
        }
        return false;
    }
}
