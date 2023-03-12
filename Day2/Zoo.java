package HomeWork.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
private String aist = "Аист";

    public String getAist() {
        return aist;
    }

    private Map<Integer,Animal> zooPark = new HashMap<>();
    public Map addAnimal(int num, ArrayList<Animal> animal){
            if(num > 0 && num <= animal.size()) // что бы не добавляло другие пункты меню
                zooPark.put(num, animal.get(num-1));
        return  zooPark;
    }
    public Map<Integer, Animal> getZooPark() {
        return zooPark;
    }
    public Map<Integer, Animal> deleteAnimal(int delete){
        zooPark.remove(delete);
        return zooPark;
    }
    public void showZoo(int number){
        System.out.println(zooPark.get(number));
    }
    public void allSong(){
        for (int i = 1; i <= zooPark.size(); i++) {
            System.out.println(zooPark.get(i).getClass()+"\n" +
                    "говорит: ");
            zooPark.get(i).song();
            System.out.println("---------------");
        }
    }
    public void songOne(int num){
        System.out.println(zooPark.get(num).getClass()+"\n" +
                "говорит:");
        zooPark.get(num).song();
        System.out.println("-------------");;
    }
    public void showALL(){
        for (int i = 0; i < 10; i++) {
            if(zooPark.get(i)!= null) {
                System.out.println(zooPark.get(i).getClass());
                System.out.println(zooPark.get(i));
            }
            System.out.println();
        }
    }
    public int menu() {
        Scanner scan = new Scanner(System.in);

            System.out.println("Нумерация животных для работы с ними \n" +
                    "1 - аист\n" +
                    "2 - кот\n" +
                    "3 - курица\n" +
                    "4 - собака\n" +
                    "5 - тигр\n" +
                    "6 - волк\n" +
                    "----------------");

            int num = scan.nextInt();
            return num;
    }
    public void ability(){
        for (int i = 1; i <= zooPark.size(); i++){
            if (zooPark.get(i) instanceof Affection){
                ((Affection) zooPark.get(i)).ShowAffection();
            }
        }
    }


}
