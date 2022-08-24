package HWItemA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    public static final Logger LOGGER = LogManager.getLogger(TaskA.class);
    private static ListMethods listMethods = new ListMethods();

    public void getListElementsAfterBreakValue() {
        try {
            listMethods.returnValuesFromConsoleUntilReturnBreak();
        } catch (ExceptionTest e) {
            LOGGER.info(e);
        }
    }

    public void getValueFromListWhichStartFromLetter() {
        try {
            listMethods.returnValuesFromListWhichStartFromLetter("s");
        } catch (ExceptionTest e) {
            LOGGER.info(e);
        }
    }

    public void getValuesFromListWhichMoreThenDigitValue() {
        try {
            listMethods.returnValuesFromListWhichMoreThenDigitValue(5);
        } catch (ExceptionTest e) {
            LOGGER.info(e);
        }
    }


}
