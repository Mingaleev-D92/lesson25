package ru.innopolis.university.mingaleev.homework_25;

public class Main {
    public static void main(String[] args) {
        BasketImpl basketImpl = new BasketImpl();
        basketImpl.addProduct("Смартфон", 3);
        basketImpl.addProduct("Планшет", 341);
        basketImpl.addProduct("Айфон", 3234);
        System.out.println(basketImpl.getProductQuantity("Смартфон"));
        basketImpl.clear();
    }
}
