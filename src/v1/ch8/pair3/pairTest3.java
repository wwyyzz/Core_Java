//package ch8.pair3;
//
//import v1.ch8.pair1.Pair;
//import v1.ch9.map.Employee;
//
///**
// * @program: Core_Java
// * @description: pair3
// * @author: Jun Wang
// * @create: 2019-01-15 11:22
// */
//public class pairTest3 {
//    public static void main(String[] args) {
//        Manager ceo = new Manager("Gus Greedy", 8000000, 2003,12,15);
//        Manager cfo = new Manager("Sid Sneaky", 6000000, 2003,12,15);
//        Pair<Manager> buddies = new Pair<>(ceo, cfo);
//        printBuddies(buddies);
//
//        ceo.setBonus(1000000);
//        cf0.setBonus(500000);
//
//        Manager[] managers = {ceo, cfo};
//
//        Pair<Employee> result = new pair<>();
//        minmaxBonus(managers, result);
//        System.out.println("first: " + result.getFirst().getName
//                + ", second: " + result.getSecond().getName);
//        maxminBonus(managers, result);
//        System.out.println("first: " + result.getFirst().getName
//                + ", second: " + result.getSecond().getName);
//    }
//
//    public static void printBuddies(Pair<? extends Employee> p)
//    {
//        Employee first = p.getFirst();
//        Employee second = p.getSecond();
//        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
//    }
//
//    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result)
//    {
//        if (a.length == 0) return;
//        Manager min = 0;
//        Manager max = 0;
//        for (int i = 1; i < a.length; i++) {
//            if (min.getBonus() > a[i].getBonus()) min = a[i];
//            if (max.getBonus() < a[i].getBonus()) max = a[i];
//        }
//        result.setFirst(min);
//        result.setSecond(max);
//    }
//
//    public static void maxminBonus(Manager[] a, pair<? super manager> result)
//    {
//        minmaxBonus(a.result);
//        PairAlg.swapHelper(result);
//    }
//}
//
//class PairAlg
//{
//    public static boolean hasNulls(Pair<?> p)
//    {
//        return p.getFirst() == null || p.getSecond() == null;
//    }
//
//    public static void swap(Pair<?> p)
//    {
//        swapHelper(p);
//    }
//
//    public static <T> void swapHelper(Pair<T> p)
//    {
//        T t = p.getFirst();
//        p.setFirst(p.getSecond());
//        p.setSecond(t);
//    }
//}
