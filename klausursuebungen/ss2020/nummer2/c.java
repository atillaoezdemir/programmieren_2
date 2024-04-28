package de.thws.klausursuebungen.ss2020.nummer2;
/*

a)
protected static void writeToClient(BufferedWriter toClient, String s)
        throws IOException {
    toClient.write(s);
    toClient.newLine();
    toClient.flush();
}

b)
public void start() throws IOException {
    try (ServerSocket ss = new ServerSocket(5000)) {
        while (true) {
            try (Socket connection = ss.accept()) {
                handleConnection(connection);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

c)
abstract class Game {
    public abstract void reset();
    public abstract String welcomeString();
    public abstract String initGameString();
    public abstract String handleInput(String input);
    public abstract boolean running();
}

interface GameServer {
    void start() throws IOException;
    void handleConnection(Socket connection) throws IOException;
    void play(BufferedReader fromClient, BufferedWriter toClient) throws IOException;
    void writeToClient(BufferedWriter toClient, String s) throws IOException;
}

public class TextServer implements GameServer {
    Game currentGame;

    public TextServer(Game game) {
        this.currentGame = game;
        game.reset(); //starts new Game
    }

// Other methods are same.
*/