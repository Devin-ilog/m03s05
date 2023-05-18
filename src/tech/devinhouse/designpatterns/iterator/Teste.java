package tech.devinhouse.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<String> lista = List.of("tiago", "vinicius", "bruno", "luciano");

        // Iterator
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String proximo = iterator.next();
            System.out.println(proximo);
        }

    }

}
