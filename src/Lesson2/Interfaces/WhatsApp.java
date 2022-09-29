package Lesson2.Interfaces;

public class WhatsApp implements Messenger {

    public void getMessage() {
        System.out.println("получаем сообщение из WhatsApp");
    }

    @Override
    public void sendMessage() {
        System.out.println("шлём сообщение в WhatsApp");
    }
}
