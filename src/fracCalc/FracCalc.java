package fracCalc;
import java.util.Scanner;

//public class javatest3 {
//    static int num1 = 0;
//    static int num2 = 0;
//    static int denom1 = 0;
//    static int denom2 = 0;
//    public static void main(String[] args){
//    System.out.println("Enter an expression (or \"quit\"): "); //prompts user for input
//    intro();
//
//}
    
public class FracCalc {

    public static void main(String[] args) 
    {
    	
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner scan = new Scanner(System.in);
    	scan.nextLine();
    	String str = "";
    	str = scan.next();
    	scan.close();
    	//int n1 = Integer.parseInt(str);
    	String[] parts = str.split("\\s+");
    	String part1 = parts[0];
    	String part2 = parts[1];
    	String part3 = parts[2];
    	
    	System.out.println(part1);
    	System.out.println(part2);
    	System.out.println(part3);
    	
    	
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
