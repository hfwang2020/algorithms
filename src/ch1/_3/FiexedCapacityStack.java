package ch1._3;

import java.util.Objects;

// 定容栈

public class FiexedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FiexedCapacityStack(int cap) {
        a = (Item[]) new Objects[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }


    public void resize(int max) {
        Item[] temp = (Item[]) new Objects[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null; // java 回收
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }



}
