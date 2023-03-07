package HomeWork.Day1;

public class Programm {
    public static void main(String[] args) {
        Bread bread = new Bread("хлеб", 13, 1, "КГ", "12.11.23", "грубый помол" );
        Egg egg  = new Egg("Яйцо", 13.99, 2, "шт", "23.12.11", 10 );
        Limonade limonade = new Limonade("Кола", 23.1, 1, "мл", "12,12,12", 10);
        Mask mask = new Mask("маска", 1, 1, "шт", 100);
        Milk milk = new Milk("молоко", 10.0, 1, "мл", "23,12,23", 900, 2);
        Pampers pampers = new Pampers("подгузники", 10, 2, "шт", 1, "yes", 4, 2, 6 , "pampers");
        ToiletPaper paper = new ToiletPaper("туалетная бумага", 1, 10, "рулон", 12, 2);
        Nipple nipple = new Nipple("соска", 12, 1, "шт", 1, "да");

        printProduct(limonade);
        printProduct(bread);
        printProduct(paper);
        printProduct(milk);
        printProduct(nipple);
        printProduct(egg);
        printProduct(pampers);

    }
    public static void printProduct (Product product){
        System.out.println(product);
        System.out.println();
    }
}
