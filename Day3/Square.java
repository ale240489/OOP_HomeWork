package HomeWork.Day3;

public class Square extends Polygon implements Area, Perimeter {
    double sideA;
    public Square(double[] sides, double sideA) {
        super(sides = new double[4]);
        this.sideA = sideA;
        for (int i = 0; i < 4; i++) {
            sides[i] = sideA;
        }
    }
    @Override
    public double area() {
        return sideA * sideA;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideA);
    }

    @Override
    public String toString() {
        return "Квадрат \n" +
                "со сторонами : " + sideA + "\n" +
                "площадь : " + area() + "\n" +
                "периметр : " + perimeter() + "\n" +
                "----------------------------" + "\n";
    }
}
