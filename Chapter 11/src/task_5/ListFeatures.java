package task_5;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {

        Random rand = new Random(47);

        List<Integer> pets = new ArrayList<Integer>();
        Collections.addAll(pets, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("1: " + pets);

        Integer h = 10;
        pets.add(h); // С автоматическим изменением размера
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));

        pets.remove(h); // Удаление заданного объекта
        Integer p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));

        Integer cymric = 11;
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));

        // Удаление заданного объекта
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);

        pets.add(3, 12); // Вставка по индексу
        System.out.println("9: " + pets);

        List<Integer> sub = pets.subList(1, 4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + pets.containsAll(sub));

        Collections.sort(sub); //Сортировка "на месте"
        System.out.println("После сортировки: " + sub);

        // Для containsAll() порядок не важен:
        System.out.println("11: " + pets.containsAll(sub));

        Collections.shuffle(sub, rand); // Перемешивание
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + pets.containsAll(sub));

        List<Integer> copy = new ArrayList<Integer>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);

        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<Integer>(pets); // Копирование
        copy.remove(2); // Удаление по индексу
        System.out.println("14: " + copy);

        copy.removeAll(sub); // Удаление заданных объектов
        System.out.println("15: " + copy);

        copy.set(1, 13); // Замена элемента
        System.out.println("16: " + copy);

        copy.addAll(2, sub); // Вставка списка в середину
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());

        pets.clear(); // Удаление всех элементов
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());

        pets.addAll(Arrays.asList(0, 1, 2, 3, 4, 5));
        System.out.println("21: " + pets);

        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);

        Integer[] pa = pets.toArray(new Integer[0]);
        System.out.println("23: " + pa[3]);
    }
}
