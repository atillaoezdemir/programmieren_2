package de.thws.lektion22aa.uebung3;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class server {
    
    public server() {
    }

    public void start() throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                Socket socket = serverSocket.accept();

                Worker workwork = new Worker(socket);
                workwork.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Worker extends Thread {
    
        private final Socket socket;
        
        Worker(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {

                String input = reader.readLine();

                List<Integer> numbers = new ArrayList<>();
                List<Boolean> primes = new ArrayList<>();

                for (String number : input.split(", ")) {
                    numbers.add(Integer.parseInt(number));
                    primes.add(isPrime(Integer.parseInt(number)));
                }

                writer.write(primes.toString());
                writer.flush();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        
        private static boolean isPrime(int number) {
            if (number <= 1)
                return false;

            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        server myServer = new server();

        try {
            myServer.start();
        } catch (IOException e) {
            System.err.println("Server başlatılamadı! " + e.getMessage());
        }
    }
}
