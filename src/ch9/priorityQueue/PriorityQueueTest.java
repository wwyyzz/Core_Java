package ch9.priorityQueue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
//        Queue<LocalDate> pq = new ArrayDeque<>();
//        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
//        Queue<LocalDate> pq = new ArrayDeque<>();
        Queue<LocalDate> pq = new ArrayDeque<>();


        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));

        System.out.println("size = " + pq.size());

        System.out.println(pq);
        System.out.println(pq.element());

        System.out.println("Iterating over element...");
        for (LocalDate date : pq) {
            System.out.println(date);
        }
        System.out.println("Removeong element...");
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        System.out.println(pq);
    }
}
