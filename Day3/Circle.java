package HomeWork.Day3;

public class Circle extends Round implements Area {

    public Circle(double radius) throws Exception {
        super(radius);
        if(radius < 0){
            throw new Exception(String.format("Круг с радиусом %f не может существовать", radius));
        }
    }

    @Override
    public String toString() {
        return "Круг \n" +
                "радиус: " + radius + "\n" +
                "площадь: " + area() + "\n"+
                "------------------------";
    }

    @Override
    public double area() {
            return Math.PI * radius * radius;

    }
}
