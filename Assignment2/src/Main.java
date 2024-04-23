import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.FileHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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


        while (problemNumber != null){
            problemNumber = scanner.nextLine();
            switch (problemNumber.trim()){
                case "1" :{
                    writer.println("1");
                    functionCaller(Main::problem1 , "valid email" , "invalid email"); //calls function inside it
                    writer.println("x");
                    break;
                }
                case "2" :{
                    writer.println("2");
                    functionCaller(Main::problem2 , "valid phone number" , "invalid phone number");
                    writer.println("x");
                    break;
                }
                case "3" :{
                    writer.println("3");
                    functionCaller(Main::problem3 , "valid date" , "invalid date");
                    writer.println("x");
                    break;
                }
                case "4" :{

                }
                case "5" :{

                    break;
                }
                case "6" :{

                    break;
                }
                case "7" :{
                    break;
                }
                case "8" :{
                    break;
                }
                case "9" :{
                    break;
                }
                case "10" :{
                    break;
                } default:{
                    System.out.println("Could not read properly from file!");
                            writer.close();
                    return;
                }
            }
        }
        writer.close();
    }

    //calls function inside it , instead of repeating loop code in every case
    public static void functionCaller(Predicate<String> problemFunction , String acceptString ,String rejectString) throws IOException {
        String input ="";
        while (scanner.hasNextLine() && !(input = scanner.nextLine()).equals("end")){
            if(problemFunction.test(input)){ //calls function
                writer.println(acceptString);
            }else{
                writer.println(rejectString);
            }
        }
    }
    public static boolean match(String regex,String expression){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);

        if ( matcher.matches()) {
            return true;
        }
        return false;
    }

    public static boolean problem1(String expression){
        return false;
    }
    public static boolean problem2(String expression){
        return false;
    }
    public static boolean problem3(String expression){
        return false;
    }
    public static boolean problem4(String expression){
        return false;
    }
    public static boolean problem5(String expression){
        return false;
    }
    public static boolean problem6(String expression){
        return false;
    }
    public static boolean problem7(String expression){
        return false;
    }
    public static boolean problem8(String expression){
        return false;
    }
    public static boolean problem9(String expression){
        return false;
    }
    public static boolean problem10(String expression){
        return false;
    }
}

