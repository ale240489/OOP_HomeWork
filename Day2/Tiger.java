package HomeWork.Day2;

public class Tiger extends WildAnimal{

    public Tiger(int height, int weight, String eyeCollor, String habitat, String dateLocation) {
        super(height, weight, eyeCollor, habitat, dateLocation);
    }
    @Override
    void song() {
        System.out.println("grrrrrrrrr");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
