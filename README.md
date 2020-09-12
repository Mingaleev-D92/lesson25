# lesson25
Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:

interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}
