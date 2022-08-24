package HWItemB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {

    public static Smartphone smartphoneNokia = new Smartphone(100, "Nokia 7");
    public static Smartphone smartphoneSamsung = new Smartphone(200, "Samsung 7");

    public static final Logger LOGGER = LogManager.getLogger(Smartphone.class);

    public static void main(String[] args) {

        LOGGER.info("Start HashSet added");
        Set<Smartphone> myHashSet = new HashSet();
        myHashSet.add(smartphoneNokia);
        myHashSet.add(smartphoneSamsung);
        LOGGER.info("Stop HashSet added");
        LOGGER.debug(myHashSet);


        LOGGER.info("Start list added");
        List<Smartphone> list = new ArrayList<>();
        list.add(smartphoneNokia);
        list.add(smartphoneSamsung);
        Collections.sort(list);
        LOGGER.debug(list);
        LOGGER.info("Stop list added");


        LOGGER.info("Start treeSet added");
        TreeSet<Smartphone> treeSet = new TreeSet<>();
        treeSet.add(smartphoneNokia);
        treeSet.add(smartphoneSamsung);
        LOGGER.debug(treeSet);
        LOGGER.info("Stop treeSet added");

        LOGGER.info("Start linkedHashSet added");
        LinkedHashSet<Smartphone> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(smartphoneNokia);
        linkedHashSet.add(smartphoneSamsung);
        LOGGER.debug(linkedHashSet);
        LOGGER.info("Stop linkedHashSet added");

    }
}
