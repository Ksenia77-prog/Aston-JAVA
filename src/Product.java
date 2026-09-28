public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean buyerBookingStatus;
    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, int price, boolean buyerBookingStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.buyerBookingStatus = buyerBookingStatus;
    }
    public void printInfo() {
        System.out.println("--- Информация о товаре ---");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Статус бронирования: " + (buyerBookingStatus ? "Забронирован" : "Свободен"));
        System.out.println("---------------------------");
    }
}
