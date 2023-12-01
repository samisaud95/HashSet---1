//Scrivere una funzione che restituisca un hashset riempito
// Leggere l'hashSet e stampre grandezza ed elementi

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> frutta= new HashSet<String>();
        frutta.add("Mango");
        frutta.add("Pina");
        frutta.add("Lechoza");
        System.out.println(frutta);
        System.out.println(frutta.size());
        for (String index: frutta) {
            System.out.println(index);
        }
    }
}