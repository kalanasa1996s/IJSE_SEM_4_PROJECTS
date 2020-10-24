package lk.ijse.main;

public class Main {

    public static void main(String[] args) {
        WebServer webServer = new WebServer();
        webServer.CreateServer();

        try {
            webServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
