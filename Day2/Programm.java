package HomeWork.Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        ArrayList<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Aist(1, 12, "зеленые"));
        listAnimal.add(new Cat(10, 20, "коричневые", "Петр", "Египетский",
                "да", "белый", "23,12,12", "шерстяной"));
        listAnimal.add(new Chicken(3, 4, "розовые"));
        listAnimal.add(new Dog(1, 26, "коричневые", "Рыбка", "бульдог",
                "да", "черный", "23,30,18", "да"));
        listAnimal.add(new Tiger(10, 36, "черный", "парк сосновка",
                "12,23,24"));
        listAnimal.add(new Wolf(2, 34, "черные", "парк черная речка",
                "10,13,14", "нет"));


        boolean i = true;
        while (i) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - добавление в зоопарк\n" +
                    "2 - удаление из зоопарка\n" +
                    "3 - все животные говорят\n" +
                    "4 - говорит одно животное\n" +
                    "5 - специальные возможности(ласка, дрессировка, полет) \n" +
                    "10 - вывести список зоопарка\n" +
                    "11 - информация об одном животном\n" +
                    "0 - завершение работы\n" +
                    "-------------------------");
            int way = scanner.nextInt();
            if (way == 5){
                zoo1.ability();
            }
            if (way == 11){
                int num = zoo1.menu();
                if (zoo1.getZooPark().containsKey(num)) {
                    zoo1.showZoo(num);
                    System.out.println("-------------");
                }
                else {
                    System.out.println("Такого животного нет в зоопарке\n" +
                            "------------------");
                }
            }

            if (way == 1) {
                int num = zoo1.menu();
                zoo1.addAnimal(num, listAnimal);
                System.out.println("животное добавлено\n" +
                        "--------------");
            }
            if (way == 10){
                System.out.println("Если в зоопарке есть животные, то вот они:\n" +
                        "если список пуст, то добавьте животных в зоопарк");
                zoo1.showALL();
                System.out.println("-------------");
            }
            if(way == 0){
                i = false;
            }
            if(way == 3){
                System.out.println("Если в зоопарке есть животные, \n" +
                        "то послушайте как они говорят, если нет\n" +
                        "то добавьте их в зоопарк");
                zoo1.allSong();
                System.out.println("------------");
            }
            if(way == 4){
                int num = zoo1.menu();
                if (zoo1.getZooPark().containsKey(num)) {
                    zoo1.songOne(num);
                }
                else {
                    System.out.println("такого животного нет в зоопарке\n" +
                            "--------------------------");

                }
            }
            if (way == 2){
                int num = zoo1.menu();
                if (zoo1.getZooPark().containsKey(num)) {
                    zoo1.deleteAnimal(num);
                    System.out.println("животное удалено\n" +
                            "------------------");
                }
                else {
                    System.out.println("такого животного нет в зоопарке\n" +
                            "----------------------");
                }
            }
        }
    }

}
