package ch1._3;

import java.util.Iterator;
// node实现queue
public class Queue<Item> implements Iterator<Item> {
    private Node first;
    private Node last;
    private int N;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Item next() {
        return null;
    }

    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first =last;
        else oldlast.next = last;
        N++;
    }
    public Item outqueue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        N--;
        return item;
    }


}
