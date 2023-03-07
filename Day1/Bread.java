package HomeWork.Day1;
//7. Хлеб, содержащий следующие свойство:
//7.1 Тип муки
public class Bread extends FoodProducts{
private String typeFlour;
    public Bread(String name, double price, int quantity, String unit, String expirationDate, String typeFlour) {
        super(name, price, quantity, unit, expirationDate);
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return super.toString()+"\n" +
                "тип муки: " + typeFlour;
    }
}

