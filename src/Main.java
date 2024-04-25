import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.FileHandler;


public class Main {
    //Lab: S4
    //Name: Khaled Ahmed Sayed Hashem , ID: 20206019
    //Name: Youssef Ashraf Fouad Labatia , ID: 20206091
    //Name: Ramez Ehab Talaat Riad    , ID: 20206025
    private static Scanner scanner;
    private static PrintWriter writer;

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(new File("input.txt"));
        writer = new PrintWriter("output.txt");


        String problemNumber = "";


        while (problemNumber != null) {

            if(scanner.hasNextLine())
                problemNumber = scanner.nextLine();

            else
                break;
            //System.out.println(problemNumber);
            switch (problemNumber.trim()) {
                case "1": {
                    writer.println("1");
                    functionCaller(Main::problem1, "False", "True"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "2": {
                    writer.println("2");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "3": {
                    writer.println("3");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "4": {
                    writer.println("4");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;

                }
                case "5": {
                    writer.println("5");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;


                }
                case "6": {
                    writer.println("6");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");

                    break;
                }
                case "7": {
                    writer.println("7");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "8": {
                    writer.println("8");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "9": {
                    writer.println("9");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "10": {
                    writer.println("10");
                    functionCaller(Main::problem10, "False", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                default: {
                    System.out.println("in default " + problemNumber);
                    System.out.println("Could not read properly from file!");
                    writer.close();
                    return;
                }
            }
        }
        writer.close();
    }

    //calls function inside it , instead of repeating loop code in every case
    public static void functionCaller(Predicate<String> problemFunction, String acceptString, String rejectString) throws IOException {
        String input = "";
        while (scanner.hasNextLine() && !(input = scanner.nextLine().toLowerCase()).equals("end")) {
            if (problemFunction.test(input)) { //calls function
                writer.println(acceptString);
            } else {
                writer.println(rejectString);
            }
        }
        if(scanner.hasNextLine())
            scanner.nextLine(); //added to read properly from file
    }

    public static boolean problem1(String input) {
        final int Q0 = 0; // Initial state
        final int Q1 = 1; // Final (accepting) state
        final int Q2 = 2; // State after seeing 'b'

        int currentState = Q0;

        for (char ch : input.toCharArray()) {
            switch (currentState) {
                case Q0:
                    if (ch == 'a') {
                        currentState = Q0;
                    } else if (ch == 'b') {
                        currentState = Q1;
                    }
                    break;
                case Q1:
                    if (ch == 'a') {
                        currentState = Q2;
                    } else if (ch == 'b') {
                        currentState = Q0;
                    }
                    break;
                case Q2:
                    if (ch == 'a') {
                        currentState = Q2;
                    } else if (ch == 'b') {
                        currentState = Q2;
                    }
                    break;
            }
        }
        return currentState == Q2; // Check if the input went to the trap Q2
    }

    public static boolean problem2(String expression) {
        return false;
    }

    public static boolean problem3(String expression) {
        return false;
    }

    public static boolean problem4(String expression) {
        return false;
    }

    public static boolean problem5(String expression) {
        return false;
    }

    public static boolean problem6(String expression) {
        return false;
    }

    public static boolean problem7(String expression) {
        return false;
    }

    public static boolean problem8(String expression) {
        return false;
    }

    public static boolean problem9(String expression) {
        return false;
    }

    public static boolean problem10(String expression) {
        return false;
    }
}

