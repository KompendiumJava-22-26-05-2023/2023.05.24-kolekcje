package pl.cmoarch.szkolenia.kolekcje.sety;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Wiesiek");
        set.add("Adam");
        set.add("Zbyszek");
        set.add("Karol");

        System.out.println(set);

        set.add("Zbyszek");

        System.out.println(set);
        System.out.println(set.contains("Karol"));

        for(String s : set) {
            System.out.println(s);
        }

        set.remove("Karol");
        System.out.println(set);

        set.add("Bogdan");
        System.out.println(set);
    }
}
