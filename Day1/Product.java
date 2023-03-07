package HomeWork.Day1;
//Реализовать класс товар, содержащий следующие свойства:
//1. Название
//2. Цена
//3. Количество
//4. Единица измерения

//У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
// в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы,
// принемающие все поля.
//Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты
// товаров и проверить работу метода, созданного в классе Program
public class Product {
    private String name;
    private double price;
    private int quantity;
    private String unit;

    public Product(String name, double price, int quantity, String unit){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Продукт" + "\n"+
                "----------------------------"+"\n"+
                "наименование: " + name + '\n' +
                "стоимость: " + price + '\n' +
                "количество: " + quantity + '\n' +
                "мера: " + unit;

    }
}
