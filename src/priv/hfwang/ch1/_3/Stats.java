package priv.hfwang.ch1._3;

import edu.princeton.cs.algs4.*;

public class Stats {
    // bag 用例
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }
        int N = numbers.size();
        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum / N;
        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean) * (x - mean);
        double std = Math.sqrt(sum / (N - 1));
        StdOut.printf("Mean: %.2f \n", mean);
        StdOut.printf("Std dev: %.2f\n", std);

    }

    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty())
            q.enqueue(in.readInt());
        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = q.outqueue();
        }
        return a;
    }


}
