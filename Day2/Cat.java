package HomeWork.Day2;

public class Cat extends Pet{
    private String wool;
    public Cat(int height, int weight, String eyeCollor, String name, String breed,
               String vaccinations, String color, String birthday, String wool) {
        super(height, weight, eyeCollor, name, breed, vaccinations, color, birthday);
        this.wool = wool;
    }
    @Override
    void song() {
        System.out.println(" Meowwwww - meoww");
        System.out.println();
    }
    @Override
    public void ShowAffection() {
        System.out.println("Я КОТ!   mrrrr mrrrr mrrrrrrr");
    }

    public String getWool() {
        return wool;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Шерсть = " + wool;
    }
}
