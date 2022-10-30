package Lessons32;

import Lessons31.ArrList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList();
        //1 условие==============================================
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);
        System.out.println(list);
        //2 условие==============================================
        Integer var= 10;
        list.remove(var);
        System.out.println(list);
        //3 условие==============================================
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)==list.get(i-1)){
                list.remove(i);
            }

        }
        System.out.println(list);

       // 4 условие==============================================
        ArrayList<Integer> listUnion = new ArrayList<>();
        listUnion.add(10);
        listUnion.add(40);
        listUnion.add(50);
        listUnion.add(50);
        listUnion.add(110);
        listUnion.add(150);
        for (Integer num:listUnion){
            if (!list.contains(num)){
                list.add(num);
          }
        }
        System.out.println(list);

        //5 условие==============================================
        ArrayList<Integer> listIntersection = new ArrayList<>();
        listIntersection.add(20);
        listIntersection.add(30);
        listIntersection.add(40);
        listIntersection.add(50);
        listIntersection.add(100);
        list.clear();
        for (Integer listInt: listIntersection)
            list.add(listInt);
        System.out.println(list);

        //6 условие=============================================
        ArrayList<Integer> listSubstract = new ArrayList<>();
        listSubstract.add(30);
        listSubstract.add(40);
        listSubstract.add(100);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <listSubstract.size() ; j++) {
                if (list.get(i)==listSubstract.get(j)){
                    list.remove(i);
                }
            }
        }
        System.out.println(list);


    }
}
