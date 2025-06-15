package org.example;


import java.util.Scanner;
public class UserInput {
    private UserOutput output = new UserOutput();

    Scanner scan = new Scanner(System.in);

    public String enterTask() {
        output.outputEnterTask();
        return scan.nextLine();
    }

    public int enterPriority() {
        output.outputEnterPriority();
        int priority = scan.nextInt();
        scan.nextLine();
        return priority;
    }

    public int enterIndex() {
        output.outputEnterIndex();
        return scan.nextInt();
    }

    public int enterMenu() {
        int input;
        while (true) {
            output.outputMenu();
            input = scan.nextInt();
            if (input <= 4 && input >= 1) break;
            else output.outputEnterError();
        }
        return input;
    }

}
