package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreFullException;

public interface StoreWriter {
    void add(Product product) throws StoreFullException;
    void reset();
}
