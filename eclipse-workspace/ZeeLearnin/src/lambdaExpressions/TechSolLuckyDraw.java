package lambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

public class TechSolLuckyDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing Even Employee Ids");
		List<Integer> lstEmpIds = new ArrayList<>();
		lstEmpIds.add(1);
		lstEmpIds.add(2);
		lstEmpIds.add(3);
		lstEmpIds.add(4);
		lstEmpIds.add(5);
		lstEmpIds.add(6);
		lstEmpIds.add(7);
		evaluate(lstEmpIds, (n) -> n % 2 == 0);
		System.out.println("Printing Odd Employee Ids");
		evaluate(lstEmpIds, (n) -> n % 2 == 1);
		System.out.println("Printing Employee Ids less than 5");
		evaluate(lstEmpIds, (n) -> n < 5);

	}
	
	public static void evaluate(List<Integer> lstEmpIds, Predicate<Integer> predicate) {
		for(int id : lstEmpIds) {
			if(predicate.test(id))
				System.out.println(id);
		}
	}
	
	//	Old Way
	/*
	public static void printEvenIds(List<Integer> lstEmpIds) {
		for(int id : lstEmpIds) {
			if(id % 2 == 0)System.out.println("Even Employee id: " + id);
		}
	}
	
	public static void printOddIds(List<Integer> lstEmpIds) {
		for(int id : lstEmpIds) {
			if(id % 2 != 0)System.out.println("Odd Employee id: " + id);
		}
	}
	*/

}
