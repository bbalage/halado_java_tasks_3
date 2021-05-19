package hu.meiit.haladojava;

import java.util.Objects;

public class Product {
    private String name;
    private int serialNumber;

    public Product(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (serialNumber != product.serialNumber) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }
}
