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
    public static String[] Raft(String str){   //I used this kind of Function after you had told Joel
    										   //that making the Split code be written only once but
    										   //accessed multiple times would be a lot smarter
    	if(str.contains("_")) {
    		wholeNum = str.substring(0, str.indexOf("_"));
        	numerator = str.substring(str.indexOf("_") + 1, str.indexOf("/"));
        	denominator = str.substring(str.indexOf("/") + 1);
    	} else {
    		if(str.contains("/")) {
    		wholeNum = "0";
        	numerator = str.substring(str.indexOf("_") + 1, str.indexOf("/"));
        	denominator = str.substring(str.indexOf("/") + 1);
    		} else {
    			wholeNum = str;
    			numerator = "0";
    			denominator = "1";	
    		}
    	}
    	OutputSplit[0] = wholeNum;
    	OutputSplit[1] = numerator;
    	OutputSplit[2] = denominator;
      	return OutputSplit;
    } //String[] answers = {"whole", "numerator" , "denominator"};
    
    
    
   // if(TotalDen > GCFDen){
    	//Add 1 to Whole and subtract GCF from TotalDen and the Difference is the New Denominator
   // } else if(TotalDen == GCFDen){
    	//Add 1 to Whole 
    //}
    
    static int OperationInt; 
    static int FinDem;
    static int FinNum;
    static int FinWhole;
    static String[] Fraction1st = new String[3];  
    static String[] Fraction2nd = new String[3];
    
    public static String produceAnswer(String str)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String Operation = "";
    	String[] chickenOnARaft = str.split(" ");
    //	String parts = str.substring(str.lastIndexOf(" ") + 1);
    	OutputSplit = Raft(chickenOnARaft[0]);
    	Fraction1st[0] = OutputSplit[0];
    	Fraction1st[1] = OutputSplit[1];
    	Fraction1st[2] = OutputSplit[2];
    	OutputSplit = Raft(chickenOnARaft[1]);
    	String Operator = OutputSplit[0];
    	OutputSplit = Raft(chickenOnARaft[2]);
    	Fraction2nd[0] = OutputSplit[0];
    	Fraction2nd[1] = OutputSplit[1];
    	Fraction2nd[2] = OutputSplit[2];
    	System.out.println("1" + Operator + "2");
    	if(Operator.contains("+")){
    		Operation = "Addition";
    		OperationInt = 1;
    	}
    	if(Operator.contains("-")) {
    		Operation = "Subtraction";
    		OperationInt = 2;
    	}
    	if(Operator.contains("*")) {
    		Operation = "Multiplication";
    		OperationInt = 3;
    	}
    	if(OperationInt == 0) {
    		Operation = "Division";
    		}
    	System.out.println(Operation);
    	String[] AnswerFrac = new String[3];
    	AnswerFrac = Calculator();
    	System.out.println(AnswerFrac[0]);
    	if(AnswerFrac[1].equals(AnswerFrac[2])){
    		System.out.print("Operation: " + Operation + "\n" + "1st Whole: " + Fraction1st[0] + " " + "1st Numerator: " + Fraction1st[1] + " " + "1st Denominator: " + Fraction1st[2] + "\n" +  "2nd whole: " + Fraction2nd[0] + " " + "2nd numerator: " + Fraction2nd[1] + " " + "2nd denominator: " + Fraction2nd[2] + "\n");
    	return AnswerFrac[0];
    	} else {if(AnswerFrac[0].equals("0")) {
    		System.out.print( "Operation: " + Operation + "\n" + "1st Whole: " + Fraction1st[0] + " " + "1st Numerator: " + Fraction1st[1] + " " + "1st Denominator: " + Fraction1st[2] + "\n" +  "2nd whole: " + Fraction2nd[0] + " " + "2nd numerator: " + Fraction2nd[1] + " " + "2nd denominator: " + Fraction2nd[2] + "\n");
    	return AnswerFrac[1] + "/" + AnswerFrac[2];
    	} else {
    		System.out.println("Operation: " + Operation + "\n" + "1st Whole: " + Fraction1st[0] + " " + "1st Numerator: " + Fraction1st[1] + " " + "1st Denominator: " + Fraction1st[2] + "\n" +  "2nd whole: " + Fraction2nd[0] + " " + "2nd numerator: " + Fraction2nd[1] + " " + "2nd denominator: " + Fraction2nd[2] + "\n");
    	return AnswerFrac[0] + "_" + AnswerFrac[1] + "/" + AnswerFrac[2];
    	}
    	}
    }

    public static String[] Calculator()
    {
    String[] FractionFinStr = new String[3];
    int[] Fraction1stInt = new int[3];
    int[] Fraction2ndInt = new int[3];
    int NumCal = 0;
    int DenCal = 0;
    int WholeCal = 0;
    int NumMixed1 = 0;
    int NumMixed2 = 0;
    int DenMixed = 0;
    Fraction1stInt[0] = Integer.parseInt(Fraction1st[0]);
    Fraction1stInt[1] = Integer.parseInt(Fraction1st[1]);
    Fraction1stInt[2] = Integer.parseInt(Fraction1st[2]);
    Fraction2ndInt[0] = Integer.parseInt(Fraction2nd[0]);
    Fraction2ndInt[1] = Integer.parseInt(Fraction2nd[1]);
    Fraction2ndInt[2] = Integer.parseInt(Fraction2nd[2]);

    if(OperationInt == 1){ //Addition
    	WholeCal = Fraction1stInt[0] + Fraction2ndInt[0];
    	if(Fraction1stInt[2] == Fraction2ndInt[2]){
    		NumCal = Fraction1stInt[1] + Fraction2ndInt[1];
    		DenCal = Fraction2ndInt[2];
    	} else {
    		NumMixed1 = Fraction1stInt[1] * Fraction2ndInt[2] + (Fraction1stInt[0] / Fraction1stInt[2]);
    		NumMixed2 = Fraction2ndInt[1] * Fraction1stInt[2] + (Fraction2ndInt[0] / Fraction2ndInt[2]);
    		DenMixed = Fraction2ndInt[2] * Fraction2ndInt[2];
    		NumCal = NumMixed1 + NumMixed2;
    		DenCal = DenMixed;
    		while(Math.abs(NumCal) > Math.abs(DenCal)){
    			NumCal = NumCal - DenCal;
    			WholeCal = WholeCal + 1;
    		}
    	}
    //	if(NumCal > DenCal){
    	//	WholeCal = NumCal / DenCal; ///////////////////////////////////////////////////////////////
    	//} else if(NumCal == DenCal){
    	//	WholeCal = WholeCal + 1;
    	//	NumCal = 0;
    	//	DenCal = 0;
    	//}
    //abs Num < abs Den
    }
    if(OperationInt == 2){ //Subtraction
    	WholeCal = Fraction1stInt[0] - Fraction2ndInt[0];
    	if(Fraction1stInt[2] == Fraction2ndInt[2]){
    		NumCal = Fraction1stInt[1] - Fraction2ndInt[1];
    		DenCal = Fraction1stInt[2];
    	} else {
    		NumMixed1 = Fraction1stInt[1] * Fraction2ndInt[2] + (Fraction1stInt[0] / Fraction1stInt[2]);
    		NumMixed2 = Fraction2ndInt[1] * Fraction1stInt[2] + (Fraction2ndInt[0] / Fraction2ndInt[2]);
    		DenMixed = Fraction2ndInt[2] * Fraction2ndInt[2];
    		NumCal = NumMixed1 - NumMixed2;
    		System.out.println("");
    		System.out.println(NumCal);
    		DenCal = DenMixed;
    		while(Math.abs(NumCal) > Math.abs(DenCal)){
    			NumCal = NumCal - DenCal;
    			WholeCal = WholeCal + 1;
    		}
    	}
    }
    if(OperationInt == 3){ //Multiplication 
    	//WholeCal = Fraction1stInt[0] + Fraction2ndInt[0];
    	WholeCal = 0;
    	NumMixed1 = Fraction1stInt[1] + Fraction1stInt[0] * Fraction1stInt[2];
    	System.out.println("");
    	System.out.println(NumMixed1);
		NumMixed2 = Fraction2ndInt[1] + Fraction2ndInt[0] * Fraction2ndInt[2];
		System.out.println(NumMixed2);
		System.out.println("Num2 ^");
		DenMixed = Fraction1stInt[2] * Fraction2ndInt[2];
		NumCal = NumMixed1 * NumMixed2;
		DenCal = DenMixed;
		while(Math.abs(NumCal) > Math.abs(DenCal)){
			NumCal = NumCal - DenCal;
			WholeCal = WholeCal + 1;
		}
    }
    if(OperationInt == 0){ //Division
    	System.out.println("Test");
    	WholeCal = 0;
    	if(Fraction1stInt[2] == 0){
    		Fraction1stInt[2] = 1;
    	}
    	if(Fraction2ndInt[2] == 0){
    		Fraction2ndInt[2] = 1;
    	}
    		
    	NumMixed1 = Fraction1stInt[1] + Fraction1stInt[0] * Fraction1stInt[2];
    	System.out.println("");
    	System.out.println(NumMixed1);
		NumMixed2 = Fraction2ndInt[1] + Fraction2ndInt[0] * Fraction2ndInt[2];
		System.out.println(NumMixed2);
		System.out.println("Num2 ^");
		//DenMixed = Fraction1stInt[2] * Fraction2ndInt[2];
		NumCal = NumMixed1 * Fraction2ndInt[2];
		DenCal = NumMixed2 * Fraction1stInt[2];
		while(Math.abs(NumCal) > Math.abs(DenCal)) {
			NumCal = NumCal - DenCal;
			WholeCal = WholeCal + 1;
		}	
    }
    int[] FinCal = new int[2];
    if(DenCal != 0){
    FinCal = ReduceFraction(NumCal, DenCal);
    } else {
    	DenCal = DenCal + 1;
    	FinCal = ReduceFraction(NumCal, DenCal);
    	//FinCal[0] = NumCal;
    	//FinCal[1] = DenCal;
    }
    	if(FinCal[0] == FinCal[1]){
    		WholeCal = WholeCal + 1;
    		FractionFinStr[0] = "" + WholeCal;
    	} else if(WholeCal == 0){
    	FractionFinStr[0] = "0";
    	} else {
    	FractionFinStr[0] = WholeCal + "";
    	}
    if(FinCal[0] == 0 && FinCal[1] == 1 ){
    	FinCal[1] = 0;
    }
    FractionFinStr[1] = "" + FinCal[0];
    FractionFinStr[2] = "" + FinCal[1];
    return FractionFinStr;
    }
    
    public static int GCF(int NumCal, int DenCal) {
    	while (DenCal > 0)
    	{
    		int temp = DenCal;
    		DenCal = NumCal % DenCal;
    		NumCal = temp;
    	}
    	return NumCal;
    }
    
    public static int[] ReduceFraction(int NumCal, int DenCal){
    	int gcf = GCF(NumCal, DenCal);
    	int[] rf = {NumCal/gcf, DenCal/gcf};
    	return rf;
    	}
    	
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    













