package HomeWork.Day2;

abstract class WildAnimal extends Animal{
    private String habitat; // среда обитания
    private String dateLocation; // дата нахождения

    public WildAnimal(int height, int weight, String eyeCollor, String habitat, String dateLocation) {
        super(height, weight, eyeCollor);
        this.habitat = habitat;
        this.dateLocation = dateLocation;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Среда обитания = " + habitat+ "\n"+
                "Дата нахождения = " + dateLocation+ "\n";
    }
}
