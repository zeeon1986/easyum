package lesson12.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        ArrayList<Double> list1 = new ArrayList<>();

        list.add(9);
        list.add(9);
        list.add(15);
        list.add(2);
        list.add(0);

        set.add(2);
        set.add(5);
        set.add(6);
        set.add(9);
        set.add(12);

        set2.add("asd");
        set2.add("dassa");
        set2.add("bsasd");
        set2.add("tasda");
        set2.add("cvbvcb");

        list1.add(2.6);
        list1.add(2.7);
        list1.add(2.1);

        CollectionUtilsImpl impl = new CollectionUtilsImpl();

        Collection<Integer> union = impl.union(list, set);
        System.out.println(union);

        Collection<Integer> difference = impl.difference(list, set);
        System.out.println(difference);

        Collection<Integer> intersection = impl.intersection(list, set);
        System.out.println(intersection);

        Collection<Integer> unionWithoutDuplicate = impl.unionWithoutDuplicate(list, set);
        System.out.println(unionWithoutDuplicate);

        Collection<Integer> intersectionWithoutDuplicate = impl.intersectionWithoutDuplicate(list, set);
        System.out.println(intersectionWithoutDuplicate);

        SetUtilsImpl setImpl = new SetUtilsImpl();

        SortedSet<String> orderedSet = setImpl.orderedSet(list,set2);
        System.out.println(orderedSet);

        Set<Integer> customOrderSet = setImpl.customOrderSet(5,6,7,8,1);
        System.out.println(customOrderSet);

        ListUtilsImpl listImpl = new ListUtilsImpl();
        List<String> asList = listImpl.asList("a", "b");
        System.out.println(asList);

        List<Double> sortedList = listImpl.sortedList(list1);
        System.out.println(sortedList);


    }
}
