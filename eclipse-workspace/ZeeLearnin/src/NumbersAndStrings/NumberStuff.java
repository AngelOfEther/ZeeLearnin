package NumbersAndStrings;

public class NumberStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "42";
		int myInt = 63;
		Integer objInt = null;
		
		System.out.println("objInt:"+objInt.valueOf(myInt));
		
		int myIntFromString = 0;
		
		
		myIntFromString = Integer.parseInt(myString); 		// Same as: myIntFromString = objInt.parseInt(myString);
		System.out.println("myIntFromString:"+myIntFromString);
		
		Integer anotherObjInt = 11;
		String myStringFromInt = Integer.valueOf(myInt+37).toString();
		
		System.out.println("anotherObjInt:"+anotherObjInt);
		System.out.println("myStringFromInt:"+myStringFromInt);
		
		System.out.println(objInt.valueOf(myInt).getClass().getName());
		
		String s = Integer.valueOf(myInt).getClass().getName();
		
		char letter = 't';
		
		int index = s.indexOf(letter);
		
		System.out.println("The index of "+letter+" in "+s+" is "+index);

	}

}
