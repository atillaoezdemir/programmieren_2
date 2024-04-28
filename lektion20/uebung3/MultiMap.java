package de.thws.lektion20aa.uebung3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MultiMap {
    Map<String, List<String>> woerterbuch;
    public MultiMap() {
        woerterbuch = new HashMap<>();
    }
    public void put(String word, String bedeutung) {
        List<String> bedeutungen;
        if(woerterbuch.containsKey(word)) {
            bedeutungen = woerterbuch.get(word);
            bedeutungen.add(bedeutung);
        } else {
            bedeutungen = new ArrayList<>();
            bedeutungen.add(bedeutung);
        }
        woerterbuch.put(word, bedeutungen);
    }
    public void putAll(String word, List<String> bedeutungen) {
        if(woerterbuch.containsKey(word)) {
            List<String> bestehendeBedeutungen = woerterbuch.get(word);
            bestehendeBedeutungen.addAll(bedeutungen);
        } else {
            woerterbuch.put(word, bedeutungen);
        }
    }
    public List<String> get(String word) {
        return woerterbuch.get(word);
    }
    public static void main(String[] args) {
        MultiMap woerterbuch = new MultiMap();
        List<String> bedeutungen = new ArrayList<>();
        bedeutungen.add("reinigen");
        bedeutungen.add("temizlemek");
        woerterbuch.putAll("to clean", bedeutungen);

        List<String> cleanTranslations = woerterbuch.get("to clean");
        System.out.println("Translations of 'to clean': " + cleanTranslations);
    }
}
