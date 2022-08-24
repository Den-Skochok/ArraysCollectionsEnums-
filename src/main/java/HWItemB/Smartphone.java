package HWItemB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class Smartphone implements Comparable<Smartphone>{

    public String name;
    public int price;

    public Smartphone(int price, String name) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Smartphone smartphone) {
        return this.name.compareTo(smartphone.name);
    }
}
