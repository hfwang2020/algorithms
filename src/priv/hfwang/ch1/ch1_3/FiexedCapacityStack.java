package priv.hfwang.ch1.ch1_3;

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

    public int size(){
        return N;
    }
    public void push(Item item){
        a[N++] = item;
    }
    public Item pop(){
        return a[--N];
    }


}
