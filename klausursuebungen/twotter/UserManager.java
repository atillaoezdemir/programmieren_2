package de.thws.klausursuebungen.twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User> {
    
    public static void main(String[] args) {
    
        User ati = new User("ati", "123");
        User usmanAga = new User("usmanAga", "31");
        
        List<User> agalar = new ArrayList<>();
        
        agalar.add(ati);
        agalar.add(usmanAga);
        
        UserManager reis = new UserManager();
        reis.serialize(agalar);
        System.out.println(reis.deserialize());
    }

    @Override
    public void serialize(List<User> users) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/macbookpro/IdeaProjects/programmiren2/src/main/java/de/thws/klausurAufgaben/Twotter/abc.txt"))) {
            os.writeObject(users);
        } catch (IOException e) {
            throw new RuntimeException("Deserialization mistake: " + e.getMessage());
        }
    }

    @Override
    public List<User> deserialize() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("/Users/macbookpro/IdeaProjects/programmiren2/src/main/java/de/thws/klausurAufgaben/Twotter/abc.txt"))) {
            return (List<User>) is.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Deserialization mistake: " + e.getMessage());
        }
    }
}
