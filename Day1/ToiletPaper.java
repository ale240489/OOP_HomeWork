package HomeWork.Day1;
//10. Туалетная бумага, содержащее следующее свойство:
//10.1 Количество слоёв
public class ToiletPaper extends HygieneItems{
    int numberLayers;
    public ToiletPaper(String name, double price, int quantity, String unit, int quantityInBag, int numberLayers) {
        super(name, price, quantity, unit, quantityInBag);
        this.numberLayers = numberLayers;
    }

    @Override
    public String toString() {
        return super.toString()+"\n" +
                "количество слоев: " + numberLayers;
    }
}
