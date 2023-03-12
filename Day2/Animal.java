package HomeWork.Day2;

abstract class Animal {
    private int height; // рост
    private int weight; // вес
    private String eyeCollor; // цвет глаз

    public Animal(int height, int weight, String eyeCollor){
        this.height = height;
        this.weight = weight;
        this.eyeCollor = eyeCollor;
    }


    abstract void song();


    public String toString() {
        return "Высота = " + height + "\n" +
                "Вес = " + weight + "\n"+
                "Цвет гла = " + eyeCollor;
    }
    public void printInfo(){
        System.out.println(toString());
        System.out.println("-----------------");
    }
}

