package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ConsumerTest {

    @Mock
    StoreReader storeReader;

    @Test
    public void consumeTest() throws StoreEmptyException {
        //GIVEN
        final int index = 1;
        final String name = "Name";
        final int serialNumber = 1;
        final Product expectedProduct = new Product(name, serialNumber);
        when(storeReader.remove(index)).thenReturn(expectedProduct);
        final Consumer consumer = new Consumer(storeReader);
        //WHEN
        Product actualProduct = consumer.consume(index);
        //THEN
        verify(storeReader, times(1)).remove(index);
        assertEquals(expectedProduct, actualProduct);
    }
}
