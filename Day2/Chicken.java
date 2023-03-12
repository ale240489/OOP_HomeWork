package HomeWork.Day2;

public class Chicken extends Bird{
    public Chicken(int height, int weight, String eyeCollor) {
        super(height, weight, eyeCollor);
    }

    @Override
    void song() {
        System.out.println("Кукарекууууу");
    }

    @Override
    public void ShowAffection() {
        setFlightAltitude("1");
        System.out.println("Я курица!!! Пытаюсь лететь на высоте:  " + getFlightAltitude());
    }
}
