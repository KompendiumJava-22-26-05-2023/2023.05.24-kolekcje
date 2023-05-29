package pl.cmoarch.szkolenia.kolekcje.mapy;

import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(5, "Janusz");
        mapa.put(10, "Karol");
        mapa.put(15, "Wiesiek");

        System.out.println(mapa.size());

        System.out.println(mapa);

        System.out.println(mapa.get(15));
        System.out.println(mapa.get(5));

        mapa.put(5, "Zbyszek");

        System.out.println(mapa);

        mapa.put(20, "Zbyszek");

        System.out.println(mapa);

        HashMap<String, String> mapa2 = new HashMap<>();
        mapa2.put("Kowalski", "Janusz");
        mapa2.put("Malinowski", "Zbyszek");

        System.out.println(mapa2.get("Kowalski"));

        Set<Integer> klucze = mapa.keySet();
        for (int k : klucze) {
            System.out.println(k);
        }

        Collection<String> wartosci = mapa.values();

        for(String s : wartosci) {
            System.out.println(s);
        }

        System.out.println(wartosci);

        Set<Map.Entry<Integer, String>> pary = mapa.entrySet();
        for (Map.Entry<Integer, String> entry : pary) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        mapa.putIfAbsent(5, "Mateusz");
        mapa.containsKey(5);
        mapa.containsValue("Mateusz");
        mapa.remove(5);
        mapa.remove(5, "Janusz");
    }
}
