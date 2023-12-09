package org.example.homework_23_12_05;

import java.util.*;

//Сгруппируйте слова с одинаковым набором символов
//Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным
//набором символов.
//Input: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf", "tact"};
//Output :
//student, students
//cat, act, tact
//dog, god
//flow, wolf
//(Набор букв 1 группы: s, t, u, d, e, n, t; 2 группы: a, c, t; 3 группы: d, o, g; 4 группы: f, l, o, w)
//Группы слов функция возвращает в виде List>, либо сразу печатает в консоль.
public class WordsGroup {

    private final List<char[]> newWord = new ArrayList<>();

    public void searchWords(String[] array) {

        String result;

        for (String i : array) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);

            StringBuilder sb = new StringBuilder();
            i.chars().distinct().sorted().forEach(c -> sb.append((char) c));

            result = sb.toString();

            System.out.println("Слово " + i + " соответствует набору букв: " + result);

            newWord.add(result.toCharArray());
        }

        System.out.println("Всего 4 группы букв: ");
        Set<String> set = new HashSet<>();
        for (char[] i : newWord) {
            if (set.add(Arrays.toString(i))) {
                System.out.println(Arrays.toString(i));
            }
        }
    }
}



