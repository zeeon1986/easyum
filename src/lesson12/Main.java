package lesson12;

import lesson12.homework.CollectionUtilsImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(15);

        set.add(5);
        set.add(8);
        set.add(10);
        set.add(12);
        set.add(0);

        CollectionUtilsImpl impl = new CollectionUtilsImpl();

        Collection<Integer> unionList = impl.union(list, set);
        System.out.println(unionList);


    }
}
