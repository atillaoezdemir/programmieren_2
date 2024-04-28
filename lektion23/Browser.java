package de.thws.lektion23aa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {
    
    public static void main(String[] args) {
        Browser browser = new Browser();
        Optional<URL> back = browser.back();

        // Use ifPresent to call retrieveSite if Optional is not empty
        back.ifPresent(url -> System.out.println(browser.retrieveSite(url)));
    }

    public Optional<URL> back() {
        try {
            return Math.random() < 0.5 ? Optional.of(new URL("http://google.de")) : Optional.empty();
        } catch (MalformedURLException e) {
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url) {
        return url.toString();
    }
}
