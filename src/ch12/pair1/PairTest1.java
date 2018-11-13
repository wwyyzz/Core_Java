package ch12.pair1;


public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        String middle = ArrayAlg.getMiddle(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());


        System.out.println(middle);

        Integer[] nums = {29, 19, 46, 100, 25};
        Pair<Integer> nn = ArrayAlg.minmax(nums);
        System.out.println(nn.getFirst());
        System.out.println(nn.getSecond());
        System.out.println(ArrayAlg.getMiddle(nums));

    }
}

//class ArrayAlg{
//    public static Pair<String> minmax(String[] a){
//        if (a == null || a.length == 0) return null;
//        String min = a[0];
//        String max = a[0];
//        for (int i = 1; i < a.length; i++) {
//            if (min.compareTo(a[i]) > 0) min = a[i];
//            if (max.compareTo(a[i]) < 0) max = a[i];
//        }
//        return new Pair<>(min, max);
//    }
//
//    public static <T extends Comparable> T getMiddle(T... a){
//        return a[a.length / 2];
//    }
//}
class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T extends Comparable> T getMiddle(T... a){
        return a[a.length / 2];
    }
}
