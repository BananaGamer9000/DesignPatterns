package itrcollection;

import iterator.Iterator;

public interface Aggregate<T> {

    Iterator<T> createIterator();
}
