package iphoneproject;

public interface Phone {
    void makeCall(String number);
    void receiveCall(String number);
    void sendMessage(String number, String message);
    void receiveMessage(String number, String message);
}
