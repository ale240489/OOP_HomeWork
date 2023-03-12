package HomeWork.Day2;

abstract class Pet extends Animal implements Affection {

    String name;
    String breed; // порода
    String vaccinations;
    String color;
    String birthday;

    public Pet(int height, int weight, String eyeCollor, String name, String breed, String vaccinations,
               String color, String birthday) {
        super(height, weight, eyeCollor);
        this.name = name; this.breed = breed; this.vaccinations = vaccinations;
        this.color = color; this.birthday = birthday;
    }


    @Override
    public String toString() {
        return super.toString()+ "\n"+
                "Имя = " + name+"\n" +
                "Порода = "+ breed+ "\n" +
                "Вакцинации = "+ vaccinations + "\n" +
                "Цвет = " + color + "\n"+
                "День рождения = " + birthday ;

    }
}
