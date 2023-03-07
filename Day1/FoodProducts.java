package HomeWork.Day1;
//А так же реализовать следующие классы-наследники:
//1. Продукты питания, содержащие следующие свойства:
//1.1 Срок годности

public class FoodProducts extends Product {
private String expirationDate;
    public FoodProducts(String name, double price, int quantity, String unit, String expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "срок годности: " + expirationDate;

    }
}
