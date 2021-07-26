package Exercise_21;

import java.util.Scanner;

public class monthFinder {
    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        monthFinder finder = new monthFinder();

        int numMonth = finder.enterMonth();

        String month = finder.findName(numMonth);

        String output = finder.setOutput(month);
        finder.printOutput(output);
    }
    public int enterMonth() {
        System.out.print("Please enter the number of the month: ");
        int monthNum = Input.nextInt();
        while (monthNum < 1 || monthNum > 12) {
            System.out.print("There is no "+monthNum+" month. Try Again.");
            monthNum = Input.nextInt();
        }
        return monthNum;
    }
    public String findName(int monthNum) {
        String month = null;

        switch (monthNum) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> System.out.print("Invalid month.\n");
        }

        return month;
    }

    public String setOutput(String month) {
        return String.format("The name of the month is %s.", month);
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}
