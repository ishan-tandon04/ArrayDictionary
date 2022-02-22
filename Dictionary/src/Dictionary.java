import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dictionary <T, E> { //arraylists for instance data
    private ArrayList<T> values;
    private ArrayList<E> keys;


        public Dictionary(){   //default constructor
            values = new ArrayList<>();
            keys = new ArrayList<>();
        }


        public void put(E key, T value){//put method
            keys.add(key);
            values.add(value);
        }


        public T get(E key){//get method
            int indexOfKey = keys.indexOf(key);
            return values.get(indexOfKey);
        }


        public T remove(E key){ //remove method
            int indexOfKey = keys.indexOf(key);
            keys.remove(indexOfKey);
            return values.remove(indexOfKey);
        }


        public boolean contains(E key){//contains method
            int indexOfKey = keys.indexOf(key);
            return indexOfKey >= 0;
        }


        public boolean isEmpty(){//isEmpty method
            return !(values.size() > 0);
        }


        public int size(){ //size method
            return values.size();
        }

        public Collection<E> keys(){//return a collection of keys
            Collection collection = keys;
            return collection;
        }

        public Collection<E> values(){//return a collection of values
            Collection collection = values;
            return collection;
        }
}
