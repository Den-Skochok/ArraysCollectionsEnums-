package HWItemC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HWItemC {
    public static final Logger LOGGER = LogManager.getLogger(HWItemC.class);
    public static void main(String[] args) {
        Persons persons1 = new Persons(25, "Person1 Name");
        Persons persons2 = new Persons(30, "Person2 Name");
        Persons persons3 = new Persons(35, "Person3 Name");
        Persons persons4 = new Persons(30, "Person4 Name");

        persons1.accountsArrayList.add(new Accounts(001, "Account1"));
        persons2.accountsArrayList.add(new Accounts(002, "Account2"));

        Map<Persons, ArrayList<Accounts>> map = new HashMap<>();
        map.put(persons1, persons1.accountsArrayList);
        map.put(persons2, persons2.accountsArrayList);

        LOGGER.info("Start Add account");
        persons1.accountsArrayList.add(new Accounts(25, "Person1 Name"));
        map.put(persons1, persons1.accountsArrayList);
        LOGGER.debug(map);
        LOGGER.info("End Add account\n");


        LOGGER.info("Start remove person");
        persons2.accountsArrayList.remove(persons2);
        map.put(persons2, persons2.accountsArrayList);
        LOGGER.debug(persons2);
        LOGGER.debug(map);
        LOGGER.info("End remove person\n");


        LOGGER.info("Start remove account");
        map.remove(persons3);
        LOGGER.debug(map);
        LOGGER.debug(persons3);
        LOGGER.info("End remove account\n");

        
        LOGGER.info("Start Output map");
        LOGGER.debug(map);
        LOGGER.info("End Output map\n");


    }
}
