package HWItemA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListMethods extends OutputValueMethods {

//    public boolean returnScannerValue;
//    public String returnEnteredValue;
//
//    public ListMethods(boolean returnScannerValue, String returnEnteredValue){
//        this.returnScannerValue = returnScannerValue;
//        this.returnEnteredValue = returnEnteredValue;
//    }

    public static final Logger LOGGER = LogManager.getLogger(TaskA.class);
    public static List<String> list = new ArrayList<String>();
    public void returnValuesFromConsoleUntilReturnBreak() throws ExceptionTest {
        LOGGER.debug("Please enter value and press Enter");
        LOGGER.debug("If you type 'break' you will see all the previously entered values.\n" +
                "and\n" +
                "Strings value starts which the later s\n" +
                "and\n" +
                "Strings value with length more then 5");
        while (returnScannerTrue()) {
            list.add(returnEnteredData());
            if (returnEnteredData().equals("break")) {
                LOGGER.info(list.size());
                LOGGER.info(list);
                LOGGER.info("You type 'break' value, look at your result\n");
                break;
            }
        }
    }

    public void returnValuesFromListWhichStartFromLetter(String letter) throws ExceptionTest {

        LOGGER.debug("Strings value which starts the later s");
        for (String listElements : list) {
            if (listElements.startsWith(letter)) {
                LOGGER.info(listElements);
            }
        }
    }
    public void returnValuesFromListWhichMoreThenDigitValue(int digit) throws ExceptionTest {

        LOGGER.debug("\nStrings value with length more then 5");
        for (String listElementsMoreValueLength : list) {
            if (listElementsMoreValueLength.length() > digit) {
                LOGGER.info(listElementsMoreValueLength);
            }
        }
    }

}

