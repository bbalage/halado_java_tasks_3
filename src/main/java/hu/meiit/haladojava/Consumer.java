package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;

public class Consumer {
    private final StoreReader store;

    public Consumer(StoreReader store) {
        this.store = store;
    }

    public Product consume(int index) throws StoreEmptyException {
        return store.remove(index);
    }
}
