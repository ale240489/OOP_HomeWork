package HomeWork.Day1;
//3. Предметы гигиены, содержащие следующие свойства:
//3.1 Количество штук в упаковке
public class HygieneItems extends Product{
    private int quantityInBag;
    public HygieneItems(String name, double price, int quantity, String unit, int quantityInBag) {
        super(name, price, quantity, unit);
        this.quantityInBag = quantityInBag;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "количество в упаковке: " + quantityInBag;
    }
}
