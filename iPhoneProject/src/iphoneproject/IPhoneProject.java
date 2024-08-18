
package iphoneproject;


public class IPhoneProject {

    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();

        // Testando as funções do reprodutor de música
        myiPhone.play();
        myiPhone.pause();
        myiPhone.next();

        // Testando as funções de telefone
        myiPhone.makeCall("123456789");
        myiPhone.receiveCall("987654321");

        // Testando as funções de navegador
        myiPhone.browse("www.example.com");
        myiPhone.back();
    }
    
}
