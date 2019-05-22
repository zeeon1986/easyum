package lesson12.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtilsImpl implements ListUtils {


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> list = new ArrayList<>();

        for (String s : strings) {
            list.add(s);
        }

        return list;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        Collections.sort(data, (o1, o2) -> o2.compareTo(o1));

        return data;
    }

}