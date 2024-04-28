package de.thws.klausursuebungen.twotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwotterSystem {
    
    HashMap<User, List<Message>> userMesgs;

    public TwotterSystem() {
        this.userMesgs = new HashMap<>();
    }

    public void addMessage(User u, String msg) {
        List<Message> temp = userMesgs.getOrDefault(u, new ArrayList<>());
        userMesgs.put(u, temp);
    }

    public List<Message> getAllMessages() {
        List<Message> allMessages = new ArrayList<>();

        for (List<Message> userMessages : userMesgs.values()) {
            allMessages.addAll(userMessages);
        }

        return allMessages;
    }

    public List<Message> getAllMessagesFromUser(User u) {
        return userMesgs.getOrDefault(u, null);
    }

    public List<Message> getAllMessagesFromDate(String date) {
        // Logik ?
        return new ArrayList<>();
    }
}
