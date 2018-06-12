package lab_8;

import java.util.*;

class Cat
{
    public String name;
    public Cat()
    {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Имя:\t");
        name = in.nextLine();
    }
}

public class LAB_8 
{
    public static void lab81() 
    {
        Set<String> set = new HashSet<>();
        set.add("Арбуз");
        set.add("Дыня");
        set.add("Жень-шень");
        set.add("Банан");
        set.add("Ежевика");
        set.add("Вишня");
        set.add("Груша");
        set.add("Земляника");
        set.add("Ирис");
        set.add("Картофель");
        for (String text : set) 
        {
            System.out.println(text);
        }
    }

    public static void lab82() 
    {
        Map<String, String> map = new HashMap<>();
        map.put("Арбуз", "Ягода");
        map.put("Дыня", "овощ");
        map.put("Жень-шень", "корень");
        map.put("Банан", "трава");
        map.put("Ежевика", "куст");
        map.put("Вишня", "ягода");
        map.put("Груша", "фрукт");
        map.put("Земляника", "ягода");
        map.put("Ирис", "цветок");
        map.put("Картофель", "клубень");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) 
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ": " + value);
        }

    }

    public static void lab83() 
    {
        Map<String, Cat> map = new HashMap<>();
        Cat p1 = new Cat();
        Cat p2 = new Cat();
        Cat p3 = new Cat();
        Cat p4 = new Cat();
        Cat p5 = new Cat();
        Cat p6 = new Cat();
        Cat p7 = new Cat();
        Cat p8 = new Cat();
        Cat p9 = new Cat();
        Cat p0 = new Cat();
        map.put("Кот 1", p1);
        map.put("Кот 2", p2);
        map.put("Кот 3", p3);
        map.put("Кот 4", p4);
        map.put("Кот 5", p5);
        map.put("Кот 6", p6);
        map.put("Кот 7", p7);
        map.put("Кот 8", p8);
        map.put("Кот 9", p9);
        map.put("Кот 10", p0);
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            Map.Entry<String, Cat> pair = iterator.next();
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " - " + value);
        }
        Iterator<Map.Entry<String, Cat>> iterator1 = map.entrySet().iterator();
        System.out.println("Ключи:");
        while (iterator1.hasNext()) 
        {
            Map.Entry<String, Cat> pair = iterator1.next();
            String key = pair.getKey();
            System.out.println(key);
        }
        Iterator<Map.Entry<String, Cat>> iterator2 = map.entrySet().iterator();
        System.out.println("Значения:");
        while (iterator2.hasNext())
        {
            Map.Entry<String, Cat> pair = iterator2.next();
            Cat value = pair.getValue();
            System.out.println(value);
        }
    }

    public static void lab86() 
    {
        Map<String, Object> map = new HashMap<>();
        Object[] obj = new Object[10];
        for (int i = 0; i < 10; i++) 
        {
            obj[i] = Math.ceil(Math.random() * 1000);
        }
        map.put("Объект1", obj[0]);
        map.put("Объект2", obj[1]);
        map.put("Объект3", obj[2]);
        map.put("Объект4", obj[3]);
        map.put("Объект5", obj[4]);
        map.put("Объект6", obj[5]);
        map.put("Объект7", obj[6]);
        map.put("Объект8", obj[7]);
        map.put("Объект9", obj[8]);
        map.put("Объект10", obj[9]);
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            Map.Entry<String, Object> pair = iterator.next();
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
    public static void main(String[] args) 
    {
        lab81();
        lab82();
        lab83();
        lab86();
    }
}