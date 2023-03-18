package HomeWork.Day4;

import java.util.Arrays;

public class MyArrayList {
    private int length = 0;
    private Object array[] = new Object[length];
    public MyArrayList(){                              // Пустая инициализация
        Object array[];
    }
    public <T> MyArrayList(T el){
        this.array = new Object[1];
        array[0] = el;
        length++;                                  //Инициализация с одним элеме
    }
    public <T> void append(T el){                       //Добавление элемента в конец ArrayLst
        length++;
        Object[]array1 = Arrays.copyOf(array, length);
        array1[length-1] = el;
        array = array1;
    }
    public void remove (int index){                       // Удаление элемента по индексу
        for (int i = 0; i <= array.length; i++) {
            if(i >= index && i < array.length - 1)
                array[i] = array[i + 1];
        }
        length--;
        Object[]array1 = Arrays.copyOf(array, length);
        array = array1;
    }

    public <T>void removeValue(T el){                   // Удаление элемента по значению
        int index = array.length + 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == el)
                index = i;
            if(index != array.length + 1 && i >= index && i < array.length - 1)
                array[i] = array[i + 1];
        }
        length--;
        Object[]array1 = Arrays.copyOf(array, length);
        array = array1;
    }

    public void minValue(){                             // Поиск минимального значения
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Integer){
                if((Integer)array[i] < min)
                    min = (Integer)array[i];
            }
        }
        System.out.println(min);
    }
    public void maxValue(){                             // Поиск максимального значения
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Integer){
                if((Integer)array[i] > max)
                    max = (Integer)array[i];
            }
        }
        System.out.println(max);
    }
    public void sum(){                             // Сумма элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Integer)
               sum += (Integer) array[i];
        }
        System.out.println(sum);
    }
    public void product(){                             // Произведение элементов массива
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Integer)
                prod *= (Integer) array[i];
        }
        System.out.println(prod);
    }

    public <T> void indexOfValue(T el){                   //Поиск индекса по заданному элементу
        int bool = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == el) {
                bool = i;
                break;
            }
            else
                bool = -1;
        }
        if(bool != -1)
            System.out.println(String.format("Элемент "+ el + " находится под индексом %d", bool));
        else
            System.out.println("Элемента " + el + " в массиве нет");
    }

    public <T> boolean valueInArray(T el){                   //Проверка наличия элемента в массиве
        boolean value = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == el) {
                value = true;
                break;
            }
        }
        return value;
    }

    public Object[] bubbleSort(){                              //Сортировка пузырьком
        int temporary;
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Integer){
                for (int j = i; j < array.length; j++) {
                    if(array[j] instanceof Integer){
                        if((Integer)array[i] > (Integer) array[j]){
                            temporary = (Integer)array[i];
                            array[i] = array[j];
                            array[j] = temporary;
                        }
                    }
                }
            }
        }
        return array;
    }

    public void getValue (int index){                  //Получение элемента по индексу
        System.out.println(array[index]);
    }

    public <T>void insertValue (int index, T el ){
        array[index] = el;
    }

    public int length (){                           //Длина массива
        return array.length;
    }

    public void print(){                                   // Печать Array List
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
