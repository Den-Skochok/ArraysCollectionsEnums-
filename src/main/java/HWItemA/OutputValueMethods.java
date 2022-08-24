package HWItemA;

import java.util.Scanner;

public class OutputValueMethods {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean returnScannerTrue() {
        return scanner.hasNext();
    }

    public static String returnEnteredData() {
        return scanner.next();
    }

}

