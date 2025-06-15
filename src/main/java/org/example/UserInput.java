package org.example;

import java.util.Scanner;
public class UserInput {

    private UserOutput output = UserOutput.getOutputObject();
    private static UserInput input = new UserInput();

    public static UserInput getInputObject() {
        return input;
    }

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
        outputEnters();
        return input;
    }

    public String enterDate() {
        output.outputDate();
        return scan.nextLine();
    }

    public int enterTaskType() {
        int input;
        while (true) {
            output.outputTaskType();
            input = scan.nextInt();
            if (input <= 5 && input >= 1) break;
            else output.outputEnterError();
        }
        scan.nextLine();
        outputEnters();
        return input;
    }

    public void outputEnters() {
        System.out.println("\n\n");
    }

}
