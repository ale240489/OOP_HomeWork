package HomeWork.Day2;

public class Dog extends Pet implements Affection{
    protected String training;

    public Dog(int height, int weight, String eyeCollor, String name, String breed,
               String vaccinations, String color, String birthday, String training) {
        super(height, weight, eyeCollor, name, breed, vaccinations, color, birthday);
        this.training = training;
    }

    public void training (){
        System.out.println("Я дрессируюсь!");
    }

    @Override
    void song() {
        System.out.println("Gavv Gavvv");
    }

    @Override
    public void ShowAffection() {
        System.out.println("Я СОБАКА , я дрессируюсь!");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Дрессированность = " + training;
    }
}
