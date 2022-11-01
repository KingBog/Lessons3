package Lessons33;

import Lessons31.ArrList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Translator>list=new ArrayList<>();
        boolean value=true;
        while (value) {
            Scanner scn = new Scanner(System.in);
            System.out.println("1.Добавить новые слова\n" + "2.Начать тренировку\n" + "3.Выход");
            int input = scn.nextInt();
            if (input == 1) {
                System.out.println("Введите ваше слово с переводом");
                String val1 = scn.next();
                String val2 = scn.next();
                list.add(new Translator("Bus", "Автобус"));
                list.add(new Translator("Cat", "Кот"));
                list.add(new Translator("Dog", "Собака"));
                list.add(new Translator(val1, val2));

            } else if (input == 2) {
                int num = 0;
                while (num < list.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println("Введите перевод сдлва:" + list.get(i).getName());
                       String val = scn.next();
                        if (list.get(i).getTrans().equals(val)) {
                            System.out.println("Это правельный ответ");
                        } else {
                            System.out.println("ЭтО не правельный ответ");
                        }
                        num++;
                    }

                }
            }else if (input==3)
                value=false;


        }
    }
}
