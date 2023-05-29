package pl.cmoarch.szkolenia.kolekcje.listy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        List<Integer> lista2 = new ArrayList<>();
        System.out.println(lista.size());
        lista.add(4);
        lista.add(10);
        lista.add(15);
        System.out.println(lista.size());
        System.out.println(lista.get(2));

        lista.remove(0);
        System.out.println(lista.size());
        System.out.println(lista);

        System.out.println(lista.contains(5));

        //lista.add("ABC");

        System.out.println(lista);
    }
}
