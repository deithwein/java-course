package Lesson2.Interfaces;

public class Telegram implements Messenger{

    public void getMessage() {
        System.out.println("получаем сообщение из Telegram");
    }

    @Override
    public void sendMessage() {
        System.out.println("шлём сообщение в Telegram");
    }

}
