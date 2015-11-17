package fracCalc;

import java.util.Scanner;

public class javatest3 {
    static int num1 = 0;
    static int num2 = 0;
    static int denom1 = 0;
    static int denom2 = 0;
    public static void main(String[] args){
    System.out.println("Enter an expression (or \"quit\"): "); //prompts user for input
    intro();

}

    public static void intro(){
        Scanner input = new Scanner(System.in); 
        String user= input.nextLine();
        while (!user.equals("quit") & input.hasNextLine()){ //processes code when user input does not equal quit
            StringTokenizer chunks = new StringTokenizer(user, " "); //parses by white space
            String fraction1 = chunks.nextToken(); //first fraction
            String operand = chunks.nextToken(); //operator 
            String fraction2 = chunks.nextToken(); //second fraction
            System.out.println("Fraction 1: " + fraction1); 
            System.out.println("Operation: " + operand); 
            System.out.println("Fraction 2: " + fraction2); 
            System.out.println("Enter an expression (or \"quit\"): "); //prompts user for more input

            while (user.contains("*")){
                parse(fraction1);
                parse(fraction2);
                System.out.println("hi");
                int num = num1 * num2;
                int denom = denom1 * denom2;
                System.out.println(num + "/" + denom);
                user = input.next();

            }
    
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner scan = new Scanner(System.in);
    	scan.nextLine();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
