package ch2._2;

public class MergeBU {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = 2 * sz) {
            for (int lo = 0; lo < N - sz; lo += sz) {
                Merge.merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

}
