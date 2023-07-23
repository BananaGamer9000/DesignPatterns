package itrcollection;

import iterator.Iterator;
import iterator.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements Aggregate<T> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(list);
    }
}
