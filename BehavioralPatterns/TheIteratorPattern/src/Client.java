import iterator.Iterator;
import itrcollection.MyList;

public class Client {
    public static void main(String[] args) {


        /*
        The Iterator Pattern is a behavioral design pattern that
        provides a way to access elements of a collection without
        exposing its underlying representation. It allows you to
        traverse the elements of a collection in a sequential manner
        without having to know the underlying data structure
         */

        MyList<String> myList = new MyList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        Iterator<String> iterator = myList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}