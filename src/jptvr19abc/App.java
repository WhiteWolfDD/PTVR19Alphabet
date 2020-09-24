package jptvr19abc;

import java.util.Scanner;

class App {
    public void run(){
        System.out.println("--- ABC ---");
        /**
         * Создаем массив char c алфавитом abc[33];
         * Просим пользователя ввести строку str
         * Проходим по массиву abc и ищем индекс вхождения этого символа в str.
         * Если возвращается -1, то такого символа нет -> записываем его в массив
         * нехватающих символов notAbc[33];
         * если -1 не встречался, то текст содержит все буквы алфавита.
         * если -1 сработал, то выводим набор символов, которые отсутствуют в тексте.
         */
        Scanner scanner = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz";
                
                char abc[] = a.toCharArray();
                char notAbc[] = new char[33];
                
                boolean isAllLetters = true;

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        
        for (int i = 0; i < abc.length; i++) {
            int index = str.indexOf(abc[i]);
            if (index == -1) {notAbc[i] = abc[i]; isAllLetters = false;}
        }
            if (!isAllLetters) {
                System.out.println("В строке не все буквы, нехватает: " + new String(notAbc));
            } else {
                System.out.println("В строке все буквы");
            }
        }
    }
