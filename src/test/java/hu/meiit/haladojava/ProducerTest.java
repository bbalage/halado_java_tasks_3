package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreFullException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProducerTest {

    @Mock
    StoreWriter storeWriter;

    @Test
    public void productAddedTest() throws StoreFullException {
        //GIVEN
        doNothing().when(storeWriter).add(any(Product.class));
        final Producer producer = new Producer(storeWriter);
        final String name = "product";
        final int serialNumber = 1;
        //WHEN
        producer.produce(name, serialNumber);
        //THEN
        verify(storeWriter, times(1)).add(new Product(name, serialNumber));
    }
}
