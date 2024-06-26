import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;


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

            if (scanner.hasNextLine())
                problemNumber = scanner.nextLine();

            else
                break;
            //System.out.println(problemNumber);
            switch (problemNumber.trim()) {
                case "1": {
                    writer.println("1");
                    functionCaller(Main::problem1, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "2": {
                    writer.println("2");
                    functionCaller(Main::problem2, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "3": {
                    writer.println("3");
                    functionCaller(Main::problem3, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "4": {
                    writer.println("4");
                    functionCaller(Main::problem4, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;

                }
                case "5": {
                    writer.println("5");
                    functionCaller(Main::problem5, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;


                }
                case "6": {
                    writer.println("6");
                    functionCaller(Main::problem6, "True", "False"); //calls function inside it
                    writer.println("x\n");

                    break;
                }
                case "7": {
                    writer.println("7");
                    functionCaller(Main::problem7, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "8": {
                    writer.println("8");
                    functionCaller(Main::problem8, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "9": {
                    writer.println("9");
                    functionCaller(Main::problem9, "True", "False"); //calls function inside it
                    writer.println("x\n");
                    break;
                }
                case "10": {
                    writer.println("10");
                    functionCaller(Main::problem10, "True", "False"); //calls function inside it
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
        String input ;
        while (scanner.hasNextLine() && !(input = scanner.nextLine().toLowerCase()).equals("end")) {
            if (problemFunction.test(input)) { //calls function
                writer.println(acceptString);
            } else {
                writer.println(rejectString);
            }
        }
        if (scanner.hasNextLine())
            scanner.nextLine(); //added to read properly from file
    }

    public static boolean problem1(String input) {
        final int Q0 = 0; // Initial state and final state1
        final int Q1 = 1; // Final (accepting) state2
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
                        currentState = Q1;
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
        return (currentState == Q1 || currentState == Q0 ); // Check if the input went to the accepted state
    }

    public static boolean problem2(String input) {
        final int Q0 = 0; // Initial state
        final int Q1 = 1; // Final (accepting) state
        final int Q2 = 2;
        final int Q3 = 3;// trap state

        int currentState = Q0;

        for (char ch : input.toCharArray()) {
            switch (currentState) {
                case Q0:
                    if (ch == '1') {
                        currentState = Q1;
                    } else if (ch == '0') {
                        currentState = Q2;
                    }
                    break;
                case Q1:
                    if (ch == '1') {
                        currentState = Q3;
                    } else if (ch == '0') {
                        currentState = Q3;
                    }
                    break;
                case Q2:
                    if (ch == '0') {
                        currentState = Q0;
                    } else if (ch == '1') {
                        currentState = Q3;
                    }
                    break;
                case Q3:
                    if (ch == '0') {
                        currentState = Q3;
                    } else if (ch == '1') {
                        currentState = Q3;
                    }
                    break;
            }
        }
        return currentState == Q1; // Check if the input went to the accepted state;
    }

    public static boolean problem3(String input) {

        final int Q0 = 0; // Initial state
        final int Q1 = 1; // Final (accepting) state


        int currentState = Q0;

        for (char ch : input.toCharArray()) {
            switch (currentState) {
                case Q0:
                    if (ch == 'x') {
                        currentState = Q1;
                    } else if (ch == 'y') {
                        currentState = Q0;
                    }
                    break;
                case Q1:
                    if (ch == 'x') {
                        currentState = Q0;
                    } else if (ch == 'y') {
                        currentState = Q1;
                    }
                    break;
            }
        }
        return currentState == Q1; // Check if the input went to the accepted state Q1
    }

    public static boolean problem4(String expression) {
        boolean answer = true;
        if(expression.charAt(0) == 'a'){
            if(expression.charAt(expression.length()-1) != 'a'){
                answer = false;
            }
        }
        else{
            if(expression.charAt(expression.length()-1) != 'b'){
                answer = false;
            }
        }
        return answer;
    }

    public static boolean problem5(String expression) {
        boolean answer = true;
        int i=0, size = expression.length();
        if(expression.charAt(i++) == '1'){
            if(size < 3 || expression.charAt(size-1) != '0' || expression.charAt(size-2) != '0'){
                answer = false;
            }
        }
        else{
            while(i < size && expression.charAt(i) != '1'){
                i++;
            }
            if(i < expression.length() && (size == 2 || (expression.charAt(size-1) != '0' || expression.charAt(size-2) != '0'))){
                answer = false;
            }
        }
        return answer;
    }

    public static boolean problem6(String expression) {
        boolean answer = true;
        int i=0, size = expression.length();
        if(expression.charAt(i++) == '1'){
            if(i < size && expression.charAt(i++) == '1'){
                if(i == size || (i == size - 1 && expression.charAt(i) == '1')){
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static boolean problem7(String expression) {
        ArrayList<Character> finalStates = new ArrayList<Character>();
        finalStates.add('A');
        finalStates.add('B');
        finalStates.add('C');

        char currentState = 'A';
        for (char bit : expression.toCharArray()){
            switch (currentState){
                case 'A':{
                    if(bit == '0')
                        currentState = 'B';
                    else
                        currentState = 'C';
                    break;
                }
                case 'B':{//if 0 -> loop on same state
                    if(bit == '1')
                        currentState = 'D';

                    break;
                }
                case 'C':{//if 1 -> loop on same state
                    if(bit == '0')
                        currentState = 'E';

                    break;
                }
                case 'D':{
                    if(bit == '0')//if 1 -> loop on same state
                        currentState = 'B';

                    break;
                }
                case 'E':{ //if 0 -> loop on same state
                    if(bit == '1')
                        currentState = 'C';

                    break;
                }
                default:{
                    System.out.println("Problem in reading input of problem 7");
                    break;
                }
            }
        }

        return finalStates.contains(currentState);
    }

    public static boolean problem8(String expression) {
        return problem8Recursive(expression, 0);
    }

    public static boolean problem8Recursive(String expression, int idx) {
        if (idx + 2 >= expression.length()) {
            return false;
        }
        if (expression.charAt(idx) == '0' && expression.charAt(idx + 1) == '1' && expression.charAt(idx + 2) == '0') {
            //System.out.println("Found 010 at index = " + idx);
            return true;
        }
        if (expression.charAt(idx) == '1' && expression.charAt(idx + 1) == '0' && expression.charAt(idx + 2) == '1') {
            //System.out.println("Found 101 at index = " + idx);
            return true;
        }
        return problem8Recursive(expression, idx + 1); // stay in initial state
    }


    public static boolean problem9(String expression) {
        // NFA: each 2 chars we go to the initial state
        return problem9Recursive(expression, 0);
    }

    public static boolean problem9Recursive(String expression, int idx) {


        if (idx + 1 >= expression.length()) { //expression ended
            return true; //it reached the final state properly without exiting early
        }
        if (expression.charAt(idx) == expression.charAt(idx + 1)) { //failed state
            return false;
        }
        return problem9Recursive(expression, idx + 1); //continue iterating on the string

//        if (expression.charAt(idx) == '0' && expression.charAt(idx + 1) == '1') {
//            return problem9Recursive(expression, idx +1);
//        }
//        else if (expression.charAt(idx) == '1' && expression.charAt(idx + 1) == '0') {
//            return problem9Recursive(expression, idx +1);
//        }
//        else return false;

    }

    public static boolean problem10(String expression) {
        return problem10Recursive(expression, 0);
    }

    public static boolean problem10Recursive(String expression, int idx) {
        if (expression.charAt(idx) == '0') { //must be followed by at least one 1
            if (idx + 1 >= expression.length()) //expression ended on a 0 , so it failed
                return false;
            if(expression.charAt(idx +1 )=='0') //found 2 consecutive zeros
                return false;
            else
                return problem10Recursive(expression , idx+1);//continue checking from initial state


        } else {
            if (idx + 1 >= expression.length()) //expression ended
                return true;

            else
                return problem10Recursive(expression , idx+1); // stay at initial state
        }

    }

}

