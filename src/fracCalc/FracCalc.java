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
    	String str = scan.nextLine();
    	System.out.print(produceAnswer(str));
    	
    	//int n1 = Integer.parseInt(str);
    	
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    static String wholeNum = "";
	static String numerator = "";
	static String denominator = "";
	static String[] OutputSplit = new String[3];
    public static String[] Raft(String str){
    	if(str.contains("_")) {
    		wholeNum = str.substring(0, str.indexOf("-"));
        	numerator = str.substring(str.indexOf("_") + 1, str.indexOf("/"));
        	denominator = str.substring(str.indexOf("/") + 1);
    	} else if(str.contains("/")) {
    		wholeNum = "0";
        	numerator = str.substring(str.indexOf("_") + 1, str.indexOf("/"));
        	denominator = str.substring(str.indexOf("/") + 1);
    	} else {
    		wholeNum = str;
        	numerator = "0";
        	denominator = "1";	
    	}
    	OutputSplit[0] = wholeNum;
    	OutputSplit[1] = numerator;
    	OutputSplit[2] = denominator;
    	return OutputSplit;
    }
    
    
    
    public static String produceAnswer(String str)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String[] chickenOnARaft = str.split(" ");
    	String parts = str.substring(str.lastIndexOf(" ") + 1);
    	OutputSplit = Raft(chickenOnARaft[1]);
    	OutputSplit = Raft(chickenOnARaft[2]);
    	String wholeNumb = OutputSplit[0];
    	String Num = OutputSplit[1];
    	String Deno = OutputSplit[2];
    	
    	return "whole: " + wholeNumb + " " + "numerator: " + Num + " " + "denominator: " + Deno; 
    	
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}

