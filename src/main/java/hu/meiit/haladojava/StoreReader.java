package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;

public interface StoreReader {
    Product remove(int index) throws StoreEmptyException;
    int getProductCount();
}
