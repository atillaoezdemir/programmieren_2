package de.thws.klausursuebungen;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SS2022 {
    
    // a) Methode zum Speichern eines Byte-Arrays in einer Datei
    private static void saveByteArrayToFile(byte[] byteArray, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode zum Herunterladen eines Byte-Arrays von einer URL
    private static byte[] getByteArrayFromUrl(String urlString) {
        try (InputStream inputStream = new URL(urlString).openStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            while ((bytesRead = inputStream.read(buffer)) != -1)
                byteArrayOutputStream.write(buffer, 0, bytesRead);

            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Hilfsmethode zum Generieren eines Dateinamens aus einer URL
    private static String generateFileNameFromUrl(String url) {
        String[] parts = url.split("/");
        return parts[parts.length - 1];
    }

    // c) Hauptmethode zum Herunterladen aller Dateien in einem eigenen Thread
    public static void main(String[] args) {
    /*    List<String> downloadURLs = GetDownloadURLs.getUrls(); // Annahme: GetDownloadURLs gibt eine Liste von URLs zurück

        for (String url : downloadURLs) {
            String fileName = generateFileNameFromUrl(url);
            DownloadThread downloadThread = new DownloadThread(url, fileName);
            downloadThread.start();
        }
    } */
    }

    // b) Klasse DownloadThread
    static class DownloadThread extends Thread {
        private final String url;
        private final String fileName;

        public DownloadThread(String url, String fileName) {
            this.url = url;
            this.fileName = fileName;
        }

        @Override
        public void run() {
            byte[] byteArray = getByteArrayFromUrl(url);
            saveByteArrayToFile(byteArray, fileName);
            System.out.println("Downloaded: " + fileName);
        }
    }
}

