package HomeWork.Day3;

public class Rectangle extends Square implements Area, Perimeter{
    private double sideB;
    public Rectangle(double[] sides, double sideA, double sideB) {

        super(sides = new double[4], sideA);
        this.sideB = sideB;
        for (int i = 0; i < 4; i++) {
            if(i < 2){
                sides[i] = sideA;
            }
            else{
                sides[i] = sideB;
            }
        }
    }
    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}
