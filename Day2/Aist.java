package HomeWork.Day2;

public class Aist extends Bird{

    public Aist(int height, int weight, String eyeCollor) {
        super(height, weight, eyeCollor);
    }


    @Override
    void song() {
        System.out.println("IIIIIIIUUUUUUUYYYY");
    }



    @Override
    public void ShowAffection() {
        setFlightAltitude("100");
        System.out.println("Я АИСТ!!! Лечу на высоте " + getFlightAltitude());
    }
}
