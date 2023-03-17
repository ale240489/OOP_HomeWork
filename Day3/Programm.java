package HomeWork.Day3;
//Написать программу на языках Java, в которой идёт со следующими
//геометрическими фигурами:
// 1.Треугольник
// 2.Квадрат
//3.Прямоугольник
// 4.Круг
//В программе имеется массив фигур, с которым можно сделать следующие операции:
// 1.Добавить новую фигуру
//2.Посчитать периметр у всех фигур
//3.Посчитать площадь у всех фигур
//Для фигуры использовать базовый абстрактный класс фигуры, у которого
//есть методы посчитать периметр и посчитать площадь фигуры.
//Создать класс-коллекцию фигур В классе-коллекции реализовать методы6
//1. Dывода информации о всех периметах, площадях и длиннах окружности всех фигур,
//где это возможно,
//2. добавления новой фигуры,
//3. удаления фигуры,
//4. изменения фигуры по ндексу,
//5. сортировки по площади, вывод информации о всех фигурах.
//При создании фигур необходимо осуществлять проверку входных данных на
//возможность создания данной фигуры и в случае ошибки выдавать соответствующие
//сообщения. Перодумать собственную иерархию исключений

//1 Создать абстрактный класс Figure
//1.1 Создать абстрактный метод area
//1.2 Создать абстрактный метод perimeter

//2 Создать класс Triangle наследованный от Figure
//2.1 Создать три поля отвечающие за стороны
//2.2 Проверять в конструкторе что бы сумма двух сторон не превышала третью(для каждой стороны)
//2.3 Перегрузить метод perimeter: a + b + c
//2.4 Перегрузить метод area: sqrt(p(p-a)(p-b)(p-c)), где p = (a+b+c)/2

//3 Создать класс Rectangle наследованный от Figure
//3.1 Создать два к
//3.1 Создать два поля, отвечающие за стороны
//3.2 Перегрузить метод perimeter: 2 * (a+b)
//3.3 Перегрузить метод area: a*b

//4 Создать класс Circle наследованный от Figure
//4.1 Создать поле отвечающее за радиус(r)
//4.2 Проверить в конструкторе что r > 0
//4.3 Перегрузить метод perimeter 2 * pi * r
//4.4 Перегрузить метод area: pi * r * r

//5 Cоздать класс Square наследованный от Rectangle
//5.1 Перегрузить конструктор, который будет принимать одно число(сторону)
public class Programm {
    public static void main(String[] args) throws Exception {
        Square square = new Square(new double[]{},4); //Создание фигур
        Square square1 = new Square(new double[]{}, 8);
        Square square2 = new Square(new double[]{}, 2);
        Triangle triangle = new Triangle(new double[]{}, 7, 14, 10);
        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(new double[]{}, 4, 3);
        Rectangle rectangle1 = new Rectangle(new double[]{}, 23, 2);
        Rectangle rectangle2 = new Rectangle(new double[]{}, 13, 10);

        FigureCollection collection1 = new FigureCollection();// Создание экземпляра коллекции
        collection1.addFigure(square, 1);
        collection1.addFigure(triangle, 2);
        collection1.addFigure(circle, 3);
        collection1.addFigure(square1, 4);
        collection1.addFigure(square2,5);
        collection1.addFigure(rectangle, 6);
        collection1.addFigure(rectangle1, 7);
        collection1.addFigure(rectangle2, 8);

        System.out.println("ПОЛУЧИВШИЕСЯ ФИГУРЫ");
        collection1.printFigure();// Печать всей коллекции фигур(вся информация)
        System.out.println("СОРТИРОВКУА ФИГУР ПО ИХ ПЛОЩАДИ");
        collection1.areaSort(); // сортировка по площади, где она есть (и вывод на экран)


    }
}
