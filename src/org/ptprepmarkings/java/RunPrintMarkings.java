package org.ptprepmarkings.java;

class Example{
	
	public Example() {
		// TODO Auto-generated constructor stub
		PrintMarkings.PrintMaru("Example");
	}
	
	void run() {
		
		boolean condition1 = false;
		boolean condition2 = false;
		int maxNum = 10;
		
		PrintMarkings.PrintIfElseIfElseConditionTorF("if(condition1)", condition1, condition2 );
		if(condition1) {
			
		}
		else if(condition2) {
			
		}
		else {
			
		}
		
//		PrintMarkings.PrintTF();
//		for(int num = 0; num < maxNum ; num++) {
//			
//		}
//		
//		int next = 1;
//		PrintMarkings.PrintLoopConditionTForF(next < maxNum, "while(next < maxNum)");
//		while(next < maxNum) {
//			next++;
//		}
	}
}

public class RunPrintMarkings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example ex = new Example();
		ex.run();
		
	}

}
