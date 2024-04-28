package de.thws.lektion19aa.uebung3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {
    
    public Optional<URL> back() {
        try {
            return Math.random() < 0.5 ? Optional.of(new URL("http://google.de")) : null;
        }
        catch(MalformedURLException e) {
            return null;
        }
    }
    
    public String retrieveSite(URL url) {
        return url.toString();
    }

    public static void main(String[] args) {
        System.out.println("Normal back");
        Browser browser = new Browser();

        browser.back().ifPresent(url -> {
            System.out.println("URL obtained: " + url);
            browser.retrieveSite(url);
            // You can use the 'url' variable inside these braces for further operations
        });
    }
}
