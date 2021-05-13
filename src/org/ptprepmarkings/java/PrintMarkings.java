package org.ptprepmarkings.java;

public class PrintMarkings {
	
	public static void PrintMaru() { 
		PrintMaru("");
	}
	public static void PrintMaru(String str) {
		System.out.println("œ" + (str.length() > 0 ? " : " + str : "" ));
	}
	
	public static void PrintException() {
		PrintException("");
	}
	
	public static void PrintException(String str) {
		System.out.println("E" + (str.length() > 0 ? " : " + str : "" ));
	}
	
	public static void PrintTF() {
		PrintTF("");
	}
	
	public static void PrintTF(String str) {
		System.out.println("T/F" + (str.length() > 0 ? " : " + str : "" ));
	}
	
	public static void PrintIfConditionTorF(boolean condition) {
		PrintIfConditionTorF("", condition);
	}
	
	public static void PrintIfConditionTorF(String str, boolean condition) {
		System.out.print(condition ? "T" : "F");
		System.out.println((str.length() > 0 ? " : " + str : "" ));
	}
	
	
	public static void PrintIfElseConditionTorF(boolean condition) {
		PrintIfElseConditionTorF("", condition);
	}
	
	public static void PrintIfElseConditionTorF(String str, boolean condition) {
		System.out.print(condition ? "T" : "F");
		System.out.println((str.length() > 0 ? " : " + str : "" ));
		System.out.print(!condition ? "T" : "");
		System.out.println((str.length() > 0 && !condition ? " : " + "else" : "" ));
	}
	
	
	public static void PrintIfElseIfElseConditionTorF(String str, Boolean... condition) {
		int countTrueCondition = 0;
		for(int index = 0 ; index < condition.length; index++) {
			countTrueCondition = (condition[index] == Boolean.FALSE) ? countTrueCondition + 1 : countTrueCondition + 0;
			System.out.println(condition[index] ? "T" : "F");
		}
		
		if (countTrueCondition == condition.length) {
			System.out.println("T" + (str.length() > 0 ? " : " + "else" : "" ));
		}
	}
	
	
	public static void PrintLoopConditionTForF(boolean condition) {
		System.out.println(condition ? "T/F" : "F");
	}
	
	public static void PrintLoopConditionTForF(boolean condition, String str) {
		System.out.print(condition ? "T/F" : "F");
		System.out.println((str.length() > 0 ? " : " + str : "" ));
	}

}
