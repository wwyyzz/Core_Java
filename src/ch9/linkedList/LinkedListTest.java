package ch9.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");
        System.out.println("a = " + a);
        System.out.println("a[2] =" + a.get(2));
        System.out.println("a[first] =" + ((LinkedList<String>) a).getFirst());
        System.out.println("a[last] =" + ((LinkedList<String>) a).getLast());
        System.out.println(((LinkedList<String>) a).removeFirst());
        ((LinkedList<String>) a).addFirst("Ada");
        System.out.println("a = " + a);

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        System.out.println("b = " + b);

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);
    }
}
