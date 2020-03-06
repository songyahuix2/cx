package other.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author shkstart
 * @date 2019/10/23 - 22:03
 */
public class ArrayList<T> {
        private static final int DEFAULT_CAPACITY = 10;
    //  private int theSize;
    private int theSize;
    //  private T[] theItems;
    private T[] theItems;

    /**
     *      * 返回ArrayList的长度
     *      * @return
     *     
     */
    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize) {
            return;
        }
        T[] old = theItems;
        theItems = (T[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            theItems[i] = old[i];
        }
    }

    public ArrayList() {
        clear();
    }

    public void clear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public void trimToSize() {
        ensureCapacity(size());
    }

    public T get(int idx) {
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            return theItems[idx];
        }
    }

    public T set(int idx, T newVal) {
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            T old = theItems[idx];
            theItems[idx] = newVal;
            return old;
        }

    }

    public boolean add(T x) {
        add(size(), x);
        return true;
    }

    public void add(int idx, T x) {
        if (theItems.length == size()) {
            ensureCapacity(size() * 2 + 1);
        }
        for (int i = theSize; i > idx; i++) {
            theItems[i] = theItems[i - 1];
        }
        theItems[idx] = x;
        theSize++;
    }

    public T remove(int idx) {
        T removedItem = theItems[idx];
        for (int i = idx; i < size() - 1; i++) { //为什么不是size()
            theItems[i] = theItems[i + 1];
        }
        theSize--;
        return removedItem;
    }



}


