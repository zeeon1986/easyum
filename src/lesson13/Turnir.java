package lesson13;

import java.util.*;

public class Turnir {
    private String nameTurnir;
    private HashMap<String, Integer> teams = new HashMap<>();

    public Turnir() {
    }

    public Turnir(String nameTurnir) {
        this.nameTurnir = nameTurnir;
    }

    public String getNameTurnir() {
        return nameTurnir;
    }

    public void addTeam(String nameTeam, int points) {
        if (teams.containsKey(nameTeam)) {
            int currentPoints = teams.get(nameTeam);
            teams.put(nameTeam, points + currentPoints);
        } else {
            teams.put(nameTeam, points);
        }
    }

    public void printTable() {
        for (String key : teams.keySet()) {
            System.out.println("Team - " + key + " | Points - " + teams.get(key));
        }
    }

    public void printWinner() {
        ArrayList<Integer> points = new ArrayList<>(teams.values());
        Collections.sort(points);

        int pointWinner = points.get(points.size() - 1);
        String teamWinner = "";
        for (String key : teams.keySet()) {
            if (pointWinner == teams.get(key)) {
                teamWinner = key;
            }
        }

        System.out.println("Team " + teamWinner + " points " + pointWinner);
    }

    public void printLoser() {
        ArrayList<Integer> points = new ArrayList<>(teams.values());
        Collections.sort(points);

        int pointWinner = points.get(0);
        String teamWinner = "";
        for (String key : teams.keySet()) {
            if (pointWinner == teams.get(key)) {
                teamWinner = key;
            }
        }

        System.out.println("Team " + teamWinner + " points " + pointWinner);
    }

    public void printSortedTable()  {
        //Using Stream API
//        teams.entrySet().stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .forEach(System.out::println);

//        Using comparator
//        int size = teams.size();
//        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(size);
//        list.addAll(teams.entrySet());
//        ValueComparator<Integer> cmp = new ValueComparator<Integer>();
//        Collections.sort(list, cmp);
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(list.get(i));
//        }

        //Using Comparator with TreeMap

        MyComparator comparator = new MyComparator(teams);

        TreeMap<String, Integer> map = new TreeMap<String, Integer>(comparator);
        map.putAll(teams);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Team - " + entry.getKey() + " | points - " + entry.getValue());
        }

    }

//    private class ValueComparator<V extends Comparable<? super V>>
//            implements Comparator<Map.Entry<?, V>> {
//        public int compare(Map.Entry<?, V> o1, Map.Entry<?, V> o2) {
//            return o2.getValue().compareTo(o1.getValue());
//        }
//    }

    class MyComparator implements Comparator<Object> {

        Map<String, Integer> map;

        public MyComparator(Map<String, Integer> map) {
            this.map = map;
        }

        public int compare(Object o1, Object o2) {

            if (map.get(o2) == map.get(o1))
                return 1;
            else
                return  (map.get(o2)).compareTo(map.get(o1));

        }
    }
}
