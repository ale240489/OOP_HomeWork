package HomeWork.Day1;
//2. Напитки, содержащие следующие свойства:
//2.1 Объём
public class Drinks extends FoodProducts {
    private int value;

    public Drinks(String name, double price, int quantity, String unit, String expirationDate, int value) {
        super(name, price, quantity, unit, expirationDate);
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "объем: " + value;
    }
}
