package lesson12.homework;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);

        return result;

    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num: a) {
            if (b.contains(num)){
                result.add(num);
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);

        return set;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();

        for (Integer num: a) {
            if (b.contains(num)){
                result.add(num);
            }
        }

        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer i: a) {
            if (!b.contains(i)){
                result.add(i);
            }
        }

        for (Integer i: b) {
            if (!a.contains(i)){
                result.add(i);
            }
        }

        return result;
    }
}