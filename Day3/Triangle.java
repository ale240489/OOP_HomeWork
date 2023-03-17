package HomeWork.Day3;

public class Triangle extends Polygon implements Area, Perimeter {
    double side1;
    double side2;
    double side3;

    public Triangle(double[] sides, double side1, double side2, double side3) throws Exception {
        super(sides = new double[4]);
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;

        if ((sides[0] + sides[1]) < sides[2] ||
                (sides[1] + sides[2]) < sides[0] ||
                (sides[2] + sides[0]) < sides[1]) {
            throw new Exception("Треугольник с такими сторонами не может существовать");
        }
    }
    @Override
    public double area() {
        double halfP = this.perimeter() / 2;
        return Math.sqrt(halfP * (halfP - sides[0]) * (halfP - sides[1]) * (halfP - sides[2]));

    }
    @Override
    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < 3; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }
    @Override
    public String toString() {
        return "Треугольник " +
                "со сторонами : " + sides[0] + ", " + sides[1] + ", " + sides[2] + "\n"+
                "площадь : " + area() + "\n"+
                "периметр : "+ perimeter() + "\n"+
                "--------------------------------"+"\n";
    }
}
