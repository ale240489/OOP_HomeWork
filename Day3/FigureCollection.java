package HomeWork.Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FigureCollection {
    Map<Integer, Figure>figureCollect = new HashMap<>();
    public void addFigure(Figure figure, int number){
        figureCollect.put(number, figure);
    }
    public void delFigure(int number){
        figureCollect.remove(number);
    }

    public void printFigure(){
        System.out.println(figureCollect.values());
    }

    public void areaSort(){
        Map<Double,Figure> listFigure = new TreeMap<>();
        for (int i = 1; i <= figureCollect.size() ; i++) {
            if(figureCollect.get(i) instanceof Area){
                listFigure.put(((Area) figureCollect.get(i)).area(), figureCollect.get(i));
            }
        }
        System.out.println(listFigure.values());

    }
}
