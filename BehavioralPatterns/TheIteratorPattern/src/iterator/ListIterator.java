package iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator{

    private List<T> list;
    private int index;

    public ListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(index++);
        }
        throw new NoSuchElementException("No more elements in the collection.");
    }
}
