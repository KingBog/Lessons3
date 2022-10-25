package Lessons31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrList {
    public void arrList(){
        Scanner scn= new Scanner(System.in);
        ArrayList<String> list= new ArrayList();
        boolean info= true;
        while (info){
            System.out.println("1. Добавить строку в список\n"+"2. Вывести строки из списка\n"+ "3. Удалить строку из списка\n"+
                    "4. Проверить строку на существование в списке\n"+ "5. Получить индекс строки из списка\n"+ "6. Выход");
            int input=scn.nextInt();

            if (input==1){
                System.out.println("Добавить строку в список: ");
                String value= scn.next();
                list.add(value);
            }
                else if (input==2){
                for (int i = 0; i < list.size(); i++) {
                    System.out.print("Строки: "+list.get(i)+" ");
                    System.out.println();

                }
            }
                else if (input==3){
                System.out.println("Какую строку удалить");
                int index=scn.nextInt();
                    list.remove(index);
            }
                    else if (input==4){
                System.out.println("Введите интересующийся строку: ");
                        String value=scn.next();
                        list.contains(value);
                        if (list.contains(value)){
                    System.out.println("Строка существует");
                }else {
                            System.out.println("Строки нету");
                        }
            }
                    else if (input==5){
                System.out.println("Введите интересующийся строку: ");
                String value=scn.next();
                System.out.println(list.indexOf(value));

            }
                    else if (input==6)
            {
                        info=false;
            }

        }
    }
}
