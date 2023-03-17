package HomeWork.Day3;

public abstract class Round extends Figure{

    protected double radius;

    public Round(double radius) throws Exception {
        this.radius = radius;
        if(radius < 0){
            throw new Exception(String.format("Круг с радиусом %f не может существовать", radius));
        }
    }

    protected double perimeter() {
        return 2 * Math.PI * radius;
    }
}
