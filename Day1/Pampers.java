package HomeWork.Day1;
//11. Подгузники, содержащие следующее свойства:
//11.1 Размер
//11.2 Минимальный вес
//11.3 Максимальный вес
//11.4 Тип
public class Pampers extends ChildrenProduct{
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;
    public Pampers(String name, double price, int quantity, String unit, int minAge, String gippoAlergic,
                   int size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, minAge, gippoAlergic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "размер: "+ size+"\n"+
                "минимальный вес: " + minWeight + "\n"+
                "максимальный вес: " + maxWeight + "\n" +
                "тип: " + type;
    }
}
