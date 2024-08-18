package iphoneproject;

public class iPhone implements MusicPlayer, Phone, InternetBrowser {

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }

    @Override
    public void next() {
        System.out.println("Skipping to next track...");
    }

    @Override
    public void previous() {
        System.out.println("Going back to previous track...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Receiving a call from " + number + "...");
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    @Override
    public void receiveMessage(String number, String message) {
        System.out.println("Received message from " + number + ": " + message);
    }

    @Override
    public void browse(String url) {
        System.out.println("Browsing to " + url + "...");
    }

    @Override
    public void openLink(String url) {
        System.out.println("Opening link: " + url + "...");
    }

    @Override
    public void back() {
        System.out.println("Going back to the previous page...");
    }

    @Override
    public void forward() {
        System.out.println("Going forward to the next page...");
    }
}
