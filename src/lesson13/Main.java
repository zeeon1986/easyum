package lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Apple", 3);
        fridge.put("Orange", 5);
        fridge.put("Tomatos", 10);

        for (String key: fridge.keySet()) {
            System.out.println("Value - " + fridge.get(key));

        }


    }
}
