package de.thws.klausursuebungen.twotter;

import java.io.Serializable;

public class Message implements Serializable {
    
    private final String content;

    public Message(String content) {
        this.content = content;
    }
}
