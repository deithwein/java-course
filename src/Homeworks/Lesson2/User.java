package Homeworks.Lesson2;

public class User {
    private String login, pass;
    private Basket basket;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }
}
