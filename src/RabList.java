import java.util.*;

public class RabList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numList = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();
        //Объединенные 1 и 2 задания
        for (int i = 0; i < nums.size(); i++) {
            //Вывод нечетных чисел - Задание 1
            if (!(nums.get(i) % 2 == 0)) {
                numList.add(nums.get(i));
            } else {
                //Вывод четных чисел - Задание 2
                numSet.add(nums.get(i));
            }


        }
        //Объединенные 3 и 4 задания
        List<String> words = new ArrayList<>(List.of("Привет", "Пока", "Привет", "Чиж", "Протуберанец",
                "Остроносый", "Остроносый", "Чиж", "Привет", "Пока"));
        Map<String, Integer> wordMap = new HashMap<>();
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            wordSet.add(words.get(i));
            if (!wordMap.containsKey(words.get(i))) {
                wordMap.put(words.get(i), 1);
            } else {
                wordMap.put(words.get(i), wordMap.get(words.get(i)) + 1);
            }

        }


        System.out.println(numList.toString());
        System.out.println(numSet.toString());
        System.out.println(wordSet.toString());
        System.out.println(wordMap.toString());


    }
}
