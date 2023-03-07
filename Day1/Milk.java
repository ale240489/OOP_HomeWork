package HomeWork.Day1;
//А так же реализовать слеюущие классы, наследуемые от приведённых выше классов
// (надеюсь сами разберётесь от каких именно):
//5. Молоко, содержащиее следующее свойство:
//5.1 Процент жирности
//5.2 Срок годности
public class Milk extends Drinks{
    private  int fatContent;
    public Milk(String name, double price, int quantity, String unit, String expirationDate, int value, int fatContent) {
        super(name, price, quantity, unit, expirationDate, value);
        this.fatContent = fatContent;

    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "содержание жира: " + fatContent;
    }
}
