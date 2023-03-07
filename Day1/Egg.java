package HomeWork.Day1;
//8. Яйца, содержащее следующиее свойство:
//8.1 Количество в упаковке
public class Egg extends FoodProducts{
    private int quantityInPack;
    public Egg(String name, double price, int quantity, String unit, String expirationDate, int quantityInPack) {
        super(name, price, quantity, unit, expirationDate);
        this.quantityInPack = quantityInPack;
    }

    @Override
    public String toString() {
        return super.toString()+"\n" +
                "количество в упаковке: " + quantityInPack;
    }
}
